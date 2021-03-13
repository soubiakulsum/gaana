package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.broooapps.otpedittext2.OtpEditText;
import com.example.project_gaana.R;

public class Otp_page extends AppCompatActivity {

    private OtpEditText otpEditText;

    private Button MBTNbtnHome44;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_page);
        Handler handle = new Handler();
        otpEditText = findViewById(R.id.etOtp);
        MBTNbtnHome44 = findViewById(R.id.btnHome44);

        MBTNbtnHome44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Otp_page.this,"Entering the otp",Toast.LENGTH_SHORT).show();

            }
        });

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Otp_page.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}
