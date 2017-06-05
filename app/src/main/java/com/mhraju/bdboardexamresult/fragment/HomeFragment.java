package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mhraju.bdboardexamresult.R;


public class HomeFragment extends Fragment {

    private Button boardResult, admissionResult, pscResult, nuExam, medicalResult, othersResult;
    private int trackId;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);


        boardResult = (Button) view.findViewById(R.id.boardResult);
        admissionResult = (Button) view.findViewById(R.id.admissionResult);
        pscResult = (Button) view.findViewById(R.id.pscResult);
        nuExam = (Button) view.findViewById(R.id.nuExam);
        medicalResult = (Button) view.findViewById(R.id.medicalResult);
        othersResult = (Button) view.findViewById(R.id.othersResult);


        boardResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 10;
                getSelection();
            }
        });

        admissionResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 11;
                getSelection();

            }
        });

        pscResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 12;
                getSelection();

            }
        });

        nuExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 13;

                getSelection();

            }
        });

        medicalResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 14;
                getSelection();

            }
        });

        othersResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trackId = 15;
                getSelection();

            }
        });


        return  view;
    }


    public void  getSelection(){



        Bundle bundle = new Bundle();
        bundle.putInt("boardResult",trackId);
        bundle.putInt("admissionResult",trackId);
        bundle.putInt("pscResult",trackId);
        bundle.putInt("nuExam",trackId);
        bundle.putInt("medicalResult",trackId);
        bundle.putInt("othersResult",trackId);
        Fragment fragment=new SelectionType();
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.containerHome, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

}
