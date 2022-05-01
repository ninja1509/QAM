package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a_d_Streams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_streams);

        Button bt1 = findViewById(R.id.b_MCA);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity1Intent = new Intent(getApplicationContext(), a_MCA.class);
                startActivity(activity1Intent);
            }
        });

        Button bt2 = findViewById(R.id.b_MBA);
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), a_MBA.class);
                startActivity(activity2Intent);
            }
        });

    }

}