package com.example.hey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class a_MCA extends AppCompatActivity {

    SwitchCompat fymca = findViewById(R.id.fymca);
    SwitchCompat symca = findViewById(R.id.symca);
    int loc_fy = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amca);

        SharedPreferences fyMca = getSharedPreferences("save", MODE_PRIVATE);
        SharedPreferences syMca = getSharedPreferences("save", MODE_PRIVATE);

        if(fymca.isChecked()) {
            fymca.setOnClickListener((View.OnClickListener) this);
            loc_fy=1;
        }
//        fymca.setChecked(fyMca.getBoolean("value", true));




    }

    private void   declareMCA(String year) {

        final ProgressDialog loading = ProgressDialog.show(this,"Displaying result","Please wait");
        final String years = year.toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "Add Your Web App URL",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(a_MCA.this,response,Toast.LENGTH_LONG).show();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","declareMCAresult");
                parmas.put("yearStream",years);
                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }




    public void onClick(View view){
        if (view == fymca){
            String fymcaa = "fymca";
            declareMCA(fymcaa);
        }
    }


}