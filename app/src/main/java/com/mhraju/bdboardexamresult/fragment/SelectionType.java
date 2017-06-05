package com.mhraju.bdboardexamresult.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.mhraju.bdboardexamresult.R;


public class SelectionType extends Fragment implements View.OnClickListener {
    private Button mOnline;
    private Button mSms;
    private Button mRecheck;
    private AdView mAdView;


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
        
        mOnline= (Button) view.findViewById(R.id.online);
        mSms= (Button) view.findViewById(R.id.sms);
        mRecheck= (Button) view.findViewById(R.id.recheck);
        mOnline.setOnClickListener(this);
        mSms.setOnClickListener(this);
        mRecheck.setOnClickListener(this);
        return view;
    }
    
    @Override
    public void onClick(View v) {
        switch (getId()){
            case R.id.online:
                break;
            case R.id.sms:
                break;
            case R.id.recheck:
                break;
        }

    }


}
