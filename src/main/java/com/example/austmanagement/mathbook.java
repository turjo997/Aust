package com.example.austmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mathbook extends AppCompatActivity {

    PDFView book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathbook);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        book1 =(PDFView) findViewById(R.id.pdfbook1);

        book1.fromAsset("book1.pdf").load();




    }
}
