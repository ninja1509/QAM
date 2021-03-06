package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class qrgenerate extends AppCompatActivity {

    EditText qrvalue;
    Button generateBtn;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrgenerate);

        qrvalue = findViewById(R.id.qrInput);
        generateBtn = findViewById(R.id.generaterBtn);
        qrImage = findViewById(R.id.qrPlaceHolder);

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = qrvalue.getText().toString();
                int count = 0;

                //Counts each character except space
                for(int i = 0; i < data.length(); i++) {
                    if(data.charAt(i) != ' ')
                        count++;
                }
                if(data.isEmpty() || count!=5) {
                 qrvalue.setError("Enter correct SRN");
                 }
                else {
                    QRGEncoder qrgEncoder = new QRGEncoder(data,null, QRGContents.Type.TEXT, 500);
                    try {
                        Bitmap qrBits = qrgEncoder.getBitmap();
                        qrImage.setImageBitmap(qrBits);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
