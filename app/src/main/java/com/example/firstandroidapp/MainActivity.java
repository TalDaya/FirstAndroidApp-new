package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // onCreate - an event
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // set the content of the screen

        Button btn = findViewById(R.id.button);
        btn.setText("Click Me!");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  btn.setText("Button Clicked!"); // changes whats written on the button after we click
              Toast.makeText(v.getContext(),"Button Clicked!", Toast.LENGTH_LONG).show();
            }
        });
    }
}