package com.example.moviewatcherapp.model

sealed class AppState {
    data class Success(val movieData: Movie) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}