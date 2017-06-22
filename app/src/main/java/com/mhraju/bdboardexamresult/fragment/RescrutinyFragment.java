package com.mhraju.bdboardexamresult.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;

public class RescrutinyFragment extends Fragment {


    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    public RescrutinyFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rescrutiny, container, false);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = createNewIntAd();
        loadIntAdd();

        return  view;

    }


    private InterstitialAd createNewIntAd() {
        InterstitialAd intAd = new InterstitialAd(getActivity());
        // set the adUnitId (defined in values/strings.xml)
        intAd.setAdUnitId(getString(R.string.ad_id_interstitial));

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
