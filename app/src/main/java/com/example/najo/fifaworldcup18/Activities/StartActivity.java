package com.example.najo.fifaworldcup18.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.najo.fifaworldcup18.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(StartActivity.this , HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        } ;

        handler.postDelayed(runnable , 3000);
    }
}
