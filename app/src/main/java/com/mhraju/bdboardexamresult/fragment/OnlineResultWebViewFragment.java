package com.mhraju.bdboardexamresult.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.kazy.lx.LxWebContainerView;
import com.kazy.lx.WebViewStateListener;
import com.mhraju.bdboardexamresult.R;
import com.mhraju.bdboardexamresult.UnsupportedProtcolInterceptor;
import com.mhraju.bdboardexamresult.activity.MainActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class OnlineResultWebViewFragment extends Fragment {
    private Button mOnline;
    private Button mSms;
    private Button mRecheck;
    private AdView mAdView;
    Bundle  getData;


    private InterstitialAd mInterstitialAd;
    private int board;
   /* @InjectView(R.id.webview_view)
    LxWebContainerView webContainerView;*/


    public OnlineResultWebViewFragment() {
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
        View view=inflater.inflate(R.layout.fragment_online_web_view, container, false);


        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("BD Exam Result");
        actionBar.setDisplayShowHomeEnabled(false);

        WebView myWebView = (WebView) view.findViewById(R.id.webview);

        mAdView = (AdView)view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);


        getData = getArguments();

        board = getData.getInt("board");


        if(board == 21) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        } else  if(board == 22) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        } else  if(board == 23) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        } else  if(board == 24) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        } else  if(board == 25) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        } else  if(board == 26) {

            myWebView.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");
        }

        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
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
/*
    @Override
    public void onClick(View v) {
        switch (getId()){
            case R.id.online:

                showIntAdd();

                Fragment fragment=new OnlineResultFragment();
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.containerHome, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.sms:
                break;
            case R.id.recheck:
                break;
        }

    }*/


}
