package com.example.moviewatcherapp.model

data class Movie(
    val id: Int = 25,
    val title: String = "Movie Example",
    val originalTitle: String ="Original Title",
    val releaseDate: String ="2019",
    val genre: Genre = getDefaultGenre(),
    val poster: String = "",
    val video: Boolean = true
    )

fun getDefaultGenre() = Genre(18, "Drama")
