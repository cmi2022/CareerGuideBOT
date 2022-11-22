package com.example.mycareerbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    WebView webView; //Define Variable that is used t display website in application
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient()); //Allows app to display website inside of WebView
        webView.loadUrl("https://collen.usutacouture.com/"); //load website to be mirrored on application
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); //Allow java type contents to load on site (e.g Youtube video thumbnails or google ads)
    }
}

