package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class showbookpdffor22 extends AppCompatActivity implements View.OnClickListener {


    Button algo,math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showbookpdffor22);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        math = (Button) findViewById(R.id.mathbookID);
        algo = (Button) findViewById(R.id.algoID);


        math.setOnClickListener(this);
        algo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.mathbookID){

            Intent intent = new Intent(showbookpdffor22.this,mathbook.class);
            startActivity(intent);

        }

        if(v.getId()==R.id.algoID){

            Intent intent = new Intent(showbookpdffor22.this,algobbok.class);
            startActivity(intent);

        }


    }
}
