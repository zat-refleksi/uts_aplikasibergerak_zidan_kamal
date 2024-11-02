package com.example.uts_zidan_kamal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Halaman_Belajar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halaman_belajar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val ImageView = findViewById<ImageView>(R.id.imageView3)
        ImageView.setOnClickListener {
            val intent = Intent(this, Logo_1::class.java)
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
        val ImageView4 = findViewById<ImageView>(R.id.imageView4)
        ImageView4.setOnClickListener {
            val intent = Intent(this, Poster1::class.java)
            startActivity(intent)
}}}