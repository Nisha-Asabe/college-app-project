package com.example.collegeappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class contactus extends AppCompatActivity {

    EditText name,message;
    Button submit_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        name = findViewById(R.id.name);
        message = findViewById(R.id.message);
        submit_message = findViewById(R.id.msg_send_btn);

        submit_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coding_event_data();
            }
        });

    }
    public void coding_event_data(){
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("Student's Name : ",name.getText().toString());
        map.put("Student's Mobile : ",message.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("Contact Form Information").push().setValue(map)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(), "Submitted Successfully", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }
                });


    }
}