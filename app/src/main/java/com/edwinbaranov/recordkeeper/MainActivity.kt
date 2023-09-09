package com.edwinbaranov.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edwinbaranov.recordkeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewExample.text = "We can now use View Binding. YAAAAAY"
    }


}