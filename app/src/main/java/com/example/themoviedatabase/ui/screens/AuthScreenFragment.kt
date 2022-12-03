package com.example.themoviedatabase.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.themoviedatabase.R
import com.example.themoviedatabase.databinding.FragmentAuthScreenBinding

class AuthScreenFragment : Fragment() {
    private lateinit var binding: FragmentAuthScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthScreenBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = AuthScreenFragment()
    }
}