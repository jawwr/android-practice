package com.example.learningkt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val text = findViewById<TextView>(R.id.textview_second)

        val bundle: Bundle? = intent.extras
        text.text = bundle?.getString("some_data")
    }
}
