package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cardView.setOnLongClickListener {
            binding.cardView.isChecked = !binding.cardView.isChecked
            true
        }
    }

    fun onClick(view: android.view.View) {
        val intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)
        Toast.makeText(applicationContext, "Happy", Toast.LENGTH_SHORT).show()

    }
}