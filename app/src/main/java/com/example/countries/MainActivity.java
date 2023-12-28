package com.example.countries;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 1;
    private Button btnCountry1;
    private Button btnCountry2;
    private Button btnCountry3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnCountry1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                    Intent  intent = new Intent(MainActivity.this, ResultActivity1.class);
                    startActivityForResult(intent, REQUEST_CODE, null);
            }
        });
        btnCountry2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent  intent = new Intent(MainActivity.this, ResultActivity3.class);
                startActivityForResult(intent, REQUEST_CODE, null);
            }
        });
        btnCountry3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent  intent = new Intent(MainActivity.this, ResultActivity2.class);
                startActivityForResult(intent, REQUEST_CODE, null);
            }
        });

    }

    private void init()
    {
        btnCountry1 = (Button) findViewById(R.id.btnCountry1);
        btnCountry2 = (Button) findViewById(R.id.btnCountry2);
        btnCountry3 = (Button) findViewById(R.id.btnCountry3);
    }
}
