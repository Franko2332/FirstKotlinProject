package ru.gb.firstkotlinproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.text_view)
        button.setOnClickListener { textView.text = "hello" }
    }
}