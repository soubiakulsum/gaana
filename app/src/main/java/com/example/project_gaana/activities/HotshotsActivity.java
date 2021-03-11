package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;

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

        videoModel ob0 = new videoModel("https://file214.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGgvSXppdHh4N3g4eENPQmtwNFJrbk4yaE1NRmRMNjFFNEorcEdkOUE4SFdUVmRtS1BBQ09vNTF0ZFhxVi81MGZ2RDdiNExFMkM1MGhabGoxaTdMbGtEaDZqRGpsZjh6RlNQMEVTMjUwdGxSMjBTUFdudGZacVVHOTRWdXY0aCtsZFhZSHN5OE9jL2JmL05RRm5ubktlT1h0N0pnS3Z5K2c2cHRBNWVtY3B3bmt3cmdCdGNsK1ZrVmdkcTlaMEp2NTBQZlpvSGdPaVkwVTVVK2hxUGExT1pRUU5veklWekVoUHhVODF2bTlDRXN1Z1NnT3JDcTU4NkI0eDA1UGRMaGw0WEN4N2Z2a1kyTEpLSk9qRzhuVmZMM3I0TmJ2ditwMzdoUT0%3D","Pawari Ho rhi hai \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","250.9M Views");
        videos.add(ob0);

        videoModel ob1 = new videoModel("https://file73.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGx1RXRrdHd1akFNcUQ2eEU3WVVxMXZhMGFOMUFPNlFIeElTbEF0RmE4blhMWmRHZkpSeW9wSkVzUzJmSzVOOHp2amVFeElZaFRkcFFSZ2F6aVBLaWdpUmx3aWJzZTVQR0hhMVNiRHd3Z1ZrbzV3NjJoOVA4bUNmTW1rTCs4UjJUSWlrYTVuME5OUG5Wem85SndXR1dLcVhDeXA4UXVUT2Q1OThiL1AyTjRFU2s1Ylo3NnZwc0RFbDFaNVVUMnBYNGxMMkhwRlVRaXBBSTVWNnRwK1d1T1pZd0hiZUtSaU4vS3lFQjRPSG9UeFFReUJvTjdHMnE0N3drL0drRGVMUksrMnU2L3ZyV2NUZVphdEgzWDRHN09meThzdERxM2ZoNHVuN0tydmJEbmFWQ2p6ZXpRTTNBUk5rSm8xc3Fub2lJMnVCZ2sxR2M3eVl6dmJOZmxGdXllbHhwQ0pCT0xDb21DWW9TSHo0UnVjajI0S3M1b000YVB4bTN1KzVsSUsxN3ZwZlJ4T2REazNmUXFJcDhJeHFZOG1mZA%3D%3D","Aye Khuda Jo Bana Tu","450.9M Views");
        videos.add(ob1);

        videoModel ob2 = new videoModel("https://file167.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGcrWnZtOTA3eXhWb0VxcENvY1lzMytXc0pvSmNJYWtJaHAycUVNcEg5QzdJT3NPZk1SdWNwZE50VEhLVjRzUTQ4aWpIOHBveldObGhIUVhzbXZLMmhRNGwzMWZsTU5YZFFmNVFaSHQrbkZCaXh5N09pYVB5b0JydHAyaXZvZ2pSU2lrYTVuNVpHL2VWbzdsUmgyVEtlL0txMEo4STVtdlU5bzkyMmZpY3VBVEowTE13ditOMlZrVjRkcTlPMXBUeTRPZkVwRk1LZ1lrTTVWNndxUGF6RmFFN0hiR0xhekpQS1NvSS9menVUQXNoM0RFZjdIbXR5YjRSdUdRWll2ZHgwbmV6eHFHL05pL1djOUtpQ1phQkpiV1VpSVA4K3Vsb3JVVFZyKzdDd2NzV3gxM3pFSnF1RUlsT29sbCtzclhV","Tu Chale chal sabhi Chale","11.9M Views");
        videos.add(ob2);

        videoModel ob13 = new videoModel("https://file32.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGx2RWgwL0k3eGg0blNvVk43YXM2MitXdmFPUk9MK3dNeFlXbVd2cFIrem5kT3NTZVBRZUlwSkZ0UUdDRi9KMTJ0RGJkNlk4d1ROczZIVHY1bXEyQW5qNXl3aVB3Y04vSVhveERZSDk2c1Vrby9pT2V5YnJYdFJ6b2pDNzc5MTNOWVRSZTlEMENNZkR2NFo1YzNUU09QZEg5M0lVUnVDU2FwOGh2MStESjhWUFF3UGRzbnNVblUwVmdkdDVlMXBlK2tydk5wMEltaDVnZDFFbWJwK09aQUlzNUhhcWhkRFp4QVNFQjV1dlFXQjRReUNBaDdIbXovcTQzNTE4TFlxUisxMis5Nitqb2RpcUtRYy8zVHE2SEl1ZTVtY0g4N1A1a2dGWFVxK3ZHanBOL213MnFUZmY4U3RnWWpsY3pxbytKMy84Z3ltS0k1VnhNMHZCSHlWdW9NVXM0UWNwaURURUtQOXdlRlNzTW9zRG50UGRxck1vWU5oNjB1K2wzWlBNbnFNT2FsdUpPbDNyWHRzd3NiUi9Uc0NNPQ%3D%3D","Guddu Bhaiya Funny Dialog \uD83E\uDD23\uD83E\uDD23\uD83E\uDD23","1.9M Views");
        videos.add(ob13);


        videoModel ob7 = new videoModel("https://file110.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGgvSXFuWjR4emxzZ0NhcEVwNWxrMnVIcktNRkFaYUFPMUl1VkdkOUE1ai9JWVp1WUpBNmRvNHMyU25xVHZOVTF1RFBPdUowdlY4NDZSUUw1ai9Pd25DUjBnQW0rY05uWUFibEVaRzU2cnd0dzNDaVU1ZnpHdUJ1em9HbXNzMWlRVTNkYzRpdEZNT1dFdDVsQjJXejBmL2J3MjgxQS93Q0c3WTlkei9LWThWUFF6cUpxL1k1VENnRW1WWWtQMUp2aDJyN1Bxa3BTemRJTTIwT2hsdW12T1owOUhhMmZiUWg5T3gwQzRlRFFXeG9IempJVytYaXQ5NzgxMFhNZGNMUmcrM0s4OE9EV1pUZVpjc1BKWEo2S0xkZXVzc1R0OStwcnFrUElxTnpKblk5VWx4cXVVY256ZWNJSHYwZ3FyTEdDNi9NbDFsZXR6eHdsaThZcXhtajdkRjRNR2I1MGNDRmZONElhRjNwZXJNanR0SThTdTVwVWZrWHg1cWc0ZXY5Zy9NaWFsTzVEbEgzVW81a3BKbEhXOXlrPQ%3D%3D","Paane Ki Chaahat","4.9M Views");
        videos.add(ob7);
        videoModel ob4 = new videoModel("https://file57.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGcvd3BsY3h4akRZbUJLZEZxSW84bksrRUtzaERJYUFheU1HMUdNcGN2aHpkY01TWWUwU3d0NHN1VUhLTHZQc29zamZPNTR0ckV2cDVVeDcybXVlNTNSWi9oUXUrTmZyRUVyOGRUM2hvc0g4d2hYYURndnpFN1ZQK3VuR29tRjJDZUN4WDkya3RKUHJGNVlwSzBDeVpTZnIwaDlWWGkzRGFzTHhRaVAyY29BUzR3TDB6ODVFK1NrdDVmb2xpMzUvdzAvbkNvbFFtaEpBZDFrS2p2T2VaRVpjaEZKcWNmRFprTFIwUTZQem5UaG9VOENnTDgyUy80cW9hL1dnTWVhNTA2WGlML3Z2bGFnQ2FkOFh4Y0pPTE9mdUNzTVNxeU5GVXMyejdqdGI0ejh3UWhrYXFXSnk1UWRRSDdHWU41NmFiOWNVa3gwS3cxd3BIMDdaWWtSK2tKQmhvSHRGWU5Tb2NNWjFF","Sadda Kutta Tommy","1.9M Views");
        videos.add(ob4);

        videoModel ob12 = new videoModel("https://file219.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOG1zQnZ2TjAxeVJsb002NVlzNThoeEsvckNPNXBaWkVLMzVtckh0QWZ2Z25RY01TWU1SK1ovYXN5UTJlVTVPbHU3Mi9mdllNd0RZOTNYeHI5cFBhaWdqa3J6RlhUWjlmWUFhMVVhRElwaFUxemgyUEI2cU9SNnpQaDRYQ3NzMGpOYnlzSCtYWkFNT2J2OVpkSDIyRDBmZkx3eG9JTHZobVU1WngyelBXUHB3ajV6WTBwc04xaFRVVmtZNjlPelp2aHl1UHpobkFUaEl3WncyeTFwdGVaVmNobERPdVRhV00yT1NjR3RNYkJHaDRHM3l3TS9YaTMrNnA0dnpaWUpQUXR1emZob0xUNmJ5V2RJNUNoR2NIVmZyejd0ZE9rOGU4eg%3D%3D","MS Dhoni Returns KGF","289.9M Views");
        videos.add(ob12);
        videoModel ob8 = new videoModel("https://file108.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGxmWWxqY0V6d1FVdlNxNUNvWUVteE96ck5NRk9PclJFekpxeVdzMUE5Q3JOWXB1TlB4Mk1vSjAwQ1RpaytkRXhzQ3pIdUowdlY4NDZSUUw1ai9Pd3FXSWcyUmU3YzhpWlU3NWZZWEpFczBGMzIzdldudGZOdGdEc3BuK280aCtsWVRSZTkya3RaTENDMTRZYTJHamZhcm5uM0oxTzRHMmQ1NXRjenZtYm9RM0p4cnc1dE5WbVZudGplNUZKeXFYMHorRHp0bE1ZbEl3UDVVdXJ1K2V3QTR3S0dhdVpkVDVqTmgwYTV1SG9Zd2dLempFTDYxT0crS3MxMWtjbVg0MVk0MTNucjZMNUtES0lLb1R4U3A3WkE4YjdvOTNwNit0a3Ewak1vNzZXeXNzVndsRDBINXlxQU1JZTdGdzE4UEU9","Love Me Like You do","1.9M Views");
        videos.add(ob8);

        videoModel ob5 = new videoModel("https://file92.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOG12STJpOTAzeGh3dkRyd0hwNEVnMmVIcko4aEJMYUpFM3A2akJjdEh2ampYWTlXZE5SM0MvYjBvUlgrSTVONTJxakRCOU1VelRjaGxRd1hIeUxEemhuOTdtVk96ZU5IQkVJZEdiR056L2dVeDlUK2MyZVhCdXhDOTRWdWd0eG5HUGdKYTkya3RKS2ZkOEl0Tm0yckVZcnlwbUowRXZ6V1g3NXRGMXYrS2l3RDZ6THc3aDloMFVFZHhUSU5KMkk3Z3pNL0txbFVjbHB3TzVVaXFydTZ2RlpZS0Q2cVFmZ2hqS2lNZC9QelFXVU1LNVFJS3JrS1QrWjRhdlRaWlllNTQrRGJ5L3ZmbU94YTJPTWZ1WDVpV0wveTBxOENrczY4dzZoV1o5YnVWemR4VG54S2lGWm1yRjRsYzR4aGxzclhlOXRwbmxnPT0%3D","Marshmallow alone dance","1.9M Views");
        videos.add(ob5);

        videoModel ob6 = new videoModel("https://file166.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOGx2OGxscDROeGh3b0JMa0g3YmtuMHErek04eE1PclVLaG9lM0F0ZFh2aTNNY01TZUkwVENrNVloVG5xUy81MHV0akhJdUowMFdOMWtSU21yemJhejJEeG0zVUh6ZDlUSUtxaFhlWDhtNWhKRnlpbUcyT1RXdkZDcWxYQzk4d2pSU25WUDRCMFNiL2pSNVpvRzFtYkdKTHF2MHB3RW94bUk0NVpDMytLaW9BbnovS0V1dmQ5aFRFRkxmb1ZPMEpuS3pPVE5zVklLdjV3UzNVR3R1dXFaRlpFN0c1cU5iVFprS3pFMi90WHBkQ3hQeVRjdDZrbUJwZmwxL2k0RVlmUXo3MmU3cE52SElEcUFic3ZrU29XTkorM2c5NU9vdDYwNTdCbVo5YVhVbFlCRnkxci9HNTJ0RklST29sbCtzclhTdEE9PQ%3D%3D","Alan Walker The spectre music","1.9M Views");
        videos.add(ob6);

        videoModel ob9 = new videoModel("https://file56.iijj.nl/?file=M3R4SUNiN3JsOHJ6WWQ3aTdPRFA4NW1rRVJIOG5Qc2hpOVFvemxzdkFLY0huNHdyMXZMckxjeFlaYVVId29DeUJNeGR2aTNYZjlmQUp3ZUlvb3NuVW1QSzVNSThyU3JjdUpncFhjeCtIVVNveWJibzNUTitoZzNsYThyRVhyQmZlVHhvckU1a21DU2J3L3ZFckFmeCtHNjVwbG1XZnh0ZTZtc2JjL2pBcGRsTzNHWE9VT2ZseDVoWTZIUzUrNVZjenVXZnNVU2s1Yjh1N0prbmVCMHhJYlpFaTVmMHkvV0Nwa2dVeTlSWDBVV2h1dU8wRDZFNUhhbWhZRFowUHpRMjUrcjRZeGtXd0M4TzdYNjN5YndxNEdjMlpxaDAvSEcxNmVMV2RTdVphdGZsY0llTkx1MnltWmVwc0tsZXZVbk9yUFBTanBOL25nR3pkOXZ3U05ZM3MwY3NxN09XOThVSjBVSzR6aG9KdmVZRzhuamJJbW8rYjVRZkhDTlhkOXhaQ2o1TTdjcm41dnNWMDlsSmRsenE4YmtsZnZjNDhNK2RrTzlQbjNyV29JWjhJeHFZOG1mZERBPT0%3D","Kesari Lal Bhojpuri","1.9M Views");
        videos.add(ob9);


        viewPager2.setAdapter(new VideoAdapter(videos));




    }
}