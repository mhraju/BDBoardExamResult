package com.mhraju.bdboardexamresult.fragment;


import android.app.PendingIntent;
import android.content.Intent;
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
import android.widget.Toast;

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
    private ArrayAdapter<String> adapterBoard;
    private ArrayAdapter<String> adapterJsc;
    private ArrayAdapter<String> adapterDegree;
    private String name;
    private String code;
    private String year;
    private String roll;
    private String board;
    private String [] boardList={"Select Exam Board","Barisal","Chittagong","Comilla","Dhaka","Dinajpur","Jessor",
    "Rajshahi","Sylhet","Mdarasah","Techinal","DIBS(Dhaka)"};
    private String[] mExamList1={"Select Exam Name","Primary School Certificate(PSC)","Madrasa(Ebteday)"};
    private String[] mYesrList={"Select Exam Year","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021",
            "2022","2023","2024","2025"};
    private String [] mJSC={"Select Exam Name","Junior School Certificate(JSC)","Junior Dakhil Certificate(JDC)","SSC/Dakhil/Vocational/Equivalent","HSC/Alim/Vocational/Equivalent"};
    private String[] mDegree={"Select Exam Name","Degree","Honours 1st year","Honours 2nd year","Honours 3rd year","Honours 4th year","Masters Preli","Masters Final","Admission Test","M.Ed","B.Ed","LLB First Part","LLB Final Part","BPED"};
    private Bundle bundle;
    private String value;
    private int id;
    private int track;
    private  SmsManager smsManager;


    public SmsManagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sms_manager, container, false);
        mExamName= (Spinner) view.findViewById(R.id.sName);
        mYear= (Spinner) view.findViewById(R.id.sYear);
        mBoard= (Spinner) view.findViewById(R.id.sBoard);
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


        adapterBoard=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,boardList);
        adapterBoard.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBoard.setAdapter(adapterBoard);



        adapterDegree=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mDegree);
        adapterDegree.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mExamName.setAdapter(adapterDegree);


        if (id==1){
            track=1;
            mThanaCode.setVisibility(View.VISIBLE);
            adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mExamList1);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mExamName.setAdapter(adapter);


        }
        else if(id==2 || id==3 || id==4){
            track=2;
            mBoard.setVisibility(View.VISIBLE);
            adapterJsc=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mJSC);
            adapterJsc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mExamName.setAdapter(adapterJsc);



        }
        else {
            track=3;
            mThanaCode.setVisibility(View.GONE);
            mBoard.setVisibility(View.GONE);
            mYear.setVisibility(View.GONE);
            adapterDegree=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,mDegree);
            adapterDegree.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mExamName.setAdapter(adapterDegree);


        }

        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code=mThanaCode.getText().toString();
                roll=mRoll.getText().toString();
                year=mYear.getSelectedItem().toString();
                board=mBoard.getSelectedItem().toString();
                name=mExamName.getSelectedItem().toString();
                SmsManager sms = SmsManager.getDefault();
                PendingIntent sentPI;
                String SENT = "SMS_SENT";

                sentPI = PendingIntent.getBroadcast(getActivity(), 0,new Intent(SENT), 0);

                if (track==1) {
                    if(name.equals("Primary School Certificate(PSC)"))
                    {
                        value="PSC"+" "+code+ " "+roll+" "+year;
                    }
                    else {
                        value="EBT"+" "+code+ " "+roll+" "+year;
                    }

                    Log.e("value", "onClick: "+value );
//                    smsManager.sendTextMessage( null, value, null, null);
                    sms.sendTextMessage("16222", null, value, sentPI, null);

                }
                else if(track==2){
                    if(name.equals("Junior School Certificate(JSC)")) {
                        value = "JSC" + " " + board + " " + roll + " " + year;
                    }
                    else if(name.equals("Junior Dakhil Certificate(JDC)")){
                        value = "JDC" + " " + board + " " + roll + " " + year;
                    }
                    else if(name.equals("SSC/Dakhil/Vocational/Equivalent")){
                        value = "SSC" + " " + board + " " + roll + " " + year;
                    }
                    else if(name.equals("HSC/Alim/Vocational/Equivalent")){
                        value = "HSC" + " " + board + " " + roll + " " + year;
                    }
                    Log.e("value", "onClick: "+value );
//                    smsManager.sendTextMessage(, null, value, null, null);
                    sms.sendTextMessage("16222", null, value, sentPI, null);

                }
                else if(track==3){
                    if(name.equals("Degree")) {
                        value="NU "+"DEG"+" "+roll;
                    }
                    else if(name.equals("Honours 1st year")){
                        value="NU "+"H1"+" "+roll;
                    }
                    else if(name.equals("Honours 2nd year")){
                        value="NU "+"H2"+" "+roll;
                    }
                    else if(name.equals("Honours 3rd year")){
                        value="NU "+"H3"+" "+roll;
                    }
                    else if(name.equals("Honours 4th year")){
                        value="NU "+"H4"+" "+roll;
                    }
                    else if(name.equals("Masters Preli")){
                        value="NU "+"MP"+" "+roll;
                    }
                    else if(name.equals("Masters Final")){
                        value="NU "+"MF"+" "+roll;
                    }
                    else if(name.equals("Admission Test")){
                        value="NU "+"AT"+" "+roll;
                    }
                    else if(name.equals("M.Ed")){
                        value="NU "+"MED"+" "+roll;
                    }
                    else if(name.equals("B.Ed")){
                        value="NU "+"BED"+" "+roll;
                    }
                    else if(name.equals("LLB First Part")){
                        value="NU "+"LLB1"+" "+roll;
                    }
                    else if(name.equals("LLB Final Part")){
                        value="NU "+"LLBF"+" "+roll;
                    }else if(name.equals("BPED")){
                        value="NU "+"BPED"+" "+roll;
                    }
                    Log.e("value", "onClick: "+value );

                    sms.sendTextMessage("16222", null, value, sentPI, null);

                }
            }
        });

        return view;
    }

}
