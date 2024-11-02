package com.example.uts_zidan_kamal

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Poster1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_poster1)

        // Mengatur padding untuk sistem bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Menampilkan video YouTube di WebView
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        val videoId = "hYx72QIMVrc"  // ID video dari URL
        webView.loadUrl("https://www.youtube.com/embed/$videoId")

        // Tombol Navigasi


        val searchButton = findViewById<ImageButton>(R.id.button_search)
        searchButton.setOnClickListener {
            val intent = Intent(this, ShortCut_main::class.java)
            startActivity(intent)
        }

        val infoButton = findViewById<ImageButton>(R.id.button_info)
        infoButton.setOnClickListener {
            val intent = Intent(this, ABOOUT::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageButton>(R.id.button_home)
        homeButton.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button5)
        button2.setOnClickListener {
            val intent = Intent(this, Halaman_Belajar::class.java)
            startActivity(intent)

    }
}}
