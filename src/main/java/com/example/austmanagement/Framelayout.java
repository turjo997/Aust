package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Framelayout extends AppCompatActivity implements View.OnClickListener {

    private ImageView a1,a2,a3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        a1 = (ImageView) findViewById(R.id.austb1ID);
        a2 = (ImageView) findViewById(R.id.austb2ID);
        a3=(ImageView) findViewById(R.id.austb3ID);
        a4=(ImageView) findViewById(R.id.austb4ID);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.austb1ID){
            a3.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);
            a1.setVisibility(View.GONE);

            a2.setVisibility(View.VISIBLE);

        }
        else if(v.getId()==R.id.austb2ID){

            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);

            a3.setVisibility(View.VISIBLE);

        }

        else if(v.getId()==R.id.austb3ID){
            a1.setVisibility(View.GONE);
            a2.setVisibility(View.GONE);
            a3.setVisibility(View.GONE);

            a4.setVisibility(View.VISIBLE);


        }
        else if(v.getId()==R.id.austb4ID){
            a2.setVisibility(View.GONE);
            a3.setVisibility(View.GONE);
            a4.setVisibility(View.GONE);

            a1.setVisibility(View.VISIBLE);

        }

    }
}
