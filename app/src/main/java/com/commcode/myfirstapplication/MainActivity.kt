package com.commcode.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTextView = findViewById<TextView>(R.id.tvTextView)

        tvTextView.setOnClickListener {
            startActivity(Intent(this, CountActivity::class.java))
        }
    }
}