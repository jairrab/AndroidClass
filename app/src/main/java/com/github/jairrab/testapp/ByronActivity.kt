package com.github.jairrab.testapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ByronActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("lifecycle_event", "Event onCreate() called")

        setContentView(R.layout.activity_main)

        val eatingButton: MaterialButton = findViewById<MaterialButton>(R.id.eating_button)
        val whosPetLabel: TextView = findViewById<TextView>(R.id.pet_label)

        //passing an anonymous object
        eatingButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@ByronActivity, "This is a click event", Toast.LENGTH_SHORT).show()
            }
        })

        //passing an object using lambda
        eatingButton.setOnClickListener {
            Toast.makeText(this@ByronActivity, "This is a click event", Toast.LENGTH_SHORT).show()
        }

        val myClickFunction = MyClickListener()

        //passing an instantiated class
        whosPetLabel.setOnClickListener(myClickFunction)


        //eatingButton.setOnClickListener(myClickFunction)

        //MaterialButton : AppCompatButton : Button : TextView : View
    }

    class MyClickListener : View.OnClickListener{
        override fun onClick(v: View?) {
            Toast.makeText(v?.context,
                "This is another click event",
                Toast.LENGTH_SHORT).show()
        }
    }
}