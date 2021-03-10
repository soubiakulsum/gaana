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

import com.example.project_gaana.PopularEnglishAdapter;
import com.example.project_gaana.PopularEnglishModel;
import com.example.project_gaana.adapter.DiscoverAdapter;
import com.example.project_gaana.adapter.RadioAdapter;
import com.example.project_gaana.model.DiscoverModel;
import com.example.project_gaana.model.RadioModel;
import com.example.project_gaana.adapter.TrendingAdapter;
import com.example.project_gaana.adapter.TopChartAdapter;
import com.example.project_gaana.model.TopChartsModel;
import com.example.project_gaana.adapter.HindiSongsAdapter;
import com.example.project_gaana.adapter.PicksAdapter;
import com.example.project_gaana.R;
import com.example.project_gaana.model.HindiModel;
import com.example.project_gaana.model.TopPicksModel;
import com.example.project_gaana.model.TrendingSongsModel;
import com.ryan.rv_gallery.GalleryRecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AllSongsFragment extends Fragment {

    private List<TopPicksModel>topPicksModelList = new ArrayList<>();
    private List<HindiModel>hindiModelList = new ArrayList<>();
    private List<TopChartsModel>topChartsModelList = new ArrayList<>();
    private List<TrendingSongsModel>trendingSongsModelList = new ArrayList<>();
    private List<RadioModel>radioModelList = new ArrayList<>();
    private List<DiscoverModel>discoverModelList = new ArrayList<>();
    private List<PopularEnglishModel>popularEnglishModelList = new ArrayList<>();

    private RecyclerView HindiRecycler;
    private GalleryRecyclerView TopPicksRecycler;
    private RecyclerView TopChartsRecycler;
    private RecyclerView TrendingSongsRecycler;
    private RecyclerView RadioRecycler;
    private RecyclerView DiscoverRecycler;
    private RecyclerView EnglishRecycler;



    public AllSongsFragment() {
        // Required empty public constructor
    }

    public static AllSongsFragment newInstance() {
        AllSongsFragment allSongsFragment = new AllSongsFragment();
        return allSongsFragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_songs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildData();
        setRecyclerData();
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

    }

    private void buildPopularEnglishData() {
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.alone,"On My Way","Alan Walker","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.sucker,"Sucker","Jonas Brothers","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.senorita,"Senorita","Shawn Mendes","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.darkside,"Dark Side","Alan Walker","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.girlslikeu,"Girls Like u","Maroon 5","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.withoutme,"With Out Me","Halsey","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.holdon,"Hold On","Alan Walker","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.yummy,"Yummy","Justin Bei","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.happier,"Happier","Marshmello","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.sunflower,"Sunflower","Post Mel.","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.rightnow,"Right On","Nick Jon..","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.cantgetenough,"Cant get eno..","Selena..","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.highonlife,"High On Li..","Martin","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.memories,"Memories","Maroon","83M+ Plays"));
        popularEnglishModelList.add(new PopularEnglishModel(R.drawable.hope,"Hope","The Chain..","83M+ Plays"));

    }

    private void setPopularEnglishData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,RecyclerView.HORIZONTAL,false);
        PopularEnglishAdapter popularEnglishAdapter = new PopularEnglishAdapter(popularEnglishModelList);
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
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,RecyclerView.HORIZONTAL,false);
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(discoverModelList);
        DiscoverRecycler.setLayoutManager(gridLayoutManager);
        DiscoverRecycler.setAdapter(discoverAdapter);
    }

    private void buildRadioData() {
        radioModelList.add(new RadioModel(R.drawable.chatbusters,"ChatBuster"));
        radioModelList.add(new RadioModel(R.drawable.chillmusic,"Chill Music"));
        radioModelList.add(new RadioModel(R.drawable.englishlove,"English Love"));
        radioModelList.add(new RadioModel(R.drawable.filmy,"Filmy"));
        radioModelList.add(new RadioModel(R.drawable.indieradio,"Indie Radio"));
        radioModelList.add(new RadioModel(R.drawable.meethimirchi,"Meethi Mirchi"));
        radioModelList.add(new RadioModel(R.drawable.happyfeels,"Happy Feels"));
        radioModelList.add(new RadioModel(R.drawable.mirchi,"Mirchi 95"));
        radioModelList.add(new RadioModel(R.drawable.mirchipunjab,"Mirchi Punj.."));
        radioModelList.add(new RadioModel(R.drawable.mirchiretro,"Mirchi Retro"));
        radioModelList.add(new RadioModel(R.drawable.morningradio,"Morning Radio"));
        radioModelList.add(new RadioModel(R.drawable.pawryyy,"Party"));
        radioModelList.add(new RadioModel(R.drawable.punjabimirchi,"Punjabi Mirchi"));
        radioModelList.add(new RadioModel(R.drawable.romanticbollywood,"Romance"));
        radioModelList.add(new RadioModel(R.drawable.sukoon,"Sukoon"));
        radioModelList.add(new RadioModel(R.drawable.chatbusters,"ChatBuster"));


    }

    private void setRadioData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        RadioAdapter radioAdapter = new RadioAdapter(radioModelList);
        RadioRecycler.setLayoutManager(linearLayoutManager);
        RadioRecycler.setAdapter(radioAdapter);
    }

    private void setTrendingData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        TrendingAdapter trendingAdapter = new TrendingAdapter(trendingSongsModelList);
        TrendingSongsRecycler.setLayoutManager(linearLayoutManager);
        TrendingSongsRecycler.setAdapter(trendingAdapter);

    }

    private void buildTrendingData() {
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.fake,"Fake A Smile","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.lugaye,"Lut Gaye","16M+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.terasuit,"Tera Suit","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.batein,"Belafz Batein","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.holdon,"hold On","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.mexico,"Mexico","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.sin,"Sin","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.terasuit,"tera Suit","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.illegal,"Illegal Weapon","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.gendaphool,"Genda Phool","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.kaisehua,"Kaise Hua","500k+ Plays"));
        trendingSongsModelList.add(new TrendingSongsModel(R.drawable.fake,"Fake A Smile","500k+ Plays"));


    }

    private void setTopChartsData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        TopChartAdapter topChartAdapter = new TopChartAdapter(topChartsModelList);
        TopChartsRecycler.setLayoutManager(linearLayoutManager);
        TopChartsRecycler.setAdapter(topChartAdapter);

    }

    private void buildTopChartsData() {
        topChartsModelList.add(new TopChartsModel(R.drawable.gaana,"Gaana  Top20","1M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.hinditop50,"Hindi Top 50","2M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.international,"International Top 50","590k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.global,"Globally Trending","24k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab50,"Punjabi Top 50","29k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.trendsongs,"Trending Songs","48k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.newrelease,"New Release Hindi","2M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.newrelease40,"New Realease H..","500k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.bhakti20,"Bhakthi Top 50","25k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab50,"Punjabi Top 50","5k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.punjab100,"Punjabi Top 100","5k Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.latest,"latest Love","1M Followers"));
        topChartsModelList.add(new TopChartsModel(R.drawable.romance,"Romance","50k Followers"));



    }

    private void setData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        HindiSongsAdapter hindiSongsAdapter = new HindiSongsAdapter(hindiModelList);
        HindiRecycler.setLayoutManager(linearLayoutManager);
        HindiRecycler.setAdapter(hindiSongsAdapter);

    }

    private void buildHindiSongsData() {
        hindiModelList.add(new HindiModel(R.drawable.filhaal,"Filhaal","251M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.ghungroo,"Ghungroo","351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.bekhayali,"Bekhayali","256M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.gaanalokdhun,"Dollar Gandh..","51M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.garmi,"Garmi","31M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.lugaye,"Lut Gaye","51M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.pachtaoge,"Pachtaoge","301M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.sansein,"Batein","651M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.shaayad,"Shayad","500M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.tumhiaana,"Tumhi Aana","351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.vaaste,"Vaaste","251M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.ghungroo,"Ghungroo","351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.bekhayali,"Bekhayali","461M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.gaanalokdhun,"Dollar Gandh..","351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.garmi,"Garmi","351M+ Plays"));
        hindiModelList.add(new HindiModel(R.drawable.lugaye,"Lut Gaye","351M+ Plays"));

    }

    private void setRecyclerData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        PicksAdapter picksAdapter = new PicksAdapter(topPicksModelList);
        TopPicksRecycler.setLayoutManager(linearLayoutManager);
        TopPicksRecycler.setAdapter(picksAdapter);
    }

    private void buildData() {
        topPicksModelList.add(new TopPicksModel(R.drawable.batein));
        topPicksModelList.add(new TopPicksModel(R.drawable.kde));
        topPicksModelList.add(new TopPicksModel(R.drawable.djsnake));
        topPicksModelList.add(new TopPicksModel(R.drawable.drake));
        topPicksModelList.add(new TopPicksModel(R.drawable.gandhi));
        topPicksModelList.add(new TopPicksModel(R.drawable.meri));
        topPicksModelList.add(new TopPicksModel(R.drawable.lovedance));


    }

    private void initViews(View view) {
        TopPicksRecycler = view.findViewById(R.id.TopPicksRecycler);
        HindiRecycler = view.findViewById(R.id.HindiRecycler);
        TopChartsRecycler = view.findViewById(R.id.TopChartsRecycler);
        TrendingSongsRecycler = view.findViewById(R.id.TrendingSongsRecycler);
        RadioRecycler = view.findViewById(R.id.RadioRecycler);
        DiscoverRecycler = view.findViewById(R.id.DiscoverRecycler);
        EnglishRecycler = view.findViewById(R.id.EnglishRecycler);
    }
}