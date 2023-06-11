package com.example.firebaseimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.firebaseimplementation.databinding.ActivityStartingBinding

class StartingActivity : AppCompatActivity() {
    private var binding : ActivityStartingBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartingBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)
    }
}