package com.example.bitfitpart2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(
    private val context: Context,
    private val exercises: List<ExerciseEntity>,
    private val Listener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    inner class ExerciseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val exerciseName: TextView = itemView.findViewById<View>(R.id.exercise_name) as TextView
        val exerciseDate: TextView = itemView.findViewById<View>(R.id.date) as TextView
        val setsNumber: TextView = itemView.findViewById<View>(R.id.sets) as TextView
        val repetitions: TextView = itemView.findViewById<View>(R.id.repetitions) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exercises[position]

        holder.exerciseName.text = exercise.name
        holder.exerciseDate.text = exercise.date
        holder.setsNumber.text = exercise.sets.toString()
        holder.repetitions.text = exercise.repetitions.toString()
    }

    override fun getItemCount(): Int {
        return exercises.size
    }
}