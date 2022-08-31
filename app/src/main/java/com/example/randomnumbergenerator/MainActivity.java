package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText rangeStart;
    private EditText rangeEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setText("Enter Range!");

        rangeStart = findViewById(R.id.editTextNumberSigned);
        rangeEnd = findViewById(R.id.editTextNumberSigned2);



        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if((String.valueOf(rangeStart.getText())).equals("") || (String.valueOf(rangeEnd.getText())).equals("")){

                    textView.setText("Enter Range!");
                }
                else {

                    int start = Integer.parseInt(String.valueOf(rangeStart.getText()));
                    int end = Integer.parseInt(String.valueOf(rangeEnd.getText()));

                    int random = (int) (Math.random() * (end - start + 1) + start);

                    textView.setText("" + random);
                }
            }

        });



    }
}