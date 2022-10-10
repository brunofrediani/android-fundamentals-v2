package com.example.activ_intents_codingchallenge;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.activ_intents_codingchallenge.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG,"Button one Clicked!!!!!!!!!!");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "TEXTO DO BUTAO ONE ";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,TEXT_REQUEST);
        
    }
    public void launchSecondActivity2(View view) {

        Log.d(LOG_TAG,"Button one Clicked!!!!!!!!!!");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "TEXTO DO BUTAO TWO ";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,TEXT_REQUEST);

    }
    public void launchSecondActivity3(View view) {

        Log.d(LOG_TAG,"Button one Clicked!!!!!!!!!!");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "TEXTO DO BUTAO THREE ";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,TEXT_REQUEST);

    }
}