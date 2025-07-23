package com.example.collegeappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userselections extends AppCompatActivity {

    Button loginbutton,signupbutton,guestlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userselections);

        loginbutton = findViewById(R.id.login_button);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userselections.this,loginscreen.class);
                startActivity(intent);
            }
        });

        signupbutton = findViewById(R.id.signup_button);
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userselections.this,signupscreen.class);
                startActivity(intent);
            }
        });

        guestlogin = findViewById(R.id.guest_button);
        guestlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userselections.this,homepage.class);
                startActivity(intent);
            }
        });
    }
}