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

public class BuzzFragment extends Fragment implements RecyclerViewItemCickListener {

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
        BuzzAdapter buzzAdapter = new BuzzAdapter(buzzList,this);
        mRecyclerView.setAdapter(buzzAdapter);
    }

    private void setRecyclerAdapter() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                buzzList.add(new Buzz("2.4k", "1 hours ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more","https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Akshay%20kumar%20%20killer%20attitude%20dialogues%20status%20%20attitude%20dialogue%20whatapp%20statusattitude%20dialogue_480p.mp4?alt=media&token=5d72ef73-a628-4842-8063-2265b36b749e"));
            } else if (i % 10 == 0) {
                buzzList.add(new Buzz("1.4k", "3 hours ago", "If sources are to be believed Deepika Padukone is the team’s first choice to play Sita. Interestingly Deepika is also up for the role" +
                        " of Sita in a massive feature film to be directed by Nitish Tiwari.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Atkan%20Chatkan%20%20Official%20Trailer%20%20A%20ZEE5%20Original%20Film%20%20Premieres%205th%20Sep%20On%20ZEE5_360p.mp4?alt=media&token=d0fb4ec3-1227-4dc7-aee8-60c692170b68"));
            } else if (i % 10 == 1) {
                buzzList.add(new Buzz("3.5k", "9 hours ago",
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today"
                        , "View  Gallery","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Coronavirus%20%E0%A4%B8%20%E0%A4%A1%E0%A4%B0%20Alia%20Bhatt%20%20Bollywood%20Joins%20Fight%20Against%20Corona%20Virus%20%20Mahesh%20Bhatt_360p.mp4?alt=media&token=d77e4f49-75e8-41e2-81d8-d370d3bfb477"));
            } else if (i % 10 == 2) {
                buzzList.add(new Buzz("5k", "1 days ago", "\n" +
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 15:50 IST\n" +
                        "Earlier this week, actor Ranbir Kapoor and filmmaker Sanjay Leela Bhansali " +
                        "tested positive for COVID-19. Soon after Alia Bhatt went into home quarantine as she was working " +
                        "with Kapoor in " +
                        "Brahmastra and with Bhansali for Gangubai Kathiawadi. She even got herself tested for COVID-19.", "know more","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Why%20Did%20Emraan%20Hashmi%20Miss%20The%20Chance%20To%20Work%20With%20Amitabh%20Bachchan%20%20Bollywood%20Gossip_360p.mp4?alt=media&token=dde0401d-fa57-483f-9f51-df95042f0805"));
            } else if (i % 10 == 3) {
                buzzList.add(new Buzz("4.2k", "1 days ago", "\n" +
                        "Amitabh Bachchan and Emraan Hashmi starrer Chehre’s release preponed; to now release on April 9\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 11:48 IST\n" +
                        "The makers of Amitabh Bachchan and Emraan Hashmi starrer Chehre have preponed the " +
                        "release date of the film. The film which was earlier scheduled to" +
                        " be released on April 30 will now hit the theatres on April 9.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Amitabh%20Bachchan%20and%20Emraan%20Hashmi%20starrer%20Chehres%20release%20preponed%20to%20now%20release%20on%20April%209_360p.mp4?alt=media&token=cc8b9577-bf08-4754-8d6e-aa5e27a6c0bd"));
            } else if (i % 10 == 4) {
                buzzList.add(new Buzz("1k", "3 days ago", "\n" +
                        "BREAKING: Akshay Kumar’s Sooryavanshi to release on April 30; announcement this Sunday" +
                        " with launch of a new poster?\n" +
                        "ByFenil SetaUpdated: Mar 11, 2021 - 11:34 IST\n" +
                        "Bollywood Hungama had yesterday reported that the much awaited flick, Sooryavanshi, " +
                        "directed by Rohit Shetty, won’t be able to make it in cinemas on April 2, as planned. The decision" +
                        " was taken by its makers due to the rising cases of " +
                        "Coronavirus in the country, particularly in the crucial centres of Maharashtra.", "View  Gallery","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Sooryavanshi%20%20Official%20Trailer%20Akshay%20%20Ajay%20%20Ranveer%20%20Katrina%20%20%20Rohit%20Shetty%20Coming%20soon%202020_360p.mp4?alt=media&token=ff3c1966-542d-46d2-8e0f-3e432e0dffcb"));
            } else if (i % 10 == 5) {
                buzzList.add(new Buzz("925 Views", "2 days ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more","https://firebasestorage.googleapis.com/v0/b/skype-8a506.appspot.com/o/yt1s.com%20-%20Akshay%20kumar%20%20killer%20attitude%20dialogues%20status%20%20attitude%20dialogue%20whatapp%20statusattitude%20dialogue_480p.mp4?alt=media&token=5d72ef73-a628-4842-8063-2265b36b749e"));
            } else if (i % 10 == 6) {
                buzzList.add(new Buzz("1k", "4 days ago", "\n" +
                        "Kangana Ranaut meets I&B Minister Prakash Javadekar; says they discussed ‘discrimination’ against women and outsiders in the film industry\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 12:07 IST\n" +
                        "Bollywood actor Kangana Ranaut on Wednesday met Information and Broadcasting Minister Prakash Javadekar post the shoot of her upcoming film Tejas in Delhi. At the meet, she raised the issue of \"discrimination\" against artistes form outside the film industry.", "View  Gallery","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Kangana%20Ranaut%20meets%20IB%20minister%20discusses%20discrimination%20in%20Bollywood_360p.mp4?alt=media&token=8a167314-4971-480f-af6a-49812dfbddf9"));
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
                        "The musical romantic film 99 songs finally has a release date. The film produced by A.R Rahman will hit the theatres on April 16 in Hindi, Telugu and Tamil languages. Apart from debuting as producer with the film, A.R Rahman will also be debuting as a writer.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Sooryavanshi%20%20Official%20Trailer%20Akshay%20%20Ajay%20%20Ranveer%20%20Katrina%20%20%20Rohit%20Shetty%20Coming%20soon%202020_360p.mp4?alt=media&token=ff3c1966-542d-46d2-8e0f-3e432e0dffcb"));
            } else if (i % 10 == 8) {
                buzzList.add(new Buzz("18k", "15 days ago", "\n" +
                        "Oscars 2021: Priyanka Chopra and Nick Jonas reveal that they will be announcing the nominees on March 15\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 11:05 IST\n" +
                        "Bollywood star Priyanka Chopra Jonas and her husband American singer Nick Jonas are all set to announce the nominations for the 2021 Oscars on March 15. The couple revealed the same through a hilarious video.", "know more","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Priyanka%20Chopra%20Giggles%20About%20Limo%20Lovin%20With%20Husband%20Nick%20Jonas_v240P.mp4?alt=media&token=df165e71-9268-4762-afea-5f824d298c6b"));
            } else if (i % 10 == 9) {
                buzzList.add(new Buzz("2k", "18 days ago", "\n" +
                        "Javed Akhtar – Shabana Azmi bowled over by Alia Bhatt’s performance in Gangubai Kathiawadi\n" +
                        "BySubhash K. JhaCreated: Mar 11, 2021 - 11:10 IST\n" +
                        "It seems the teaser of Sanjay Leela Bhansali’s Gangubai Kathiawadi has made inroads far and wide. The latest to fall for Alia Bhatt’s striking charms are the power-couple Shabana Azmi and Javed Akhtar." +
                        " Both individually lauded Alia’s portrayal of the title role.", "Read Full Story","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Gangubai%20Kathiawadi%20Shooting%20Update%20%20Ajay%20Devgn%20%20Alia%20Bhatt%20Sanjay%20Leela%20Bhansali%20_360p.mp4?alt=media&token=ad34b681-8d87-4eb3-83d6-9e2bc1faa62e"));
            } else if (i % 10 == 10) {
                buzzList.add(new Buzz("3.7k", "22 days ago", "Actress Avneet Kaur, who is quite popular on Instagram, likes to document her life on social media. With millions" +
                        " of followers, she often shares several pictures flaunting her style.", "know more","https://firebasestorage.googleapis.com/v0/b/uberapp-b121c.appspot.com/o/yt1s.com%20-%20Avneet%20Kaur%20New%20Most%20Popular%20Reels%20Video%20%20Avneet%20Kaur%20%20Avneet%20Kaur%20New%20Reels%20Video_360p.mp4?alt=media&token=30a3b407-ad57-4b5f-a184-11232d46974a"));
            }

        }


    }


    @Override
    public void OnItemClicked(Buzz buzz, int position) {

    }
}