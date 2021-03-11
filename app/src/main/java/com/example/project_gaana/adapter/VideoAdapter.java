package com.example.project_gaana.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_gaana.DataModel.videoModel;
import com.example.project_gaana.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.myviewholder> {


    ArrayList<videoModel> videos;

    public VideoAdapter(ArrayList<videoModel> videos) {
        this.videos = videos;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_video_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.setdata(videos.get(position));

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        VideoView videoView;
        TextView title,desc;
        ProgressBar pbar;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            videoView=itemView.findViewById(R.id.VideoView);
            title=itemView.findViewById(R.id.textVideoTitle);
            desc=itemView.findViewById(R.id.textVideoDescription);
            pbar=itemView.findViewById(R.id.videoProgressBar);

            title.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            title.setSelected(true);

            desc.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            desc.setSelected(true);



        }

        void setdata(videoModel obj) {

            videoView.setVideoPath(obj.getUrl());
            title.setText(obj.getTitle());
            desc.setText(obj.getDesc());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                  pbar.setVisibility(View.INVISIBLE);
                    mediaPlayer.start();

                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {

                    mediaPlayer.start();

                }
            });

        }
    }
}
