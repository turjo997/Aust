package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coursematerialActivity extends AppCompatActivity implements View.OnClickListener {

    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursematerial);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ok = (Button) findViewById(R.id.coursematerial22ID);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.coursematerial22ID){

            Intent intent = new Intent(coursematerialActivity.this,showbookpdffor22.class);
            startActivity(intent);


        }



    }
}
