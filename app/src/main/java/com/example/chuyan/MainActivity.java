package com.example.chuyan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button my_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_button=findViewById(R.id.mu_button);

        my_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


            }
        });
    }
}