package com.example.collegeappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

    Button aboutus,contactus,course,admission,downloads,facility,facilities;
    TextView abouttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        aboutus = findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,aboutus.class);
                startActivity(intent);
                                       }
                                   }
        );

        abouttext = findViewById(R.id.abouttext);
        abouttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,aboutus.class);
                startActivity(intent);
            }
        });
        facility = findViewById(R.id.facility);
        facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,facility.class);
                startActivity(intent);
            }
        });
        facilities = findViewById(R.id.facilities);
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,facility.class);
                startActivity(intent);
            }
        });

        contactus = findViewById(R.id.contactus);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,contactus.class);
                startActivity(intent);
            }
        });

        course = findViewById(R.id.courses);
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,courses.class);
                startActivity(intent);
            }
        });
        admission = findViewById(R.id.admission);
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,admission.class);
                startActivity(intent);
            }
        });
        downloads = findViewById(R.id.downloads);
        downloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage.this,downloads.class);
                startActivity(intent);
            }
        });
    }
}