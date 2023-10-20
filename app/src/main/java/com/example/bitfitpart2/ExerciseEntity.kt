package com.example.bitfitpart2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
class ExerciseEntity {
    @PrimaryKey(autoGenerate = true) val id: Long = 0
    @ColumnInfo(name = "name") val name: String? = null
    @ColumnInfo(name = "date") val date: String? = null
    @ColumnInfo(name = "sets") val sets: Int = 0
    @ColumnInfo(name = "reps") val repitions: Int = 0
}