package com.example.mvvm.data

import com.squareup.moshi.Json

data class Series (
    @field:Json(name = "Title")
    val title: String,
    @field:Json(name = "Episodes")
    val episodes: List<Episode>
)

data class Episode (
    @field:Json(name = "Title")
    val title: String,
    @field:Json(name = "imdbId")
    val imdbId: String,
    val posterUrl:String? = null
)

data class Poster (
    @field:Json(name = "Poster")
    val url: String
)