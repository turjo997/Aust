package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ThirdActivity extends AppCompatActivity  {

    String[] selectedchoice;
    private Spinner spin;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        selectedchoice= getResources().getStringArray(R.array.My_Choice);
        spin=(Spinner) findViewById(R.id.SpinnerID);
        button=(Button) findViewById(R.id.buttonID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sampleview,R.id.sampleviewID,selectedchoice);
        spin.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String value=spin.getSelectedItem().toString();

                if(value.equals("Calculate CGPA for 1.1")){

                    Intent intent = new Intent (ThirdActivity.this,CalculatingCgpaActivity.class);
                    startActivity(intent);
                }

                else if(value.equals("Calculate CGPA for 2.1")){

                    Intent intent = new Intent (ThirdActivity.this,Activityfor21.class);
                    startActivity(intent);
                }



            }
        });


    }


}
