package com.hellocompany.edsmovies.service.model

data class Movie (
    val popularity: Double? = null,
    val vote_count: Int? = null,
    val video: Boolean? = null,
    val poster_path: String? = null,
    val id: Int? = null,
    val adult: Boolean? = null,
    val backdrop_path: String? = null,
    val original_language: String? = null,
    val original_title: String? = null,
    val genre_ids: List<Int>? = null,
    val title: String? = null,
    val vote_average: Double? = null,
    val overview: String? = null,
    val release_date: String? = null
)