package com.example.reubro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread t = new Thread(){

            public void run(){
                try {
                    sleep(5000);

                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);

                    finish();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }
}
