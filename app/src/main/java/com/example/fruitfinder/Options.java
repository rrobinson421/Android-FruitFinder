package com.example.fruitfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        configureOptionsBackButton();
        configureOptionsGenerateButton();
    }

    private void configureOptionsBackButton() {
        Button optionsBack = (Button) findViewById(R.id.OptionsBackButton);
        optionsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    } //configureOptionsGenerateButton

    private void configureOptionsGenerateButton() {
        Button newGen = (Button) findViewById(R.id.GenerateButton);
        newGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Test for information, then startActivity -> ApiAppMain.generateFruit?
                startActivity(new Intent(Options.this, Results.class));
            }
        });
    } //configureOptionsGenerateButton

}