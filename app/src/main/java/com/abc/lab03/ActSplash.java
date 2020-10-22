package com.abc.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_splash2);

        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent i = new Intent(ActSplash.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
                                  },
                5*1000); // wait for 5 seconds

    }

     @Override
        protected void onDestroy() {

        super.onDestroy();
    }
}