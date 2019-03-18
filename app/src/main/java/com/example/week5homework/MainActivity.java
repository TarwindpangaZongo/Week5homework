package com.example.week5homework;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIMER =4000;

    Button viewPDFFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent splashIntent = new Intent(MainActivity.this, SplashActivity.class);
        startActivity(splashIntent);
        bindFields();

    }

    private void bindFields() {
        viewPDFFile = findViewById(R.id.btnViewPDFFile);
    }

    public void onClick(View view) {

    }


}
