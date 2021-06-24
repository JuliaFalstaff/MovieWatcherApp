package com.example.moviewatcherapp.model.repository

import com.example.moviewatcherapp.model.Movie

interface Repository {
    fun getMovieWeatherFromServer(): Movie
    fun getMovieFromLocalStorage(): Movie
}