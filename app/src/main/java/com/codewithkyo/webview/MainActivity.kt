package com.codewithkyo.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val loadingUrl = "http://10.0.2.2/tutorial"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WebView.setWebContentsDebuggingEnabled(true)
        WebView.setWebContentsDebuggingEnabled(true)

        val webView = findViewById<WebView>(R.id.test_wv)
        webView.webViewClient = object : WebViewClient(){}
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(loadingUrl)
    }
}