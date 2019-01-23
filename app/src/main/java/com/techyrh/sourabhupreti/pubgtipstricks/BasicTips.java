package com.techyrh.sourabhupreti.pubgtipstricks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;

public class BasicTips extends AppCompatActivity {
    AdView mAdView,mAdView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_tips);
        MobileAds.initialize(this,"ca-app-pub-7276248071776735~9446893227");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest1);

        TextView textView=findViewById(R.id.textView);
        textView.setText("Rishubh nanga hai");
      textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
