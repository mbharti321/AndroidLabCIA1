package com.example.manotollpay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtVehiclesCount, mTxtAmountCollected;

    int vehiclesCount = 0;
    int amountCollected = 0;

    //feeChart


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtn2Wheeler = findViewById(R.id.btn2Wheeler);
        Button mBtn4Wheeler = findViewById(R.id.btn4Wheeler);
        Button mBtnRFID = findViewById(R.id.btnRFID);
        Button mBtnTruckBus = findViewById(R.id.btnTruckBus);
        Button mBtnVipPass = findViewById(R.id.btnVipPass);
        Button mBtnReset = findViewById(R.id.btnReset);

        mTxtVehiclesCount = findViewById(R.id.txtVehiclesCount);
        mTxtAmountCollected = findViewById(R.id.txtAmountCollected);



        mBtn2Wheeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount++;
                amountCollected += 100;
                display();
            }
        });

        mBtn4Wheeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount++;
                amountCollected += 200;
                display();
            }
        });

        mBtnTruckBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount++;
                amountCollected += 400;
                display();
            }
        });

        mBtnRFID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount++;
                amountCollected += 50;
                display();
            }
        });

        mBtnVipPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount++;
                amountCollected += 0;
                display();
            }
        });


        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehiclesCount = 0;
                amountCollected = 0;
                display();
            }
        });

    }

    @SuppressLint("SetTextI18n")
    private void display() {
        mTxtVehiclesCount.setText(Integer.toString(vehiclesCount));
        mTxtAmountCollected.setText(Integer.toString(amountCollected));
    }
}