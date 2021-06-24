package com.example.moviewatcherapp.model.repository

import com.example.moviewatcherapp.model.Movie

class RepositoryImpl : Repository {

    override fun getMovieWeatherFromServer(): Movie {
        return Movie()
    }

    override fun getMovieFromLocalStorage(): Movie {
        return Movie()
    }

}