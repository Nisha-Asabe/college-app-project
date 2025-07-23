package com.example.collegeappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class courses extends AppCompatActivity {

    Button civilcourse,computercourse,mechcourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        civilcourse = findViewById(R.id.civilengineering);
        civilcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(courses.this,civileng.class);
                startActivity(intent);
            }
        });

        computercourse = findViewById(R.id.computerengineering);
        computercourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(courses.this,computereng.class);
                startActivity(intent);
            }
        });

        mechcourse = findViewById(R.id.mechanicalengineering);
        mechcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(courses.this,mecheng.class);
                startActivity(intent);
            }
        });
    }
}