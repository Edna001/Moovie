package com.hellocompany.edsmovies.view.ui.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hellocompany.edsmovies.service.model.Movie
import com.hellocompany.edsmovies.service.model.MoviePageResult
import com.hellocompany.edsmovies.service.repository.MoviesRepository

class MoviesViewModel : ViewModel() {

    val moviesRepository: MoviesRepository = MoviesRepository()
    val popularMovies: MutableLiveData<MoviePageResult> =
        moviesRepository.getPopularMovies()
    var moviesResult: ArrayList<Movie> = arrayListOf()



}
