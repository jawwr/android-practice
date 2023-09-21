package com.example.learningkt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navBtn = findViewById<Button>(R.id.navigation_btn)

        val input = findViewById<EditText>(R.id.input_text)
        navBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                val bundle = Bundle().apply {
                    putString("some_data", input.text.toString())
                }
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}
