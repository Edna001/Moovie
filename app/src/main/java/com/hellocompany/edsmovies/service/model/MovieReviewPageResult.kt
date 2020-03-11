package com.hellocompany.edsmovies.service.model

data class MovieReviewPageResult (
    val results: ArrayList<MovieReview>? = null,
    val id: Int? = null,
    val page: Int? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)