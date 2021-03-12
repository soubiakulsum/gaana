package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.R;
import com.example.project_gaana.buzz.Buzz;
import com.example.project_gaana.buzz.BuzzAdapter;

import java.util.ArrayList;
import java.util.List;

public class BuzzFragment extends Fragment {

    private List<Buzz> buzzList = new ArrayList<>();
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buzz, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.rvRecyclerView);
        BuildRecyclerData();
        setRecyclerAdapter();
    }


    private void BuildRecyclerData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        BuzzAdapter buzzAdapter = new BuzzAdapter(buzzList);
        mRecyclerView.setAdapter(buzzAdapter);
    }

    private void setRecyclerAdapter() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                buzzList.add(new Buzz("2.4k", "1 hours ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Akshay%20kumar%20%20killer%20attitude%20dialogues%20status%20%20attitude%20dialogue%20whatapp%20statusattitude%20dialogue_480p.mp4?alt=media&token=cb5ea100-60b0-44f9-9e92-68d0dd535d4a"));
            } else if (i % 10 == 0) {
                buzzList.add(new Buzz("1.4k", "3 hours ago", "If sources are to be believed Deepika Padukone is the team’s first choice to play Sita. Interestingly Deepika is also up for the role" +
                        " of Sita in a massive feature film to be directed by Nitish Tiwari.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Mahesh%20Babu%20as%20Ram%20%20Deepika%20Padukone%20as%20Sita%20%20Hrithik%20Roshan%20as%20Ravan%20%20Ramayan%20Upcoming%20Movie_360p.mp4?alt=media&token=07aa696c-39d6-4f76-bc54-5cd0b2de070a"));
            } else if (i % 10 == 1) {
                buzzList.add(new Buzz("3.5k", "9 hours ago",
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today"
                        , "View  Gallery","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Coronavirus%20%E0%A4%B8%20%E0%A4%A1%E0%A4%B0%20Alia%20Bhatt%20%20Bollywood%20Joins%20Fight%20Against%20Corona%20Virus%20%20Mahesh%20Bhatt_360p.mp4?alt=media&token=1479253a-9bb9-4976-9599-010cf5b75175"));
            } else if (i % 10 == 2) {
                buzzList.add(new Buzz("5k", "1 days ago", "\n" +
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 15:50 IST\n" +
                        "Earlier this week, actor Ranbir Kapoor and filmmaker Sanjay Leela Bhansali " +
                        "tested positive for COVID-19. Soon after Alia Bhatt went into home quarantine as she was working " +
                        "with Kapoor in " +
                        "Brahmastra and with Bhansali for Gangubai Kathiawadi. She even got herself tested for COVID-19.", "know more","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Coronavirus%20%E0%A4%B8%20%E0%A4%A1%E0%A4%B0%20Alia%20Bhatt%20%20Bollywood%20Joins%20Fight%20Against%20Corona%20Virus%20%20Mahesh%20Bhatt_360p.mp4?alt=media&token=1479253a-9bb9-4976-9599-010cf5b75175"));
            } else if (i % 10 == 3) {
                buzzList.add(new Buzz("4.2k", "1 days ago", "\n" +
                        "Amitabh Bachchan and Emraan Hashmi starrer Chehre’s release preponed; to now release on April 9\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 11:48 IST\n" +
                        "The makers of Amitabh Bachchan and Emraan Hashmi starrer Chehre have preponed the " +
                        "release date of the film. The film which was earlier scheduled to" +
                        " be released on April 30 will now hit the theatres on April 9.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Why%20Did%20Emraan%20Hashmi%20Miss%20The%20Chance%20To%20Work%20With%20Amitabh%20Bachchan%20%20Bollywood%20Gossip_360p.mp4?alt=media&token=f2ff768a-4455-4736-94f7-4436aa3b98db"));
            } else if (i % 10 == 4) {
                buzzList.add(new Buzz("1k", "3 days ago", "\n" +
                        "BREAKING: Akshay Kumar’s Sooryavanshi to release on April 30; announcement this Sunday" +
                        " with launch of a new poster?\n" +
                        "ByFenil SetaUpdated: Mar 11, 2021 - 11:34 IST\n" +
                        "Bollywood Hungama had yesterday reported that the much awaited flick, Sooryavanshi, " +
                        "directed by Rohit Shetty, won’t be able to make it in cinemas on April 2, as planned. The decision" +
                        " was taken by its makers due to the rising cases of " +
                        "Coronavirus in the country, particularly in the crucial centres of Maharashtra.", "View  Gallery","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Sooryavanshi%20%20Official%20Trailer%20Akshay%20%20Ajay%20%20Ranveer%20%20Katrina%20%20%20Rohit%20Shetty%20Coming%20soon%202020_360p.mp4?alt=media&token=fd1fee6b-9781-4eb6-abf4-43238731695c"));
            } else if (i % 10 == 5) {
                buzzList.add(new Buzz("925 Views", "2 days ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Akshay%20kumar%20%20killer%20attitude%20dialogues%20status%20%20attitude%20dialogue%20whatapp%20statusattitude%20dialogue_480p.mp4?alt=media&token=cb5ea100-60b0-44f9-9e92-68d0dd535d4a"));
            } else if (i % 10 == 6) {
                buzzList.add(new Buzz("1k", "4 days ago", "\n" +
                        "Kangana Ranaut meets I&B Minister Prakash Javadekar; says they discussed ‘discrimination’ against women and outsiders in the film industry\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 12:07 IST\n" +
                        "Bollywood actor Kangana Ranaut on Wednesday met Information and Broadcasting Minister Prakash Javadekar post the shoot of her upcoming film Tejas in Delhi. At the meet, she raised the issue of \"discrimination\" against artistes form outside the film industry.", "View  Gallery","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Kangana%20Ranaut%20meets%20IB%20minister%20discusses%20discrimination%20in%20Bollywood_360p.mp4?alt=media&token=fc2c5585-ac35-40be-ab52-09b4c143a645"));
            } else if (i % 10 == 7) {
                buzzList.add(new Buzz("6k", "6 days ago", "\n" +
                        "Bollywood Hungama had yesterday reported that the much awaited flick, Sooryavanshi, directed by Rohit Shetty, won’t be able to make it in cinemas on April 2, as planned. The decision was taken by its makers due to the rising cases of Coronavirus in the country, particularly in the crucial centres of Maharashtra.\n" +
                        "\n" +
                        "#Akshay KumarBREAKING: Akshay Kumar’s Sooryavanshi to release on April 30; announcement this Sunday with launch of a new poster?\n" +
                        "\n" +
                        "Ram SetuBachchan PandeyBachchan PandeyBachchan PandeyBachchan PandeyBachchan PandeyBachchan PandeyBachchan Pandey\n" +
                        "Next\n" +
                        "The buzz in the exhibitor fraternity is that the Akshay Kumar starrer will now arrive four weeks later than the planned original date, on April 30, 2021. A source says, “The exhibitors have been informed about this new release date. They have been told to book screens for Sooryavanshi. The plan is to give it one of the widest releases ever for a Hindi film.” The source also added, “The formal announcement of the new release date will take place on Sunday, March 14 along with the release of a new poster.” Incidentally, it is also the day that Rohit Shetty celebrates his birthday.\n" +
                        "\n" +
                        "The source continues, “Yes, it’s releasing in the holy month of Ramzan but at least, it’ll have a clean run of two weeks and also get advantage of Maharashtra Day holiday on May 1. It’s a huge holiday in the state and that’s where it’s expected to do huge business.”\n" +
                        "\n" +
                        "We tried to get in touch with the spokesperson of Sooryavanshi who refused to confirm the development.\n" +
                        "\n" +
                        "Also Read: CONFIRMED: Sooryavanshi won’t release on April 2; makers to come up with a new date soon\n" +
                        "\n" +
                        "The musical romantic film 99 songs finally has a release date. The film produced by A.R Rahman will hit the theatres on April 16 in Hindi, Telugu and Tamil languages. Apart from debuting as producer with the film, A.R Rahman will also be debuting as a writer.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Atkan%20Chatkan%20%20Official%20Trailer%20%20A%20ZEE5%20Original%20Film%20%20Premieres%205th%20Sep%20On%20ZEE5_360p.mp4?alt=media&token=cc5a2251-c91b-4002-95d4-42604c9b54cd"));
            } else if (i % 10 == 8) {
                buzzList.add(new Buzz("18k", "15 days ago", "\n" +
                        "Oscars 2021: Priyanka Chopra and Nick Jonas reveal that they will be announcing the nominees on March 15\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 11:05 IST\n" +
                        "Bollywood star Priyanka Chopra Jonas and her husband American singer Nick Jonas are all set to announce the nominations for the 2021 Oscars on March 15. The couple revealed the same through a hilarious video.", "know more","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Priyanka%20Chopra%20Giggles%20About%20Limo%20Lovin%20With%20Husband%20Nick%20Jonas_v240P.mp4?alt=media&token=378033e8-777b-41b7-9786-e756e9128c61"));
            } else if (i % 10 == 9) {
                buzzList.add(new Buzz("2k", "18 days ago", "\n" +
                        "Javed Akhtar – Shabana Azmi bowled over by Alia Bhatt’s performance in Gangubai Kathiawadi\n" +
                        "BySubhash K. JhaCreated: Mar 11, 2021 - 11:10 IST\n" +
                        "It seems the teaser of Sanjay Leela Bhansali’s Gangubai Kathiawadi has made inroads far and wide. The latest to fall for Alia Bhatt’s striking charms are the power-couple Shabana Azmi and Javed Akhtar." +
                        " Both individually lauded Alia’s portrayal of the title role.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Alia%20Bhatt%20To%20Team%20Up%20With%20Sanjay%20Leela%20Bhansali%20Again%20After%20Gangubai%20Kathiawadi%20%20Details_360p.mp4?alt=media&token=2fdab60a-e6d9-4a22-8306-8bda38335a26"));
            } else if (i % 10 == 10) {
                buzzList.add(new Buzz("3.7k", "22 days ago", "Actress Avneet Kaur, who is quite popular on Instagram, likes to document her life on social media. With millions" +
                        " of followers, she often shares several pictures flaunting her style.", "know more","https://firebasestorage.googleapis.com/v0/b/nykaa-a5468.appspot.com/o/yt1s.com%20-%20Avneet%20Kaur%20New%20Most%20Popular%20Reels%20Video%20%20Avneet%20Kaur%20%20Avneet%20Kaur%20New%20Reels%20Video_360p.mp4?alt=media&token=a19ea93c-a2eb-428b-835f-95dc46767984"));
            }

        }


    }


}