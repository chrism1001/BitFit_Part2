package com.example.bitfitpart2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
data class ExerciseEntity (
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @ColumnInfo(name = "name") var name: String? = null,
    @ColumnInfo(name = "date") var date: String? = null,
    @ColumnInfo(name = "sets") var sets: Int = 0,
    @ColumnInfo(name = "reps") var repitions: Int = 0
)