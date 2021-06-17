package com.example.moviewatcherapp.ui.main.main.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.moviewatcherapp.R
import com.example.moviewatcherapp.databinding.FragmentMainRecyclerItemBinding
import com.example.moviewatcherapp.model.Movie
import com.example.moviewatcherapp.ui.main.main.MainFragment

class MainFragmentAdapter(private var onItemViewClickListener: MainFragment.OnItemViewClickListener?) :
    RecyclerView.Adapter<MainFragmentAdapter.MainViewHolder>() {
    private var movieData: List<Movie> = listOf()
    private lateinit var binding: FragmentMainRecyclerItemBinding

    fun setMovie(data: List<Movie>) {
        movieData = data
        notifyDataSetChanged()
    }

    fun removeListener() {
        onItemViewClickListener = null
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainViewHolder {
        binding = FragmentMainRecyclerItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MainViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(movieData[position])
    }

    override fun getItemCount(): Int {
        return movieData.size
    }

    inner class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(movie: Movie) = with(binding) {
            textViewTitle.text = movie.title
            textViewOriginalTitle.text = movie.originalTitle
            textViewReleaseDate.text = movie.releaseDate
            textViewGenre.text = movie.genre.toString()
            imageViewPoster.setImageResource(movie.poster)

            root.setOnClickListener { onItemViewClickListener?.onItemViewClick(movie) }
        }
    }
}