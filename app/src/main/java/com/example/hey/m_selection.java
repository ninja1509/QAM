package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mselection);

        Button bt1 = findViewById(R.id.b_FYMCA);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //coding yet to be done
                Intent activity3Intent = new Intent(getApplicationContext(), m_selection.class);
                startActivity(activity3Intent);
            }
        });


    }
}