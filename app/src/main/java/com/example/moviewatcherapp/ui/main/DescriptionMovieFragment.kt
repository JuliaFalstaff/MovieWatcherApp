package com.example.moviewatcherapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviewatcherapp.databinding.DescriptionFragmentBinding
import com.example.moviewatcherapp.databinding.FavouriteFragmentBinding

class DescriptionMovieFragment: Fragment() {
    private lateinit var binding: DescriptionFragmentBinding

    companion object {
        fun newInstance() = DescriptionMovieFragment
    }

    private lateinit var viewModel: MainViewModel



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DescriptionFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }
}