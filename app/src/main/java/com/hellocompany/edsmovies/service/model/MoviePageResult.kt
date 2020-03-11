package com.hellocompany.edsmovies.service.model

data class MoviePageResult (
    private val page: Int? = null,
    val total_results: Int? = null,
    val total_pages: Int? = null,
    val results: ArrayList<Movie>? = null
)