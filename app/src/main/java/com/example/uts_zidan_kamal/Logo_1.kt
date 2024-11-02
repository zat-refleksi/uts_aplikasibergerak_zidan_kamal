package com.example.uts_zidan_kamal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Logo_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logo1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button1 = findViewById<Button>(R.id.button3)
        button1.setOnClickListener {
            val intent = Intent(this, Logo_2::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val intent = Intent(this, ShortCut_main::class.java)
            startActivity(intent)
        }

        val ImageView3 = findViewById<ImageButton>(R.id.button_search)
        ImageView3.setOnClickListener {
            val intent: Intent = Intent(this, ShortCut_main::class.java)
            startActivity(intent)

        }

        val ImageView2 = findViewById<ImageButton>(R.id.button_info)
        ImageView2.setOnClickListener {
            val intent: Intent = Intent(this, ABOOUT::class.java)
            startActivity(intent)
        }
        val ImageView30 = findViewById<ImageButton>(R.id.button_home)
        ImageView30.setOnClickListener {
            val intent: Intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
    }
}}