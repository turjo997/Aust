package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class websiteactivity extends AppCompatActivity {

    private WebView wb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websiteactivity);

        wb2 = (WebView) findViewById(R.id.webview2Id);
        WebSettings webSettings = wb2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        wb2.setWebViewClient(new WebViewClient());

        wb2.loadUrl("http://www.aust.edu/");


    }

    @Override
    public void onBackPressed() {

        if(wb2.canGoBack()){

            wb2.goBack();
        }else{

            super.onBackPressed();
        }
    }

}

