package com.example.collegeappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int Splash_screen = 8000;
    Animation topanim,bottomanim;
    ImageView logo;
    TextView tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topanim = AnimationUtils.loadAnimation(this,R.anim.topanim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottomanim);
        logo = findViewById(R.id.splash_logo);
        tagline = findViewById(R.id.splash_tagline);
        logo.setAnimation(topanim);
        tagline.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,userselections.class);
                startActivity(intent);
                finish();
            }
        },Splash_screen);
    }
    }
