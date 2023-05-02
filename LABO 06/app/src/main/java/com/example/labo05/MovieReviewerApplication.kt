package com.example.labo05

import android.app.Application
import com.example.labo05.data.movies
import com.example.labo05.repositories.MovieRepository

class MovieReviewerApplication : Application(){

    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }


}