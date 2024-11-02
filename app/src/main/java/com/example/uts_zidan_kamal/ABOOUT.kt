package com.example.uts_zidan_kamal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ABOOUT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_aboout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ImageView2 = findViewById<ImageButton>(R.id.button_home)
        ImageView2.setOnClickListener {
            val intent: Intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
    }
        val ImageView4 = findViewById<ImageButton>(R.id.button_profile)
        ImageView4.setOnClickListener {
            val intent: Intent = Intent(this, Halaman_Belajar::class.java)
            startActivity(intent)
        }

        val ImageView3 = findViewById<ImageButton>(R.id.button_search)
        ImageView3.setOnClickListener {
            val intent: Intent = Intent(this, ShortCut_main::class.java)
            startActivity(intent)
        }
}}