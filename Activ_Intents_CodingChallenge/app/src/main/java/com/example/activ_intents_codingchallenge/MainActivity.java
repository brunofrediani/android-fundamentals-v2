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
        //startActivity for result deprecated
        //startActivityForResult(intent,TEXT_REQUEST);
        launchSecondActivityResult.launch(intent);
    }

    ActivityResultLauncher<Intent> launchSecondActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK){
                    Intent data = result.getData();
                    assert data != null;
                }
            }
    );



    public void launchSecondActivity2(View view) {

        Log.d(LOG_TAG,"Button one Clicked!!!!!!!!!!");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "TEXTO DO BUTAO TWO ";
        intent.putExtra(EXTRA_MESSAGE,message);
       //startActivity for result deprecated
        // startActivityForResult(intent,TEXT_REQUEST);
        launchSecondActivityResult2.launch(intent);

    }

    ActivityResultLauncher<Intent> launchSecondActivityResult2 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK){
                    Intent data = result.getData();
                    assert data != null;
                }
            }
    );


    public void launchSecondActivity3(View view) {

        Log.d(LOG_TAG,"Button one Clicked!!!!!!!!!!");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "TEXTO DO BUTAO THREE ";
        intent.putExtra(EXTRA_MESSAGE,message);
        //startActivity for result deprecated
        // startActivityForResult(intent,TEXT_REQUEST);
    launchSecondActivityResult3.launch(intent);
    }
    ActivityResultLauncher<Intent> launchSecondActivityResult3 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK){
                        Intent data = result.getData();
                        assert data != null;
                    }
                }
            }
    );
}