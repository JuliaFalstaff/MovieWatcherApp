package com.example.moviewatcherapp.model.repository

import com.example.moviewatcherapp.model.Movie
import com.example.moviewatcherapp.model.getMoviesList

class RepositoryImpl : Repository {

    override fun getMovieFromServer() = Movie()

    override fun getMovieFromLocalStorage() = getMoviesList()
}