package com.github.jairrab.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.jairrab.mathutils.isWholeNumber

class ByronActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val d: Double = 2.5

        val isThisAWholeNumber = d.isWholeNumber()


        //Check this out
    }
}