package com.example.project_gaana.fragments;

import android.content.Context;
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

public class BuzzFragment extends Fragment implements RecyclerViewItemCickListener{

    private List<Buzz> buzzList = new ArrayList<>();
    private RecyclerView mRecyclerView;

    FragmentListener fragmentListener;

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
                buzzList.add(new Buzz("XOzCP0wbluc","2.4k", "1 hours ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more"));
            } else if (i % 10 == 0) {
                buzzList.add(new Buzz("mintu","1.4k", "3 hours ago", "If sources are to be believed Deepika Padukone is the team’s first choice to play Sita. Interestingly Deepika is also up for the role" +
                        " of Sita in a massive feature film to be directed by Nitish Tiwari.", "Read Full Story"));
            } else if (i % 10 == 1) {
                buzzList.add(new Buzz("mintu","3.5k", "9 hours ago", "\n" +
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 15:50 IST\n" +
                        "Earlier this week, actor Ranbir Kapoor and filmmaker Sanjay Leela Bhansali" +
                        " tested positive for COVID-19. Soon after Alia Bhatt went into home quarantine" +
                        " as she was working with Kapoor in Brahmastra" +
                        " and with Bhansali for Gangubai Kathiawadi. She even got herself tested for COVID-19.", "View  Gallery"));
            } else if (i % 10 == 2) {
                buzzList.add(new Buzz("mintu","5k", "1 days ago", "\n" +
                        "Alia Bhatt confirms testing negative for COVID-19; to resume work from today\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 15:50 IST\n" +
                        "Earlier this week, actor Ranbir Kapoor and filmmaker Sanjay Leela Bhansali " +
                        "tested positive for COVID-19. Soon after Alia Bhatt went into home quarantine as she was working " +
                        "with Kapoor in " +
                        "Brahmastra and with Bhansali for Gangubai Kathiawadi. She even got herself tested for COVID-19.", "know more"));
            } else if (i % 10 == 3) {
                buzzList.add(new Buzz("mintu","4.2k", "1 days ago", "\n" +
                        "Amitabh Bachchan and Emraan Hashmi starrer Chehre’s release preponed; to now release on April 9\n" +
                        "ByBollywood Hungama News NetworkUpdated: Mar 11, 2021 - 11:48 IST\n" +
                        "The makers of Amitabh Bachchan and Emraan Hashmi starrer Chehre have preponed the " +
                        "release date of the film. The film which was earlier scheduled to" +
                        " be released on April 30 will now hit the theatres on April 9.", "Read Full Story"));
            } else if (i % 10 == 4) {
                buzzList.add(new Buzz("mintu","1k", "3 days ago", "\n" +
                        "BREAKING: Akshay Kumar’s Sooryavanshi to release on April 30; announcement this Sunday" +
                        " with launch of a new poster?\n" +
                        "ByFenil SetaUpdated: Mar 11, 2021 - 11:34 IST\n" +
                        "Bollywood Hungama had yesterday reported that the much awaited flick, Sooryavanshi, " +
                        "directed by Rohit Shetty, won’t be able to make it in cinemas on April 2, as planned. The decision" +
                        " was taken by its makers due to the rising cases of " +
                        "Coronavirus in the country, particularly in the crucial centres of Maharashtra.", "View  Gallery"));
            } else if (i % 10 == 5) {
                buzzList.add(new Buzz("mintu", "925 Views", "2 days ago", "xBollywood superstar Akshay Kumar has several films in his kitty. The actor has already announced the release date of three of his films for this year-Bell Bottom, Atrangi Re and Prithviraj- and waiting to announce the release of Sooryavanshi." +
                        " Amidst his busy schedule, he has now taken some time off with his family.", "know more"));
            } else if (i % 10 == 6) {
                buzzList.add(new Buzz("mintu","1k", "4 days ago", "\n" +
                        "Kangana Ranaut meets I&B Minister Prakash Javadekar; says they discussed ‘discrimination’ against women and outsiders in the film industry\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 12:07 IST\n" +
                        "Bollywood actor Kangana Ranaut on Wednesday met Information and Broadcasting Minister Prakash Javadekar post the shoot of her upcoming film Tejas in Delhi. At the meet, she raised the issue of \"discrimination\" against artistes form outside the film industry.", "View  Gallery"));
            } else if (i % 10 == 7) {
                buzzList.add(new Buzz("mintu","6k", "6 days ago", "\n" +
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
                        "The musical romantic film 99 songs finally has a release date. The film produced by A.R Rahman will hit the theatres on April 16 in Hindi, Telugu and Tamil languages. Apart from debuting as producer with the film, A.R Rahman will also be debuting as a writer.", "Read Full Story"));
            } else if (i % 10 == 8) {
                buzzList.add(new Buzz("mintu","18k", "15 days ago", "\n" +
                        "Oscars 2021: Priyanka Chopra and Nick Jonas reveal that they will be announcing the nominees on March 15\n" +
                        "ByBollywood Hungama News NetworkCreated: Mar 11, 2021 - 11:05 IST\n" +
                        "Bollywood star Priyanka Chopra Jonas and her husband American singer Nick Jonas are all set to announce the nominations for the 2021 Oscars on March 15. The couple revealed the same through a hilarious video.", "know more"));
            } else if (i % 10 == 9) {
                buzzList.add(new Buzz("mintu","2k", "18 days ago", "\n" +
                        "Javed Akhtar – Shabana Azmi bowled over by Alia Bhatt’s performance in Gangubai Kathiawadi\n" +
                        "BySubhash K. JhaCreated: Mar 11, 2021 - 11:10 IST\n" +
                        "It seems the teaser of Sanjay Leela Bhansali’s Gangubai Kathiawadi has made inroads far and wide. The latest to fall for Alia Bhatt’s striking charms are the power-couple Shabana Azmi and Javed Akhtar." +
                        " Both individually lauded Alia’s portrayal of the title role.", "Read Full Story"));
            } else if (i % 10 == 10) {
                buzzList.add(new Buzz("mintu","3.7k", "22 days ago", "Actress Avneet Kaur, who is quite popular on Instagram, likes to document her life on social media. With millions" +
                        " of followers, she often shares several pictures flaunting her style.", "know more"));
            }

        }


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        fragmentListener = (FragmentListener) context;

    }

    @Override
    public void OnItemClicked(Buzz buzz, int position) {


        if(fragmentListener != null){
            Bundle bundle = new Bundle();
            bundle.putString("name", buzz.getArticle());
            bundle.putString("name1", buzz.getDaysAgo());
            bundle.putString("name3", buzz.getLike());
            fragmentListener.launchBuzzExtendedFragment(bundle);
        }


    }
}