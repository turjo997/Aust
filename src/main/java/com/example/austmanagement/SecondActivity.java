package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


     private Button cgpabutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cgpabutton=(Button) findViewById(R.id.cgpaID);

        cgpabutton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

         if(v.getId()==R.id.cgpaID) {
             Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

             startActivity(intent);
         }

    }
}

