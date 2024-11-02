package com.example.uts_zidan_kamal

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ImageView = findViewById<ImageView>(R.id.imageView)
        ImageView.setOnClickListener {
            val intent = Intent(this, ABOOUT::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, Halaman_Belajar::class.java)
            startActivity(intent)

        }

        val ImageView2 = findViewById<ImageButton>(R.id.button_info)
        ImageView2.setOnClickListener {
            val intent: Intent = Intent(this, ABOOUT::class.java)
            startActivity(intent)

        }

        val ImageView3 = findViewById<ImageButton>(R.id.button_search)
        ImageView3.setOnClickListener {
            val intent: Intent = Intent(this, ShortCut_main::class.java)
            startActivity(intent)


    }
        val ImageView4 = findViewById<ImageButton>(R.id.button_profile)
        ImageView4.setOnClickListener {
            val intent: Intent = Intent(this, Halaman_Belajar::class.java)
            startActivity(intent)

        }

}}