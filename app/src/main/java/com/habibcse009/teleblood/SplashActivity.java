package com.habibcse009.teleblood;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.habibcse009.teleblood.WelcomePage.WelcomeActivity;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import pl.droidsonroids.gif.GifImageView;

public class SplashActivity extends AppCompatActivity {
    int splashTimeOut = 4000;            //splash window time in mini secound
    GifImageView gifImageView;
    //TextView txtTitle;
    ShimmerTextView tv;
    Shimmer shimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        gifImageView = (GifImageView) findViewById(R.id.gf);
        //txtTitle = findViewById(R.id.txt_title);
        tv = (ShimmerTextView) findViewById(R.id.txt_title);

        //Initialize font
        //Typeface tf = Typeface.createFromAsset(getAssets(), "Quicksand-Regular.otf");
        Typeface tf = Typeface.createFromAsset(getAssets(), "AsapCondensed-Regular.ttf");
        //txtTitle.setTypeface(tf);
        tv.setTypeface(tf);

        shimmer = new Shimmer();
        shimmer.start(tv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashTimeOut);
    }

}
