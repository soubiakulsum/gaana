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

        videoModel ob12 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20MS%20Dhoni%20Returns%20%20KGF%20Version%20%20Whatsapp%20Status_360p.mp4?alt=media&token=eb8dcdc4-5114-48f7-b5ca-9df9fe323dcf","MS Dhoni Returns KGF","289.9M Views");
        videos.add(ob12);


        videoModel ob0 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/Pawari%20ho%20rhi%20hai.mp4?alt=media&token=c70f00bd-3d35-4525-9a03-0fe7125130e4","Pawari Ho rhi hai \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","250.9M Views");
        videos.add(ob0);

        videoModel ob1 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Arijit%20singh%20heart%20touchingsong%20statusArijit%20singh%20WhatsApp%20status%20Aye%20khuda%20%20By%20THE%20BHARTI_360p.mp4?alt=media&token=95a6b64a-6d41-4fe3-bd4d-8c885ad8aadd","Aye Khuda Jo Bana Tu","450.9M Views");
        videos.add(ob1);

        videoModel ob2 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Tu%20chale%20sang%20chale%20song%20whatsapp%20status%20%20nature%20whatsapp%20status_360p.mp4?alt=media&token=c387fd3f-cb6d-4826-b64e-d6a9006b7966","Tu Chale chal sabhi Chale","11.9M Views");
        videos.add(ob2);

        videoModel ob13 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Abe%20Gaand%20Na%20Fulao%20Maa%20chod%20Denge%20tumhari%20bsdk%20%20mirzapur%20%20Maa%20Chod%20Denge%20Tumhari%20Meme%20clip_360p.mp4?alt=media&token=aaea1734-ae0c-438a-bde2-dd194f4abe09","Guddu Bhaiya Funny Dialog \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","1.9M Views");
        videos.add(ob13);


        videoModel ob7 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Pane%20ki%20chahat%20me%20kho%20gayaWhatsapp%20statusphir%20chala%20song%20statusjubin%20nautariyal%20songImran%20status_360p.mp4?alt=media&token=c8cb0f68-83f4-4198-abe4-836c48bbf8ce","Paane Ki Chaahat","4.9M Views");
        videos.add(ob7);
        videoModel ob4 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/Tommy%20_%20Feelings%20_%20Dialogue%20with%20Beats%20_%20Yashraj%20Mukhate%20_%20Shehnaaz%20Gill%20_%20Bigg%20Boss%20(2).mp4?alt=media&token=d78f6711-bd01-4fec-929d-eeab30c0cf27","Sadda Kutta Tommy","1.9M Views");
        videos.add(ob4);


        videoModel ob8 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Beautiful%20english%20whats%20app%20status%20forever%20%20English%20song%20status_360p.mp4?alt=media&token=cda88f1b-9148-4f11-8c41-5321f4c08bc7","Love Me Like You do","1.9M Views");
        videos.add(ob8);

        videoModel ob5 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Marshmallow%20alone%20dance%20status%20forever%20%20English%20song%20status_360p.mp4?alt=media&token=fc9f912e-ddf9-4eaa-b046-fc65fefb7307","Marshmallow alone dance","1.9M Views");
        videos.add(ob5);

        videoModel ob6 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Alan%20Walker%20%20The%20spectre%20music%20status%20%20English%20song%20status_360p.mp4?alt=media&token=84bde0a0-3bd2-45e8-84ec-d2be1b4da330","Alan Walker The spectre music","1.9M Views");
        videos.add(ob6);

        videoModel ob9 = new videoModel("https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Khesari%20lal%20Yadav%20new%20bhojpuri%20song%20whatsapp%20status%20video%202020%20%20bhojpuri%20hit%20song%20bhojpuri%20status_480p.mp4?alt=media&token=a7e29778-4557-4365-a276-7fff48827069","Kesari Lal Bhojpuri","1.9M Views");
        videos.add(ob9);


        viewPager2.setAdapter(new VideoAdapter(videos));




    }
}