package com.example.moviewatcherapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviewatcherapp.model.AppState
import com.example.moviewatcherapp.model.Movie
import com.example.moviewatcherapp.model.repository.Repository
import com.example.moviewatcherapp.model.repository.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel () : ViewModel() {
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()
    private val repository: Repository = RepositoryImpl()

    fun getLiveData() = liveDataToObserve

    fun getMovie() = getDataFromLocalSource()
    fun getMovieFromRemoteSource() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(AppState.Success(repository.getMovieFromLocalStorage()))
        }.start()
    }



}