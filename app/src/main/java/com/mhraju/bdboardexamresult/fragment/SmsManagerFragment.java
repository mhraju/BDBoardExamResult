package com.mhraju.bdboardexamresult.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.mhraju.bdboardexamresult.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SmsManagerFragment extends Fragment {
    private Spinner mExamName;
    private Spinner mYear;
    private Spinner mBoard;
    private EditText mThanaCode;
    private EditText mRoll;
    private Button mSend;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> adapteryear;
    private String name;
    private String code;
    private String year;
    private String roll;
    private String [] boardList={"Select Exam Board","Barisal","Chittagong","Comilla","Dhaka","Dinajpur","Jessor",
    "Rajshahi","Sylhet","Mdarasah"};
    private String[] mExamList1={"Select Exam Name","Primary School Certificate(PSC)","Madrasa(Ebteday)"};
    private String[] mYesrList={"Select Exam Year","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021",
            "2022","2023","2024","2025"};
    private Bundle bundle;
    private int id;


    public SmsManagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sms_manager, container, false);
        mExamName= (Spinner) view.findViewById(R.id.eName);
        mYear= (Spinner) view.findViewById(R.id.year);
        mThanaCode= (EditText) view.findViewById(R.id.tCode);
        mRoll= (EditText) view.findViewById(R.id.roll);
        mSend= (Button) view.findViewById(R.id.send);
        bundle=this.getArguments();
        if(bundle!=null){
            id=bundle.getInt("id");
        }


        adapteryear=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mYesrList);
        adapteryear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mYear.setAdapter(adapteryear);
        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();
                code=mThanaCode.getText().toString();
                roll=mRoll.getText().toString();
                year=mYear.getSelectedItem().toString();
                if(id==1) {
                    adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mExamList1);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    mExamName.setAdapter(adapter);
                     name=mExamName.getSelectedItem().toString();
                String value=name+" "+code+ " "+roll+" "+year;
                Log.e("iren",value);


                    smsManager.sendTextMessage("16222", null, value, null, null);
                }
                if(id==2){
                    mThanaCode.setVisibility(View.GONE);
                    mBoard.setVisibility(View.VISIBLE);
                    adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,boardList);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    mExamName.setAdapter(adapter);
                    name=mExamName.getSelectedItem().toString();
                    String value=name+" "+code+ " "+roll+" "+year;
                    smsManager.sendTextMessage("16222", null, value, null, null);

                }
                if(id==3){

                }
            }
        });

        return view;
    }

}
