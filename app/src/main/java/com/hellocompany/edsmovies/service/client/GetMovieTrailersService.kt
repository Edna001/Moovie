package com.hellocompany.edsmovies.service.client

import com.hellocompany.edsmovies.service.model.MovieTrailerPageResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.Call

interface GetMovieTrailersService {

    @GET("/movie/{id}/videos")
    fun getMovieTrailers(
        @Path("id") movie_id: Int,
        @Query("api_key") key: String
    ): Call<MovieTrailerPageResult>

}