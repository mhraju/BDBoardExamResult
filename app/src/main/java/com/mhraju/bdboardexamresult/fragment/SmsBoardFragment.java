package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        bundle=new Bundle();
        mPsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",2);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        mVoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",3);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        mHvoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",4);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        mDegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",5);
               fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        honour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",6);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        masters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",7);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });
        NU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SmsManagerFragment();
                bundle.putInt("id",8);
                fragment.setArguments(bundle);
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.containerHome,fragment);
                ft.addToBackStack(null);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
