package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project_gaana.R;

public class Phone_Authentication extends AppCompatActivity {

    private EditText mETphoneNumber;
    private Button mBTNbtnHome55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone__authentication);

        mETphoneNumber = findViewById(R.id.phoneNumber);
        mBTNbtnHome55 = findViewById(R.id.btnHome55);

        mBTNbtnHome55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialsValid()) { // means if (the method isCredentialsValid(){that returns a boolean} == true) {}
                    Intent intent = new Intent(Phone_Authentication.this,Otp_page.class);
                    startActivity(intent);
                }
            }
        });

    }

    private boolean isCredentialsValid() {
        boolean isDataValid = true;
        String data = mETphoneNumber.getText().toString();
        if (mETphoneNumber.getText().toString().length() != 10) {
            mETphoneNumber.setError("Invalid phone no. Must be 10 digits");
            isDataValid = false;
        }
        return isDataValid;
    }

}