package com.example.apps.oktaatr.pdam_controlling;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen  extends AppCompatActivity {
    private ImageView iv1,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        final Intent i=new Intent(SplashScreen.this,LoginActivity.class);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }

            }
        };
        timer.start();
    }
}
