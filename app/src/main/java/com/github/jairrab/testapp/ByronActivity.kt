package com.github.jairrab.testapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.jairrab.mathutils.isWholeNumber

class ByronActivity : AppCompatActivity() {
    //onCreate, onStart, onresume are lifecycle events

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("lifecycle_event", "Event onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.v("lifecycle_event", "Event onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.v("lifecycle_event", "Event onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.v("lifecycle_event", "Event onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.v("lifecycle_event", "Event onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("lifecycle_event", "Event onDestroy() called")
    }
}