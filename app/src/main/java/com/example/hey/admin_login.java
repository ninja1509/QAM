package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        final EditText pass = findViewById(R.id.editText);

        Button button = findViewById(R.id.log);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    if (pass.getText().toString().equals("admin")) {
                    Intent intent = new Intent(getApplicationContext(), a_choice.class);
                    startActivity(intent);
                }
                    else {
                        Toast.makeText(getApplicationContext(),"Enter correct password",Toast.LENGTH_SHORT).show();
                        }
        }
    });
}
    }
