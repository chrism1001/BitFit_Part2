package com.example.bitfitpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val exercises = mutableListOf<ExerciseEntity>()
    private lateinit var exercisesRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        exercisesRecyclerView = findViewById(R.id.content)
        val exerciseAdapter = ExerciseAdapter(this, exercises)
        exercisesRecyclerView.adapter = exerciseAdapter
        exercisesRecyclerView.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)

        }
    }


}