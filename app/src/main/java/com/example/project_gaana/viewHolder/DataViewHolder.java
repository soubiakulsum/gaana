package com.example.project_gaana.viewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_gaana.R;
import com.example.project_gaana.OnClickListener;
import com.example.project_gaana.R;
import com.example.project_gaana.ResultsItem;

public class DataViewHolder extends RecyclerView.ViewHolder {

    private TextView title, id;
   private ImageView Image;
   private ImageView btnPlay;
   private ImageView btnPause;
   private Button btnDelete;
    private OnClickListener onClickListener;
    int playing;

    public DataViewHolder(@NonNull View itemView, OnClickListener onClickListener) {
        super(itemView);
        this.onClickListener=onClickListener;

        id = itemView.findViewById(R.id.id);
        title = itemView.findViewById(R.id.title);
        Image = itemView.findViewById(R.id.trackImage);
        btnPlay = itemView.findViewById(R.id.btnPlay);
        btnPause = itemView.findViewById(R.id.btnPause);
        btnDelete = itemView.findViewById(R.id.btnDelete);
    }

    public void setData(int pos, ResultsItem response) {
        id.setText(response.getArtistName());
        title.setText(response.getTrackName());
        Glide.with(Image).load(response.getArtworkUrl100()).into(Image);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPlay.setVisibility(View.GONE);
                btnPause.setVisibility(View.VISIBLE);

                playing=pos;
                onClickListener.playMusic(pos,response);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnPause.setVisibility(View.GONE);
                btnPlay.setVisibility(View.VISIBLE);

                if(playing == pos) {
                    onClickListener.pauseMusic();
                }
                playing=-1;
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing==-1){
                    onClickListener.delete(pos);
                }
                else if(playing==pos){
                    playing=-1;
                    onClickListener.pauseMusic();
                    onClickListener.delete(pos);
                }
                else
                {
                    onClickListener.delete(pos);
                }
                Toast.makeText(v.getContext(), response.getTrackName()+" is deleted",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
