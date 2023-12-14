package com.example.fruitfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        configureResultsBackButton();
    }

    private void configureResultsBackButton() {
        Button resultsBack = (Button) findViewById(R.id.ResultsBackButton);
        resultsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    } //configureResultsBackButton

}