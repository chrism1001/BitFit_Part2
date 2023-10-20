package com.example.bitfitpart2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise_table")
    fun getAll(): List<ExerciseEntity>

    @Insert
    fun insertALL(exercises: List<ExerciseEntity>)

    @Query("DELETE FROM exercise_table")
    fun deleteAll()
}