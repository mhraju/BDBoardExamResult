package com.mhraju.bdboardexamresult.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mhraju.bdboardexamresult.R;


public class SelectionType extends Fragment implements View.OnClickListener {
    private Button mOnline;
    private Button mSms;
    private Button mRecheck;


    private SelectionTypeListener mListener;

    public SelectionType() {
        // Required empty public constructor
    }

    public static SelectionType newInstance(String param1, String param2) {
        SelectionType fragment = new SelectionType();

        return fragment;
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
        mOnline= (Button) view.findViewById(R.id.online);
        mSms= (Button) view.findViewById(R.id.sms);
        mRecheck= (Button) view.findViewById(R.id.recheck);
        mOnline.setOnClickListener(this);
        mSms.setOnClickListener(this);
        mRecheck.setOnClickListener(this);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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

    public interface SelectionTypeListener {

        void onFragmentInteraction(Uri uri);
    }
}
