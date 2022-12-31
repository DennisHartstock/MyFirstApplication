package com.commcode.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val btClickMe = findViewById<Button>(R.id.btClickMe)
        var count = 0
        btClickMe.setOnClickListener {
            count++
            Toast.makeText(
                this,
                "You have clicked the button $count times",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}