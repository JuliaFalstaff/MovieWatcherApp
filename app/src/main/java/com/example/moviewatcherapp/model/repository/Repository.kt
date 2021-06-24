package com.example.moviewatcherapp.model.repository

import com.example.moviewatcherapp.model.Movie

interface Repository {
    fun getMovieFromServer(): Movie
    fun getMovieFromLocalStorage(): List<Movie>
}