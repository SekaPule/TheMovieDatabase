package com.example.themoviedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.themoviedatabase.databinding.ActivityMainBinding
import com.example.themoviedatabase.ui.screens.AuthScreenFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(
                binding.containerView.id,
                AuthScreenFragment.newInstance()
            )
        }
    }
}