package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Activityfor21 extends AppCompatActivity implements View.OnClickListener {

    private EditText text1,text2,text3,text4,text5,text6,text7,text8,text9;
    private Button okButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfor21);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        text1 =(EditText) findViewById(R.id.edittext1);
        text2 =(EditText) findViewById(R.id.edittext2);
        text3 =(EditText) findViewById(R.id.edittext3);
        text4 =(EditText) findViewById(R.id.edittext4);
        text5 =(EditText) findViewById(R.id.edittext5);
        text6 =(EditText) findViewById(R.id.edittext6);
        text7 =(EditText) findViewById(R.id.edittext7);
        text8 =(EditText) findViewById(R.id.edittext8);
        text9 =(EditText) findViewById(R.id.edittext9);

        okButton =(Button) findViewById(R.id.cgpabuttonID);


        result =(TextView) findViewById(R.id.showcgpaID);

        okButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {

            String num1=text1.getText().toString();
            String num2=text2.getText().toString();
            String num3=text3.getText().toString();
            String num4=text4.getText().toString();
            String num5=text5.getText().toString();
            String num6=text6.getText().toString();
            String num7=text7.getText().toString();
            String num8=text8.getText().toString();
            String num9=text9.getText().toString();


            double n1=Double.parseDouble(num1);
            double n2=Double.parseDouble(num2);
            double n3=Double.parseDouble(num3);
            double n4=Double.parseDouble(num4);
            double n5=Double.parseDouble(num5);
            double n6=Double.parseDouble(num6);
            double n7=Double.parseDouble(num7);
            double n8=Double.parseDouble(num8);
            double n9=Double.parseDouble(num9);


            if(v.getId()==R.id.cgpabuttonID){

                double sum=(n1*3.0 + n2*3.0 +n3*3.0 + n4*3.0 + n5*3.0 + n6*1.5 + n7*0.75+ n8*1.5 + n9*1.5)/(20.25);

                DecimalFormat formatter=new DecimalFormat("#.##");

                String formatted = formatter.format(sum);

                result.setText("Result: "+formatted);
            }

        }catch (Exception e){

            Toast.makeText(Activityfor21.this,"Please Enter all the information",Toast.LENGTH_SHORT).show();
        }


    }
}
