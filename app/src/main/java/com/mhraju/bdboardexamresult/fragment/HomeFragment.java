package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;


public class HomeFragment extends Fragment {

    private Button boardResult, admissionResult, pscResult, nuExam, medicalResult, othersResult;
    private int trackId;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);


        boardResult = (Button) view.findViewById(R.id.boardResult);
        admissionResult = (Button) view.findViewById(R.id.admissionResult);
        pscResult = (Button) view.findViewById(R.id.pscResult);
        nuExam = (Button) view.findViewById(R.id.nuExam);
        medicalResult = (Button) view.findViewById(R.id.medicalResult);
        othersResult = (Button) view.findViewById(R.id.othersResult);


        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);


        mInterstitialAd = createNewIntAd();
        loadIntAdd();


        boardResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 10;
                showIntAdd();
                getSelection();
            }
        });

        admissionResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 11;
                showIntAdd();
                getSelection();

            }
        });

        pscResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 12;
                showIntAdd();
                getSelection();

            }
        });

        nuExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 13;
                showIntAdd();
                getSelection();

            }
        });

        medicalResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 14;
                showIntAdd();
                getSelection();

            }
        });

        othersResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 15;
                showIntAdd();
                getSelection();

            }
        });

        return  view;
    }


    public void  getSelection(){

        Bundle bundle = new Bundle();
        bundle.putInt("boardResult",trackId);
        bundle.putInt("admissionResult",trackId);
        bundle.putInt("pscResult",trackId);
        bundle.putInt("nuExam",trackId);
        bundle.putInt("medicalResult",trackId);
        bundle.putInt("othersResult",trackId);
        Fragment fragment=new SelectionType();
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerHome, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }




    private InterstitialAd createNewIntAd() {
        InterstitialAd intAd = new InterstitialAd(getActivity());
        // set the adUnitId (defined in values/strings.xml)
        intAd.setAdUnitId(getString(R.string.ad_id_interstitial));
        /*intAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                fab.setEnabled(true);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                fab.setEnabled(true);
            }

            @Override
            public void onAdClosed() {

                fabClicked();
            }
        });*/
        return intAd;
    }

    private void showIntAdd() {

// Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
    private void loadIntAdd() {
        // Disable the  level two button and load the ad.
//        fab.setEnabled(false);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mInterstitialAd.loadAd(adRequest);
    }

}
