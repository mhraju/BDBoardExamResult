package com.mhraju.bdboardexamresult.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;


public class SelectionType extends Fragment {
    private Button mOnline;
    private Button mSms;
    private Button mRecheck;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    Bundle getData;
    private int admissionResult;
    private int pscResult;
    private int nuExam;
    private int medicalResult;
    private int othersResult;
    private int boardResult;
    private int teachersResult;
    private int bankResult;
    private int bcsResult;
    private int polytechResult;


    public SelectionType() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_selection_type, container, false);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = createNewIntAd();
        loadIntAdd();
        
        mOnline= (Button) view.findViewById(R.id.online);
        mSms= (Button) view.findViewById(R.id.sms);
        mRecheck= (Button) view.findViewById(R.id.recheck);


        getData = getArguments();

        boardResult = getData.getInt("boardResult");
        admissionResult = getData.getInt("admissionResult");
        pscResult = getData.getInt("pscResult");
        nuExam = getData.getInt("nuExam");
        medicalResult = getData.getInt("medicalResult");
        othersResult = getData.getInt("othersResult");
        teachersResult = getData.getInt("teachersResult");
        bankResult = getData.getInt("bankResult");
        bcsResult = getData.getInt("bcsResult");
        polytechResult = getData.getInt("polytechResult");


        mOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showIntAdd();
                Bundle bundle = new Bundle();
                bundle.putInt("boardResult",boardResult);
                bundle.putInt("admissionResult",admissionResult);
                bundle.putInt("pscResult",pscResult);
                bundle.putInt("nuExam",nuExam);
                bundle.putInt("medicalResult",medicalResult);
                bundle.putInt("othersResult",othersResult);
                bundle.putInt("teachersResult",teachersResult);
                bundle.putInt("bankResult",bankResult);
                bundle.putInt("bcsResult",bcsResult);
                bundle.putInt("polytechResult",polytechResult);
                Fragment fragment=new OnlineResultFragment();
                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        mSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showIntAdd();

                Fragment fragment=new SmsBoardFragment();
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        mRecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showIntAdd();
                Fragment fragment=new RescrutinyFragment();
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

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
