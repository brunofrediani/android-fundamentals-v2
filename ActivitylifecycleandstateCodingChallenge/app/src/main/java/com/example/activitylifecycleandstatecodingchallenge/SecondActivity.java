package com.example.activitylifecycleandstatecodingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnTen;
    public static final String EXTRA_REPLY =
            "com.example.android.activitylifecycleandstatecodingchallenge.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnOne = findViewById(R.id.button1);
        btnTwo = findViewById(R.id.button2);
        btnThree = findViewById(R.id.button3);
        btnFour = findViewById(R.id.button4);
        btnFive = findViewById(R.id.button5);
        btnSix = findViewById(R.id.button6);
        btnSeven = findViewById(R.id.button7);
        btnEight = findViewById(R.id.button8);
        btnNine = findViewById(R.id.button9);
        btnTen = findViewById(R.id.button10);

    }

    public void itemShop(View view){
        String item = btnOne.getText().toString();
        Intent itemIntent = new Intent();
        itemIntent.putExtra(EXTRA_REPLY,item);
        setResult(RESULT_OK,itemIntent);
        finish();
    }

}