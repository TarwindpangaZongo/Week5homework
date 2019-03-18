package com.example.week5homework;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIMER =2000;
    ImageView logoDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logoDisplay = findViewById(R.id.imgLogo);
        //ImageView imageView = (ImageView) findViewById(R.id.imgLogo);
        Glide.with(this)
                .load("http://goo.gl/gEgYUd")
                .into(logoDisplay);


        //Splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },SPLASH_TIMER);
    }
}
