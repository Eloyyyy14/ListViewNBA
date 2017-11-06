package com.example.elo14.listviewnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PaginaWeb extends AppCompatActivity {
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView1=(WebView)findViewById(R.id.webView1);

        Bundle bundle =getIntent().getExtras();
        webView1.loadUrl(bundle.getString("url"));
    }
}
