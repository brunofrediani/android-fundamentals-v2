package com.example.activitylifecycleandstatecodingchallenge;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtone,txtTwo,txtThree,txtFour,txtFive,txtSix,txtSeven,txtEight,txtNine,txtTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtone = findViewById(R.id.textView1);
        txtTwo = findViewById(R.id.textView2);
        txtThree = findViewById(R.id.textView3);
        txtFour = findViewById(R.id.textView4);
        txtFive = findViewById(R.id.textView5);
        txtSix = findViewById(R.id.textView6);
        txtSeven = findViewById(R.id.textView7);
        txtEight = findViewById(R.id.textView8);
        txtNine = findViewById(R.id.textView9);
        txtTen = findViewById(R.id.textView10);

            if (savedInstanceState != null){
                boolean isVisible =savedInstanceState.getBoolean("txtOneVisible");
                    if (isVisible){
                        txtone.setText(savedInstanceState.getString("itemName"));
                    }
            }

    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        launchSecondAct.launch(intent);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (txtone.getVisibility() == View.VISIBLE){
            outState.putBoolean("txtOneVisible", true);
            outState.putString("itemName",txtone.getText().toString());

        }
    }

    ActivityResultLauncher<Intent> launchSecondAct = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK){
                        Intent data = result.getData();
                        assert data != null;
                        String item =data.getStringExtra(SecondActivity.EXTRA_REPLY);
                        txtone.setText(item);
                    }
                }
            }
    );
}