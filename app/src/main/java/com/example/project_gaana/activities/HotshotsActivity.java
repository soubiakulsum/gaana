package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.project_gaana.DataModel.videoModel;
import com.example.project_gaana.R;
import com.example.project_gaana.adapter.VideoAdapter;

import java.util.ArrayList;

public class HotshotsActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    ArrayList<videoModel> videos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotshots);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        viewPager2= findViewById(R.id.viewpager);

        videos=new ArrayList<>();

        videoModel ob12 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20MS%20Dhoni%20Returns%20%20KGF%20Version%20%20Whatsapp%20Status_360p.mp4?alt=media&token=83953263-f0a8-4532-a34e-dbe10e778aed","MS Dhoni Returns KGF","289.9M Views");
        videos.add(ob12);


        videoModel ob0 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Pawri%20Hori%20Hai%20%20Yashraj%20Mukhate%20%20Dialogue%20With%20Beats_v240P.mp4?alt=media&token=7d993e4d-2cf5-4036-9e1c-c17d4ff2eefc","Pawari Ho rhi hai \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","250.9M Views");
        videos.add(ob0);

        videoModel ob1 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Arijit%20singh%20heart%20touchingsong%20statusArijit%20singh%20WhatsApp%20status%20Aye%20khuda%20%20By%20THE%20BHARTI_360p.mp4?alt=media&token=4f865b80-2818-4791-8b99-a507746e18a2","Aye Khuda Jo Bana Tu","450.9M Views");
        videos.add(ob1);

        videoModel ob2 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Tu%20chale%20sang%20chale%20song%20whatsapp%20status%20%20nature%20whatsapp%20status_360p.mp4?alt=media&token=c0ac13ef-4254-4327-9281-bb6baa332809","Tu Chale chal sabhi Chale","11.9M Views");
        videos.add(ob2);

        videoModel ob13 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Abe%20Gaand%20Na%20Fulao%20Maa%20chod%20Denge%20tumhari%20bsdk%20%20mirzapur%20%20Maa%20Chod%20Denge%20Tumhari%20Meme%20clip_360p.mp4?alt=media&token=65f57e19-b201-4371-a802-62f8ab2bc6ef","Guddu Bhaiya Funny Dialog \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","1.9M Views");
        videos.add(ob13);


        videoModel ob7 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Pane%20ki%20chahat%20me%20kho%20gayaWhatsapp%20statusphir%20chala%20song%20statusjubin%20nautariyal%20songImran%20status_360p.mp4?alt=media&token=e46fd1d3-6de2-4106-a7a6-590d83932dcc","Paane Ki Chaahat","4.9M Views");
        videos.add(ob7);
        videoModel ob4 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Tommy%20%20Feelings%20%20Dialogue%20with%20Beats%20%20Yashraj%20Mukhate%20%20Shehnaaz%20Gill%20%20Bigg%20Boss_360p%20(1).mp4?alt=media&token=b34f0faa-3d58-4055-80b9-4569fc476fb7","Sadda Kutta Tommy","1.9M Views");
        videos.add(ob4);


        videoModel ob8 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Beautiful%20english%20whats%20app%20status%20forever%20%20English%20song%20status_360p.mp4?alt=media&token=c289a58b-2345-44ae-b7d5-07340c48e429","Love Me Like You do","11.3M Views");
        videos.add(ob8);

        videoModel ob5 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Marshmallow%20alone%20dance%20status%20forever%20%20English%20song%20status_360p.mp4?alt=media&token=e4996825-bfa1-47e6-9db2-8cb47173263d","Marshmallow alone dance","17.69M Views");
        videos.add(ob5);

        videoModel ob6 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Alan%20Walker%20%20The%20spectre%20music%20status%20%20English%20song%20status_360p.mp4?alt=media&token=d9dc73c5-5dc6-4d2a-a577-c5ba2395c8c6","Alan Walker The spectre music","1.93M Views");
        videos.add(ob6);

        videoModel ob9 = new videoModel("https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Khesari%20lal%20Yadav%20new%20bhojpuri%20song%20whatsapp%20status%20video%202020%20%20bhojpuri%20hit%20song%20bhojpuri%20status_480p.mp4?alt=media&token=a2eb2635-1e6e-4f14-9e48-ee9c3827474a","Kesari Lal Bhojpuri","1.92M Views");
        videos.add(ob9);


        viewPager2.setAdapter(new VideoAdapter(videos));




    }
}