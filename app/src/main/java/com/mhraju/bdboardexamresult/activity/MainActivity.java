package com.mhraju.bdboardexamresult.activity;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.mhraju.bdboardexamresult.R;
import com.mhraju.bdboardexamresult.fragment.HomeFragment;
import com.mhraju.bdboardexamresult.fragment.SelectionType;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    private Button boardResult, admissionResult, pscResult, nuExam, medicalResult, othersResult;
    private int trackId;

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8651520695")
                .build();
        mAdView.loadAd(adRequest);


        mInterstitialAd = createNewIntAd();
        loadIntAdd();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
        getHome();

    }



    private void getHome(){

        Fragment fragment=new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerHome, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
                new AlertDialog.Builder(this)
                        .setTitle("Powered by : Tech_Nerds")
                        .setMessage(
                                "Email : technerds1993@gmail.com\n\n" +
                                        "Blog : https://mhraju.github.io\n")
                        .setPositiveButton("OK", null)
                        .show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.board) {
            trackId = 10;
            showIntAdd();
            getSelection();
            // Handle the camera action
        } else if (id == R.id.admission) {
            trackId = 11;
            showIntAdd();
            getSelection();

        } else if (id == R.id.psc) {
            trackId = 12;
            showIntAdd();
            getSelection();

        } else if (id == R.id.bcs) {
            trackId = 17;
            showIntAdd();
            getSelection();

        } else if (id == R.id.medical) {
            trackId = 14;
            showIntAdd();
            getSelection();

        } else if (id == R.id.poly) {
            trackId = 16;
            showIntAdd();
            getSelection();

        }else if (id == R.id.nu) {
            trackId = 13;
            showIntAdd();
            getSelection();

        } else if (id == R.id.bou) {
            trackId = 15;
            showIntAdd();
            getSelection();

        } else if (id == R.id.teachers) {
            trackId = 18;
            showIntAdd();
            getSelection();

        } else if (id == R.id.bank) {
            trackId = 19;
            showIntAdd();
            getSelection();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void  getSelection(){

        Bundle bundle = new Bundle();
        bundle.putInt("boardResult",trackId);
        bundle.putInt("admissionResult",trackId);
        bundle.putInt("pscResult",trackId);
        bundle.putInt("nuExam",trackId);
        bundle.putInt("medicalResult",trackId);
        bundle.putInt("othersResult",trackId);
        bundle.putInt("teachersResult",trackId);
        bundle.putInt("bankResult",trackId);
        bundle.putInt("bcsResult",trackId);
        bundle.putInt("polytechResult",trackId);
        Fragment fragment=new SelectionType();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerHome, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }




    private InterstitialAd createNewIntAd() {
        InterstitialAd intAd = new InterstitialAd(getApplicationContext());
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
