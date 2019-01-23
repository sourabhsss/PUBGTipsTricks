package com.techyrh.sourabhupreti.pubgtipstricks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;


public class MainActivity extends AppCompatActivity {
    Button basics,ar,sniper,shot,nades,exit;
    TextView intro;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-7276248071776735~9446893227");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        intro= findViewById(R.id.intro);
        basics= findViewById(R.id.basics);
        ar= findViewById(R.id.ar);
        sniper= findViewById(R.id.snipers);
        shot= findViewById(R.id.shotguns);
        nades= findViewById(R.id.nades);
        exit= findViewById(R.id.exit);

        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BasicTips.class);
                startActivity(intent);

            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ar.class);
                startActivity(intent);

            }
        });
        sniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,sniper.class);
                startActivity(intent);

            }
        });
        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,shot.class);
                startActivity(intent);

            }
        });
        nades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,nades.class);
                startActivity(intent);

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();

            }
        });
    }
}
