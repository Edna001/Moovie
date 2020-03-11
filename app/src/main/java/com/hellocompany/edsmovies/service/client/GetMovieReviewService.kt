package com.hellocompany.edsmovies.service.client

import com.hellocompany.edsmovies.service.model.MovieReviewPageResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.Call

interface GetMovieReviewService {

    @GET("movie/{id}/reviews")
    fun getMovieReviews(
        @Path("id") movieId: Int,
        @Query("api_key") key: String
    ): Call<MovieReviewPageResult>

}