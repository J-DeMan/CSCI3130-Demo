package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Changes the output view text to the text currently in the input view
    public void apply(View v) {
        TextView inputField = findViewById(R.id.inputView);
        TextView outputField = findViewById(R.id.outputView);
        outputField.setText(inputField.getText());
    }
}
