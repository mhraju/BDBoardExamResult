package com.mhraju.bdboardexamresult.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;
import com.mhraju.bdboardexamresult.activity.MainActivity;

import android.webkit.WebView;


public class OnlineResultWebViewFragment extends Fragment {
    private Button mOnline;
    private Button mSms;
    private Button mRecheck;
    private AdView mAdView;
    Bundle  getData;


    private InterstitialAd mInterstitialAd;
    private int board;
    private int admissionResult;
    private int pscResult;
    private int nuExam;
    private int medicalResult;
    private int othersResult;
    private int teachersResult;
    private int bankResult;
    private int bcsResult;
    private int polytechResult;
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
        nuExam = getData.getInt("nuExam");
        admissionResult = getData.getInt("admissionResult");
        pscResult = getData.getInt("pscResult");
        medicalResult = getData.getInt("medicalResult");
        othersResult = getData.getInt("othersResult");
        teachersResult = getData.getInt("teachersResult");
        bankResult = getData.getInt("bankResult");
        bcsResult = getData.getInt("bcsResult");
        polytechResult = getData.getInt("polytechResult");


        /***********************  Board EXAM  **************************/


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


        /***********************  NU EXAM  **************************/


        else if(nuExam == 31) {

            myWebView.loadUrl("http://www.nu.edu.bd/results/");
        } else  if(nuExam == 32) {

            myWebView.loadUrl("http://app9.nu.edu.bd/nu-web/applicantLogin.action");
        } else  if(nuExam == 33) {

            myWebView.loadUrl("http://app9.nu.edu.bd/nu-web/applicantLogin.action?degreeName=Degree%20Pass");
        } else  if(nuExam == 34) {

            myWebView.loadUrl("http://app1.nu.edu.bd/");
        } else  if(nuExam == 35) {

            myWebView.loadUrl("http://app1.nu.edu.bd/");
        } else  if(nuExam == 36) {

            myWebView.loadUrl("http://app1.nu.edu.bd/");
        }



        /***********************  BOU (others) EXAM  **************************/


        else  if(othersResult == 41) {

            myWebView.loadUrl("http://www.bou.ac.bd/result.php");
        } else  if(othersResult == 42) {

            myWebView.loadUrl("http://exam.bou.edu.bd/");
        }




        /***********************  Polytech EXAM  **************************/


        else  if(polytechResult == 51) {

            myWebView.loadUrl("http://123.49.52.26:1090/first_shift/SeatPlans/merit_list");
        } else  if(polytechResult == 52) {

            myWebView.loadUrl("http://123.49.52.26:1090/second_shift/SeatPlans/merit_list");
        } else  if(polytechResult == 53) {

            myWebView.loadUrl("http://www.bteb.gov.bd/site/page/a34671e3-a81c-4927-834f-19d6afc41217/");
        }



        /***********************  Medical EXAM  **************************/


        else  if(medicalResult == 61) {

            myWebView.loadUrl("http://result.dghs.gov.bd/");
        } else  if(medicalResult == 62) {

            myWebView.loadUrl("http://bcpsbd.org/result/");
        }




        /***********************  Admission EXAM  **************************/


        else  if(admissionResult == 71) {

            myWebView.loadUrl("https://allresultbd.com/admission-result/");
        }



        /***********************  PSC EXAM  **************************/


        else  if(pscResult == 81) {

            myWebView.loadUrl("http://www.bpsc.gov.bd/site/view/psc_exam/Non-Cadre%20Examination");
        }



        /***********************  BCS EXAM  **************************/


        else  if(bcsResult == 91) {

            myWebView.loadUrl("http://www.bpsc.gov.bd/site/view/psc_exam/BCS%20Examination/");
        }


        /***********************  Teachers EXAM  **************************/


        else  if(teachersResult == 111) {

            myWebView.loadUrl("http://ntrca.teletalk.com.bd/result/");
        }


        /***********************  Bank EXAM  **************************/


        else  if(bankResult == 221) {

            myWebView.loadUrl("https://erecruitment.bb.org.bd/");
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
