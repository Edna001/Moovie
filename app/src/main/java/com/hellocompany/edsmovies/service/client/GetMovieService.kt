package com.hellocompany.edsmovies.service.client

import com.hellocompany.edsmovies.service.model.MoviePageResult
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface GetMovieService {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("page") page: Int,
        @Query("api_key") key: String
    ): Call<MoviePageResult>

}