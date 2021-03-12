package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.broooapps.otpedittext2.OnCompleteListener;
import com.broooapps.otpedittext2.OtpEditText;
import com.example.project_gaana.R;

public class GetOTP extends AppCompatActivity {
    private OtpEditText otpEditText;

    private Button MBTNbtnHome44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_o_t_p);

        otpEditText = findViewById(R.id.etOtp);
        MBTNbtnHome44 = findViewById(R.id.btnHome44);
        MBTNbtnHome44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetOTP.this, MainActivity.class);
                startActivity(intent);
            }
        });

        otpEditText.setOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(String value) {
                activityTriversalWithAnimation(MainActivity.class);
            }
        });
    }

    private void activityTriversalWithAnimation(Class classname) {
        Intent intent = new Intent(GetOTP.this, classname);
        startActivity(intent);
    }
}