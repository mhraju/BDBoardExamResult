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
public class OnlineResultFragment extends Fragment {

    Bundle getData;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private CardView card1,card2, card3, card4, card5, card6;
    private int boardResult;
    private int admissionResult;
    private int pscResult;
    private int nuExam;
    private int medicalResult;
    private int othersResult;

    public OnlineResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_online_result, container, false);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = createNewIntAd();
        loadIntAdd();

        card1 = (CardView) view.findViewById(R.id.card1);
        card2 = (CardView) view.findViewById(R.id.card2);
        card3 = (CardView) view.findViewById(R.id.card3);
        card4 = (CardView) view.findViewById(R.id.card4);
        card5 = (CardView) view.findViewById(R.id.card5);
        card6 = (CardView) view.findViewById(R.id.card6);


        getData = getArguments();

        boardResult = getData.getInt("boardResult");
        admissionResult = getData.getInt("admissionResult");
        pscResult = getData.getInt("pscResult");
        nuExam = getData.getInt("nuExam");
        medicalResult = getData.getInt("medicalResult");
        othersResult = getData.getInt("othersResult");



        if(boardResult == 10){

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",21);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }
            });


            card2.setVisibility(View.VISIBLE);
            card2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",22);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });



            card3.setVisibility(View.VISIBLE);
            card3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",23);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });




            card4.setVisibility(View.VISIBLE);
            card4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",24);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });



            card5.setVisibility(View.VISIBLE);
            card5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",25);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });



            card6.setVisibility(View.VISIBLE);
            card6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("board",26);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });


        }

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
