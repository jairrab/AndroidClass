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

        //This is #1 change from the jay-beta branch
        //This is #2 change from the jay-beta branch
        //This is #3 change from the jay-beta branch
    }
}