package com.example.bitfitpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

val EXERCISE_INPUT = "EXERCISE_INPUT"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, ExerciseFragment(), null).commit()

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)
            this.startActivity(intent)
        }
    }
}