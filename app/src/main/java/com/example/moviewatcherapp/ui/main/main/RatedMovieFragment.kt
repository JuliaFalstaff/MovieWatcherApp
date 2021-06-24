package com.example.moviewatcherapp.ui.main.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviewatcherapp.databinding.RatedMoviesFragmentBinding

class RatedMovieFragment : Fragment() {

    private lateinit var binding: RatedMoviesFragmentBinding

    companion object {
        fun newInstance() = RatedMovieFragment
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RatedMoviesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}