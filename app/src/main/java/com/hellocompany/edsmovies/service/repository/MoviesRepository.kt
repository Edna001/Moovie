package com.hellocompany.edsmovies.service.repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.hellocompany.edsmovies.service.client.GetMovieReviewService
import com.hellocompany.edsmovies.service.client.GetMovieService
import com.hellocompany.edsmovies.service.model.MoviePageResult
import com.hellocompany.edsmovies.view.ui.main.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MoviesRepository {

    private val retrofit = Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getPopularMovies(): MutableLiveData<MoviePageResult> {
        val moviesLiveData = MutableLiveData<MoviePageResult>()
        val moviesCall = retrofit.create(GetMovieService::class.java)

        moviesCall.getPopularMovies(1, "e26270f8380587e5ab18b06f4de53047").enqueue(
            object : Callback<MoviePageResult> {
                override fun onFailure(call: Call<MoviePageResult>, t: Throwable) {
                    Log.d("Internet Connection", "Please connect internet")
                }

                override fun onResponse(
                    call: Call<MoviePageResult>,
                    response: Response<MoviePageResult>
                ) {
                    moviesLiveData.value = response.body()
                }
            })

        return moviesLiveData
    }

}