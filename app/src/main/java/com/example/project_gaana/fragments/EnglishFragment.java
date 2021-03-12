package com.example.project_gaana.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_gaana.OnItemClicked;
import com.example.project_gaana.R;
import com.example.project_gaana.adapter.DiscoverAdapter;
import com.example.project_gaana.adapter.HindiSongsAdapter;
import com.example.project_gaana.adapter.PicksAdapter;
import com.example.project_gaana.adapter.PodcastAdapter;
import com.example.project_gaana.adapter.PopularEnglishAdapter;
import com.example.project_gaana.adapter.RadioAdapter;
import com.example.project_gaana.adapter.TopChartAdapter;
import com.example.project_gaana.adapter.TrendingAdapter;
import com.example.project_gaana.adapter.VideosAdapter;
import com.example.project_gaana.model.DiscoverModel;
import com.example.project_gaana.model.HindiModel;
import com.example.project_gaana.model.PodcatsModel;
import com.example.project_gaana.model.PopularEnglishModel;
import com.example.project_gaana.model.RadioModel;
import com.example.project_gaana.model.TopChartsModel;
import com.example.project_gaana.model.TopPicksModel;
import com.example.project_gaana.model.TrendingSongsModel;
import com.example.project_gaana.model.VediosModel;

import java.util.ArrayList;
import java.util.List;


public class EnglishFragment extends Fragment implements OnItemClicked {

    private List<HindiModel> hindiModelList = new ArrayList<>();
    private List<TopChartsModel> topChartsModelList = new ArrayList<>();
    private List<TrendingSongsModel> trendingSongsModelList = new ArrayList<>();
    private List<RadioModel> radioModelList = new ArrayList<>();
    private List<DiscoverModel> discoverModelList = new ArrayList<>();
    private List<PopularEnglishModel> popularEnglishModelList = new ArrayList<>();
    private List<VediosModel> vediosModelList = new ArrayList<>();
    private List<PodcatsModel>podcatsModelList = new ArrayList<>();

    private RecyclerView HindiRecycler;
    private RecyclerView TopChartsRecycler;
    private RecyclerView TrendingSongsRecycler;
    private RecyclerView RadioRecycler;
    private RecyclerView DiscoverRecycler;
    private RecyclerView EnglishRecycler;
    private RecyclerView VideoRecycler;
    private RecyclerView PodCastRecycler;


    public EnglishFragment() {
        // Required empty public constructor
    }

    public static EnglishFragment newInstance(){
        EnglishFragment englishFragment = new EnglishFragment();
        return englishFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_english, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildHindiSongsData();
        setData();
        buildTopChartsData();
        setTopChartsData();
        buildTrendingData();
        setTrendingData();
        buildRadioData();
        setRadioData();
        buildDiscoverData();
        setDiscoverData();
        buildPopularEnglishData();
        setPopularEnglishData();
        buildVideoData();
        setVideoData();
        buildPodcastData();
        setPodCastData();
    }

