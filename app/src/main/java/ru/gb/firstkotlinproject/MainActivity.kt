package ru.gb.firstkotlinproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.text_view)
        val people: DataTestClass = DataTestClass("Ivan", 22)
        button.setOnClickListener { textView.text = people.name+" "+people.age}
        val anotherPeople = people.copy()
        val textView2: TextView = findViewById(R.id.text_view2)
        textView2.text = anotherPeople.name + " " + anotherPeople.age
    }
}