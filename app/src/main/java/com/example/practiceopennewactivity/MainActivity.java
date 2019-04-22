package com.example.practiceopennewactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Constants for put extra
    public static final String EXTRA_TEXT = "com.example.practiceopennewactivity.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.practiceopennewactivity.EXTRA_NUMBER";

    private Button buttonActivity1;
    private Button buttonReturnForResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Store reference to the buttons
        buttonActivity1 = findViewById(R.id.ButtonOpenActivity2);
        buttonReturnForResult = findViewById(R.id.ButtonActivityForReturn);


        // On click listener for the button
        buttonActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        // On click listener for the return result button
        buttonReturnForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReturnForResultActivity();
            }
        });
    }

    // Function which opens the second activity and
    public void openActivity2() {
        // Get the text from the Text edit text.
        EditText editTextString = findViewById(R.id.EditTxtString);
        String text = editTextString.getText().toString();

        // Get the number from the number edit text
        EditText editTextNumber = findViewById(R.id.EditTxtInt);
        int number = Integer.parseInt(editTextNumber.getText().toString());

        // Open the second activity
        Intent activity2 = new Intent(this, Activity2.class);

        // Pass these values as extra, using the constants as identifier keys.
        activity2.putExtra(EXTRA_TEXT, text);
        activity2.putExtra(EXTRA_NUMBER, number);

        // Start the activity
        startActivity(activity2);
    }

    public void openReturnForResultActivity() {
        Intent intent = new Intent(this, ReturnForResult.class);
        startActivity(intent);
    }
}