    private void setPodCastData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        PodcastAdapter videosAdapter = new PodcastAdapter(podcatsModelList);
        PodCastRecycler.setLayoutManager(linearLayoutManager);
        PodCastRecycler.setAdapter(videosAdapter);
    }

    private void buildPodcastData() {
        podcatsModelList.add(new PodcatsModel(R.drawable.aliflaila,"Alif Laila"));
        podcatsModelList.add(new PodcatsModel(R.drawable.ansunaa,"Ansunaa"));
        podcatsModelList.add(new PodcatsModel(R.drawable.freedom,"Freedom fighte.."));
        podcatsModelList.add(new PodcatsModel(R.drawable.kahaanibaaz,"Kahaani baaz"));
        podcatsModelList.add(new PodcatsModel(R.drawable.karthik,"RJ Karthik"));
        podcatsModelList.add(new PodcatsModel(R.drawable.mdmotivations,"MD Motivations"));
        podcatsModelList.add(new PodcatsModel(R.drawable.meditate,"Meditate"));
        podcatsModelList.add(new PodcatsModel(R.drawable.phuware,"Hasi Phuware"));
        podcatsModelList.add(new PodcatsModel(R.drawable.riya,"riyas Retro"));
        podcatsModelList.add(new PodcatsModel(R.drawable.vani,"Joke Vani"));

    }

    private void setVideoData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        VideosAdapter videosAdapter = new VideosAdapter(vediosModelList);
        VideoRecycler.setLayoutManager(linearLayoutManager);
        VideoRecycler.setAdapter(videosAdapter);
    }

    private void buildVideoData() {
        vediosModelList.add(new VediosModel(R.drawable.beautiful,"Beautiful People","Ed Shereen,khalid"));
        vediosModelList.add(new VediosModel(R.drawable.binidnglights,"Blinding Nights","Ed Shereen"));
        vediosModelList.add(new VediosModel(R.drawable.senoritaaa,"Senorita","Shawn Mendes,Camila ca.."));
        vediosModelList.add(new VediosModel(R.drawable.ringtone,"RingTone","Preetinder"));
        vediosModelList.add(new VediosModel(R.drawable.ghungrooooo,"Ghungroo","Arjith Singh,Vish.."));
        vediosModelList.add(new VediosModel(R.drawable.goabeach,"Goa Beach","Tony Kakkar,Neha k.."));
        vediosModelList.add(new VediosModel(R.drawable.jannath,"Jannath","Ed Shereen"));
        vediosModelList.add(new VediosModel(R.drawable.yummy,"Yummy","Justin Beiber"));
        vediosModelList.add(new VediosModel(R.drawable.galkarke,"Gal Karke","Asees Kaur"));
        vediosModelList.add(new VediosModel(R.drawable.jonasbrothers,"Sucker","Jonas Brother"));
        vediosModelList.add(new VediosModel(R.drawable.lehenga,"Lehenga","Ed Shereen"));
        vediosModelList.add(new VediosModel(R.drawable.kalla,"Kalla Sohna Nai","Neha Kakkar"));

    }

    private void buildPopularEnglishData() {
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.alone, "On My Way", "Alan Walker", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.sucker, "Sucker", "Jonas Brothers", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.senoritaaa, "Senorita", "Shawn Mendes", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.darkside, "Dark Side", "Alan Walker", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.girlslikeu, "Girls Like u", "Maroon 5", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.withoutme, "With Out Me", "Halsey", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.holdonnn, "Hold On", "Alan Walker", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.yummy, "Yummy", "Justin Bei", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.happier, "Happier", "Marshmello", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.sunflower, "Sunflower", "Post Mel.", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.rightnow, "Right On", "Nick Jon..", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.cantgetenough, "Cant get eno..", "Selena..", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.highonlife, "High On Li..", "Martin", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.memories, "Memories", "Maroon", "83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.hope, "Hope", "The Chain..", "83M+ Plays"));

    }

    private void setPopularEnglishData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, RecyclerView.HORIZONTAL, false);
        PopularEnglishAdapter popularEnglishAdapter = new PopularEnglishAdapter(popularEnglishModelList,this);
        EnglishRecycler.setLayoutManager(gridLayoutManager);
        EnglishRecycler.setAdapter(popularEnglishAdapter);
    }

    private void buildDiscoverData() {
        discoverModelList.add(new DiscoverModel(R.drawable.disrom));
        discoverModelList.add(new DiscoverModel(R.drawable.pawryyy));
        discoverModelList.add(new DiscoverModel(R.drawable.festivals));
        discoverModelList.add(new DiscoverModel(R.drawable.bhakti));
        discoverModelList.add(new DiscoverModel(R.drawable.early));
        discoverModelList.add(new DiscoverModel(R.drawable.edm));
        discoverModelList.add(new DiscoverModel(R.drawable.retro));
        discoverModelList.add(new DiscoverModel(R.drawable.wedding));
        discoverModelList.add(new DiscoverModel(R.drawable.stars));
        discoverModelList.add(new DiscoverModel(R.drawable.workout));
        discoverModelList.add(new DiscoverModel(R.drawable.ghazals));
        discoverModelList.add(new DiscoverModel(R.drawable.kids));
        discoverModelList.add(new DiscoverModel(R.drawable.dance));
        discoverModelList.add(new DiscoverModel(R.drawable.disrom));
        discoverModelList.add(new DiscoverModel(R.drawable.stars));
        discoverModelList.add(new DiscoverModel(R.drawable.bhakti));

    }

    private void setDiscoverData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, RecyclerView.HORIZONTAL, false);
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(discoverModelList);
        DiscoverRecycler.setLayoutManager(gridLayoutManager);
        DiscoverRecycler.setAdapter(discoverAdapter);
    }

    private void buildRadioData() {
        radioModelList.add(new RadioModel(R.drawable.chatbusters, "ChatBuster"));
        radioModelList.add(new RadioModel(R.drawable.chillmusic, "Chill Music"));
        radioModelList.add(new RadioModel(R.drawable.englishlove, "English Love"));
        radioModelList.add(new RadioModel(R.drawable.filmy, "Filmy"));
        radioModelList.add(new RadioModel(R.drawable.indieradio, "Indie Radio"));
        radioModelList.add(new RadioModel(R.drawable.meethimirchi, "Meethi Mirchi"));
        radioModelList.add(new RadioModel(R.drawable.happyfeels, "Happy Feels"));
        radioModelList.add(new RadioModel(R.drawable.mirchi, "Mirchi 95"));
        radioModelList.add(new RadioModel(R.drawable.mirchipunjab, "Mirchi Punj.."));
        radioModelList.add(new RadioModel(R.drawable.mirchiretro, "Mirchi Retro"));
        radioModelList.add(new RadioModel(R.drawable.morningradio, "Morning Radio"));
        radioModelList.add(new RadioModel(R.drawable.pawryyy, "Party"));
        radioModelList.add(new RadioModel(R.drawable.punjabimirchi, "Punjabi Mirchi"));
        radioModelList.add(new RadioModel(R.drawable.romanticbollywood, "Romance"));
        radioModelList.add(new RadioModel(R.drawable.sukoon, "Sukoon"));
        radioModelList.add(new RadioModel(R.drawable.chatbusters, "ChatBuster"));


    }

    private void setRadioData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RadioAdapter radioAdapter = new RadioAdapter(radioModelList);
        RadioRecycler.setLayoutManager(linearLayoutManager);
        RadioRecycler.setAdapter(radioAdapter);
    }

    private void setTrendingData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        TrendingAdapter trendingAdapter = new TrendingAdapter(trendingSongsModelList);
        TrendingSongsRecycler.setLayoutManager(linearLayoutManager);
        TrendingSongsRecycler.setAdapter(trendingAdapter);

    }

    private void buildTrendingData() {
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.fake, "Fake A Smile", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.lugaye, "Lut Gaye", "16M+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.terasuit, "Tera Suit", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.batein, "Belafz Batein", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.holdonnn, "hold On", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.mexico, "Mexico", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.sin, "Sin", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.terasuit, "tera Suit", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.illegal, "Illegal Weapon", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.gendaphool, "Genda Phool", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.kaisehua, "Kaise Hua", "500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.fake, "Fake A Smile", "500k+ Plays"));


    }

    private void setTopChartsData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        TopChartAdapter topChartAdapter = new TopChartAdapter(topChartsModelList);
        TopChartsRecycler.setLayoutManager(linearLayoutManager);
        TopChartsRecycler.setAdapter(topChartAdapter);

    }

    private void buildTopChartsData() {
        topChartsModelList.add(new TopChartsModel(R.drawable.gaana, "Gaana  Top20", "1M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.hinditop50, "Hindi Top 50", "2M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.international, "International Top 50", "590k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.global, "Globally Trending", "24k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab50, "Punjabi Top 50", "29k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.trendsongs, "Trending Songs", "48k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.newrelease, "New Release Hindi", "2M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.newrelease40, "New Realease H..", "500k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.bhakti20, "Bhakthi Top 50", "25k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab50, "Punjabi Top 50", "5k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab100, "Punjabi Top 100", "5k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.latest, "latest Love", "1M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.romance, "Romance", "50k Followers"));


    }

    private void setData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        HindiSongsAdapter hindiSongsAdapter = new HindiSongsAdapter(hindiModelList,this);
        HindiRecycler.setLayoutManager(linearLayoutManager);
        HindiRecycler.setAdapter(hindiSongsAdapter);

    }

    private void buildHindiSongsData() {
        hindiModelList.add(new HindiModel(R.drawable.filhaal, "Filhaal", "251M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.ghungrooooo, "Ghungroo", "351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.bekhayali, "Bekhayali", "256M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.gaanalokdhun, "Dollar Gandh..", "51M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.garmi, "Garmi", "31M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.lugaye, "Lut Gaye", "51M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.pachtaoge, "Pachtaoge", "301M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.sansein, "Batein", "651M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.shaayad, "Shayad", "500M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.tumhiaana, "Tumhi Aana", "351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.vaaste, "Vaaste", "251M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.ghungrooooo, "Ghungroo", "351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.bekhayali, "Bekhayali", "461M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.gaanalokdhun, "Dollar Gandh..", "351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.garmi, "Garmi", "351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.lugaye, "Lut Gaye", "351M+ Plays"));

    }

    private void initViews(View view) {
        HindiRecycler = view.findViewById(R.id.HindiRecycler);
        TopChartsRecycler = view.findViewById(R.id.TopChartsRecycler);
        TrendingSongsRecycler = view.findViewById(R.id.TrendingSongsRecycler);
        RadioRecycler = view.findViewById(R.id.RadioRecycler);
        DiscoverRecycler = view.findViewById(R.id.DiscoverRecycler);
        EnglishRecycler = view.findViewById(R.id.EnglishRecycler);
        VideoRecycler = view.findViewById(R.id.VideoRecycler);
        PodCastRecycler = view.findViewById(R.id.PodCastRecycler);
    }

    @Override
    public void OnItemClicked(PopularEnglishModel englishModel) {

    }

//    @Override
//    public void OnHindiSongClicked(HindiModel hindiModel) {
//
//    }
}