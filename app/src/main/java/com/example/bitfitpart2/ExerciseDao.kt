package com.example.bitfitpart2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise_table")
    fun getAll(): Flow<List<ExerciseEntity>>

    @Insert
    fun insertALL(exercises: List<ExerciseEntity>)
    fun deleteAll()
}