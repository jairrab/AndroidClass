package com.github.jairrab.testapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.jairrab.testapp.databinding.ActivityMainBinding
import com.github.jairrab.testapp.petexercise.Pet
import com.github.jairrab.testapp.petexercise.coleen.PetOfColeen
import com.github.jairrab.testapp.petexercise.jay.PetOfJay
import com.github.jairrab.testapp.petexercise.jemboy.PetofJemboy
import com.github.jairrab.testapp.petexercise.rex.PetOfRex
import com.github.jairrab.testapp.petexercise.ron.PetOfRon
import java.util.*

class ByronActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.v("lifecycle_event", "Event onCreate() called")

        val binding = ActivityMainBinding.inflate(layoutInflater)
        this.binding = binding
        setContentView(binding.root)

        binding.eating.setOnClickListener {
            val currentPet = getCurrentPet()
            currentPet.feed()
            binding.petActivity.text = currentPet.getStatus()

            it.hideKeyboard()
        }

        binding.playing.setOnClickListener {
            val currentPet = getCurrentPet()
            currentPet.play()
            binding.petActivity.text = currentPet.getStatus()

            it.hideKeyboard()
        }

        binding.sleeping.setOnClickListener {
            val currentPet = getCurrentPet()
            currentPet.sleep()
            binding.petActivity.text = currentPet.getStatus()

            it.hideKeyboard()
        }

        binding.clearActivity.setOnClickListener {
            binding.petName.text = null
            binding.petActivity.text = null
        }
    }

    private fun getCurrentPet(): Pet {
        val petName = binding?.petName?.text.toString()
        val petNameLowerCase = petName.toLowerCase(Locale.getDefault())

        if (petNameLowerCase == "byron") {
            return PetOfJay()
        } else if (petNameLowerCase == "coleen") {
            return PetOfColeen()
        } else if (petNameLowerCase == "jemboy") {
            return PetofJemboy()
        } else if (petNameLowerCase == "rex") {
            return PetOfRex()
        } else if (petNameLowerCase == "ron") {
            return PetOfRon()
        } else {
            Toast.makeText(this, "Pet is not found, returning Jay's pet", Toast.LENGTH_SHORT).show()
            return PetOfJay()
        }
    }

    private fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}