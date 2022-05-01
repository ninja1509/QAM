package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a_choice extends AppCompatActivity {

    Button scanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_choice);

        Button butn = findViewById(R.id.scanBtn);
        butn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity3Intent = new Intent(getApplicationContext(), scanner.class);
                startActivity(activity3Intent);
            }
        });

        Button bt2 = findViewById(R.id.check);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity1Intent = new Intent(getApplicationContext(), attendence.class);
                startActivity(activity1Intent);
            }
        });

        Button bt3 = findViewById(R.id.Dmarks);
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), a_d_Streams.class);
                startActivity(activity2Intent);
            }
        });




    }
}
