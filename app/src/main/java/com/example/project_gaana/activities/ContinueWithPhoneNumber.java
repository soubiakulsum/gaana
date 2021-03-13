package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project_gaana.R;

public class ContinueWithPhoneNumber extends AppCompatActivity {
    private Button mBTNContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_with_phone_number);
        mBTNContinue= findViewById(R.id.btnHome45);
        mBTNContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContinueWithPhoneNumber.this,Phone_Authentication.class);
                startActivity(intent);

                ///xxx
            }
        });

    }
}