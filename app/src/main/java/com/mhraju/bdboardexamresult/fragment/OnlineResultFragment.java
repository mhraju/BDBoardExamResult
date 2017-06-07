package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    private ImageView image1, image2, image3, image4, image5,  image6;
    private TextView textView1, textView2, textView3,textView4, textView5, textView6;
    private int boardResult;
    private int admissionResult;
    private int pscResult;
    private int nuExam;
    private int medicalResult;
    private int othersResult;
    private int teachersResult;
    private int bankResult;
    private int bcsResult;
    private int polytechResult;

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


        image1 = (ImageView) view.findViewById(R.id.image1);
        image2 = (ImageView) view.findViewById(R.id.image2);
        image3 = (ImageView) view.findViewById(R.id.image3);
        image4 = (ImageView) view.findViewById(R.id.image4);
        image5 = (ImageView) view.findViewById(R.id.image5);
        image6 = (ImageView) view.findViewById(R.id.image6);


        textView1 = (TextView) view.findViewById(R.id.textView1);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        textView5 = (TextView) view.findViewById(R.id.textView5);
        textView6 = (TextView) view.findViewById(R.id.textView6);




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
        teachersResult = getData.getInt("teachersResult");
        bankResult = getData.getInt("bankResult");
        bcsResult = getData.getInt("bcsResult");
        polytechResult = getData.getInt("polytechResult");



        if(boardResult == 10){

            image1.setImageResource(R.drawable.bangladesh_board);
            image2.setImageResource(R.drawable.psc);
            image3.setImageResource(R.drawable.ssc);
            image4.setImageResource(R.drawable.ssc);
            image5.setImageResource(R.drawable.ssc);
            image6.setImageResource(R.drawable.madrasha);


            textView1.setText("Education Board Results");
            textView2.setText("PSC / Ebtedayi Results");
            textView3.setText("JSC,SSC,HSC/Equivalent Results");
            textView4.setText("SSC (Voc) Results");
            textView5.setText("HSC (Voc) Results");
            textView6.setText("Alim, Dakhil Results");

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


        else if (nuExam == 13){

            image1.setImageResource(R.drawable.national_university_logo);
            image2.setImageResource(R.drawable.national_university_logo);
            image3.setImageResource(R.drawable.national_university_logo);
            image4.setImageResource(R.drawable.national_university_logo);
            image5.setImageResource(R.drawable.national_university_logo);
            image6.setImageResource(R.drawable.national_university_logo);


            textView1.setText("NU Exam Results");
            textView2.setText("Honours Admission Results");
            textView3.setText("Degree Admissiomn Results");
            textView4.setText("Masters Preliminary Results");
            textView5.setText("Masters Final Results");
            textView6.setText("Masters Professsional Results");


            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("nuExam",31);
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
                    bundle.putInt("nuExam",32);
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
                    bundle.putInt("nuExam",33);
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
                    bundle.putInt("nuExam",34);
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
                    bundle.putInt("nuExam",35);
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
                    bundle.putInt("nuExam",36);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });

        }




        else if (othersResult  ==  15) {

            image1.setImageResource(R.drawable.bou_logo);
            image2.setImageResource(R.drawable.bou_logo);


            textView1.setText("BOU Final Exam Results");
            textView2.setText("BOU Detail, Year Wise, \n Semester Wise Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("othersResult",41);
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
                    bundle.putInt("othersResult",42);
                    Fragment fragment=new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });

        }




        else if (polytechResult  ==  16) {


            image1.setImageResource(R.drawable.vocational_board);
            image2.setImageResource(R.drawable.vocational_board);
            image3.setImageResource(R.drawable.vocational_board);

            textView1.setText("Polytechnic Admission (1st Shift) Results");
            textView2.setText("Polytechnic Admission (2nd Shift) Results");
            textView3.setText("BTEB Diploma Results");


            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("polytechResult", 51);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
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
                    bundle.putInt("polytechResult", 52);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
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
                    bundle.putInt("polytechResult", 53);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });


        }

        else if (medicalResult == 14){

            image1.setImageResource(R.drawable.mbbs);
            image2.setImageResource(R.drawable.bcps_logo);


            textView1.setText("MBBS & BDS Admission Test Results");
            textView2.setText("BCPS Final Exam Results");


            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("medicalResult", 61);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
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
                    bundle.putInt("medicalResult", 62);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });

        }




        else if (admissionResult == 11){

            image1.setImageResource(R.drawable.du_logo);

            textView1.setText("Admission Test Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("admissionResult", 71);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }
            });

        }



        else if (pscResult == 12){

            image1.setImageResource(R.drawable.bangladesh_board);

            textView1.setText("Public Service Commision (PSC) Exam Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("pscResult", 81);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();


                }
            });

        }




        else if (bcsResult == 17){

            image1.setImageResource(R.drawable.bangladesh_board);

            textView1.setText("BCS Exam Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("bcsResult", 91);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });

        }



        else if (teachersResult == 18){

            image1.setImageResource(R.drawable.bangladesh_board);

            textView1.setText("Teachers Job Exam Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("teachersResult", 111);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.containerHome, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }
            });

        }




        else if (bankResult == 19){

            image1.setImageResource(R.drawable.bbank);

            textView1.setText("Bank Job Exam Results");

            card1.setVisibility(View.VISIBLE);
            card1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showIntAdd();

                    Bundle bundle = new Bundle();
                    bundle.putInt("bankResult", 221);
                    Fragment fragment = new OnlineResultWebViewFragment();
                    fragment.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
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
