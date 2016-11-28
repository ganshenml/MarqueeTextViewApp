package com.example.administrator.marqueetextviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MarqueeTextView marqueeTv;
    private String [] textArrays = new String[]{"this is content No.1","this is content No.2","this is content No.3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marqueeTv = (MarqueeTextView) findViewById(R.id.marqueeTv);

        marqueeTv.setTextArraysAndClickListener(textArrays, new MarqueeTextViewClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AnotherActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        marqueeTv.releaseResources();
        super.onDestroy();
    }
}
