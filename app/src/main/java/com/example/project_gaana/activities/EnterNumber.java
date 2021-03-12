package com.example.project_gaana.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project_gaana.R;

public class EnterNumber extends AppCompatActivity {
    private EditText mETphoneNumber;
    private Button mBTNbtnHome55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);
        mETphoneNumber = findViewById(R.id.phoneNumber);
        mBTNbtnHome55 = findViewById(R.id.btnHome55);
        mBTNbtnHome55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isCredValid()) {
                    Intent intent = new Intent(EnterNumber.this, GetOTP.class);
                    startActivity(intent);



                }

            }
        });


    }



    private boolean isCredValid() {

        boolean isValid = true;


        if (!isValidMobile()) {
            isValid = false;
        }

        return isValid;

    }


    private boolean isValidMobile() {
        if (android.util.Patterns.PHONE.matcher(mETphoneNumber.getText().toString()).matches() && mETphoneNumber.getText().toString().length() ==10) {
            return true;
        } else {
            mETphoneNumber.setError("Invalid mobile no");
            return false;
        }

    }


}