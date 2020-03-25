package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class algobbok extends AppCompatActivity {

    PDFView book2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_algobbok);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        book2 =(PDFView) findViewById(R.id.pdfbook2);
        book2.fromAsset("book2.pdf").load();

    }
}
