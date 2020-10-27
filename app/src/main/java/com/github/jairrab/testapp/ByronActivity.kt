package com.github.jairrab.testapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.jairrab.mathutils.isWholeNumber

class ByronActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("lifecycle_event", "Event onCreate() called")

        setContentView(R.layout.activity_main)
    }
}