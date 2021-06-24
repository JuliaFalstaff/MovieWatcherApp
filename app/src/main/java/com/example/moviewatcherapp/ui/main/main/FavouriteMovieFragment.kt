package com.example.moviewatcherapp.ui.main.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviewatcherapp.databinding.FavouriteFragmentBinding
import com.example.moviewatcherapp.model.Movie
import com.google.android.material.snackbar.Snackbar

class FavouriteMovieFragment : Fragment() {
    private lateinit var binding: FavouriteFragmentBinding

    companion object {
        fun newInstance() = FavouriteMovieFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FavouriteFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun setData(movieData: Movie) = with(binding) {
        favouriteTextTitle.text = movieData.title.toString()
    }
}