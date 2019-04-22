package com.example.practiceopennewactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private Button buttonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonReturn = findViewById(R.id.ButtonReturn);

        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonReturn();
            }
        });

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textViewText = findViewById(R.id.TextViewStringDisplay);
        TextView textViewNumber = findViewById(R.id.TextViewNumberDisplay);

        textViewText.setText(text);
        textViewNumber.setText("" +number);
    }

    public void ButtonReturn() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
