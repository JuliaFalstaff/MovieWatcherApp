package com.example.moviewatcherapp.ui.main.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.moviewatcherapp.R
import com.example.moviewatcherapp.databinding.FragmentDetailsBinding
import com.example.moviewatcherapp.model.AppState
import com.example.moviewatcherapp.model.Movie
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_details.view.*

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding

    companion object {
        const val BUNDLE_EXTRA = "movie"

        fun newInstance(bundle: Bundle): DetailsFragment {
            val fragment = DetailsFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getParcelable<Movie>(BUNDLE_EXTRA)?.let { movie ->
            with(binding) {
            movie.genre.also { genre ->
                textViewGenre.text = genre.toString()
            }
            textViewTitle.text = movie.title.toString()
            textViewOriginalTitle.text = movie.originalTitle.toString()
            textViewReleaseDate.text = movie.releaseDate.toString()
            imageViewPoster.setImageResource(movie.poster)
            textViewDescriptionOfMovie.text = movie.descriptionOfMovie.toString()
             }
        }
    }
}

//override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//    super.onViewCreated(view, savedInstanceState)
//    val movie = arguments?.getParcelable<Movie>(DetailsFragment.BUNDLE_EXTRA)
//    if (movie != null) {
//        val genre = movie.genre
//        binding.textViewTitle.text = movie.title.toString()
//        binding.textViewOriginalTitle.text = movie.originalTitle.toString()
//        binding.textViewReleaseDate.text = movie.releaseDate.toString()
//        binding.textViewGenre.text = genre.toString()
//        binding.imageViewPoster.setImageResource(movie.poster)
//        binding.textViewDescriptionOfMovie.text = movie.descriptionOfMovie.toString()
//    }
//}