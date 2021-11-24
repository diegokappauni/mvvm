package com.example.mvvm.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

interface SeriesService{
    @GET("?t=Game of Thrones&Season=1&apikey=")
    suspend fun getGoSeasonOne() : Series

    @GET("/")
    suspend fun getPoster(
        @Query("i")
        imdbId: String,
        @Query("apikey")
        apikey: String)
}

    val retrofit : Retrofit = Retrofit.Builder()
    .baseUrl("https://www.omdbapi.com/")
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

    val seriesService: SeriesService = retrofit.create(SeriesService::class.java)