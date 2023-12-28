package com.example.countries;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class ResultActivity2 extends AppCompatActivity {

    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        init();

        Intent intent = getIntent();

        btnReturn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);

                finish();
            }
        });
    }

    private void init()
    {
        btnReturn = (Button) findViewById(R.id.btnReturn);
    }
}