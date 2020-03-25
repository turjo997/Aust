package com.example.austmanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txt1,txt2;
    private Button login,websitevisit;

    private Button overview;
    private TextView txtview;

    private  int cnt=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt1 = (EditText) findViewById(R.id.userID);

        txt2 = (EditText) findViewById(R.id.passwordID);

        login = (Button) findViewById(R.id.personalinfoID);

        //overview=(Button) findViewById(R.id.buttonoverview);

   //     overview.setOnClickListener(this);

        login.setOnClickListener(this);

        txtview = (TextView) findViewById(R.id.textID);

        txtview.setText("Number of attempts remaining : 3");

        //websitevisit=(Button) findViewById(R.id.buutonwebviewId);

 //       websitevisit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String username = txt1.getText().toString();
        String password = txt2.getText().toString();
        if(username.equals("turjo") && password.equals("12334")){

            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else{
            cnt--;
            txtview.setText("Number of attempts remaining : " + cnt);
            if(cnt==0){
                login.setEnabled(false);

            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.webpageID){

            Intent intent = new Intent(MainActivity.this,websiteactivity.class);

            startActivity(intent);
   //         Toast.makeText(MainActivity.this,"setting is selected", Toast.LENGTH_SHORT).show();
            return  true;
        }

        if(item.getItemId()==R.id.overviewID){

            Intent intent1 = new Intent(MainActivity.this,Framelayout.class);
            startActivity(intent1);


            //Toast.makeText(MainActivity.this,"share is selected", Toast.LENGTH_SHORT).show();
            return  true;
        }
        if(item.getItemId()==R.id.coursematerialID){

            Intent intent1 = new Intent(MainActivity.this,coursematerialActivity.class);
            startActivity(intent1);
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
