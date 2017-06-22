package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SmsBoardFragment extends Fragment {
    private CardView mPsc;
    private CardView mJsc;
    private CardView mVoc;
    private CardView mHvoc;
    private CardView mDegree;
    private CardView honour;
    private CardView masters;
    private CardView NU;
    private Bundle bundle;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    public SmsBoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sms_board, container, false);
        mPsc= (CardView) view.findViewById(R.id.pscResult);
        mJsc= (CardView) view.findViewById(R.id.jscResult);
        mVoc= (CardView) view.findViewById(R.id.ssc_voc);
        mHvoc= (CardView) view.findViewById(R.id.hsc_voc);
        mDegree= (CardView) view.findViewById(R.id.degree);
        honour= (CardView) view.findViewById(R.id.honour);
        masters= (CardView) view.findViewById(R.id.masters);
        NU= (CardView) view.findViewById(R.id.nuExam);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = createNewIntAd();
        loadIntAdd();




        bundle=new Bundle();
        mPsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",1);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                fragment.setArguments(bundle);
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        mJsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",2);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        mVoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",3);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        mHvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",4);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        mDegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",5);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        honour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",6);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        masters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showIntAdd();
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",7);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });
        NU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showIntAdd();

                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",8);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();
                ft.commit();

            }
        });

        return view;
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
