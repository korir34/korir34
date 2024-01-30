package com.example.androidsmartcitytraveller;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView = findViewById(R.id.WebView1);
        WebView.setWebViewClient(new WebViewClient());

        String url = "https://www.google.co.ke/maps/@-3.5447325,39.5025871,14z?hl=en";
        WebView.loadUrl(url);
    }
}
