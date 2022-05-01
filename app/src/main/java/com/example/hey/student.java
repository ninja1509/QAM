package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Button bt1 = findViewById(R.id.gen);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity1Intent = new Intent(getApplicationContext(), qrgenerate.class);
                startActivity(activity1Intent);
            }
        });

        Button bt2 = findViewById(R.id.noti);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), attendence.class);
                startActivity(activity2Intent);
            }
        });

        Button bt3 = findViewById(R.id.mSheet);
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity3Intent = new Intent(getApplicationContext(), m_selection.class);
                startActivity(activity3Intent);
            }
        });

    }
}
