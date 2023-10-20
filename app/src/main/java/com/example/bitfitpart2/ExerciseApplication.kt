package com.example.bitfitpart2

import android.app.Application

class ExerciseApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}