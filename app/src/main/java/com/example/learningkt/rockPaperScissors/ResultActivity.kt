package com.example.learningkt.rockPaperScissors

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learningkt.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_result)

        val output = findViewById<TextView>(R.id.result)
        output.text = intent.extras?.get("RESULT").toString()
    }
}
