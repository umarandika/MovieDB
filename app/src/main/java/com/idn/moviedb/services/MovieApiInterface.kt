package com.idn.moviedb.services

import com.idn.moviedb.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=0d6c4e305707e878b2812ea327d8b6d4")
    fun getMovieList(): Call<MovieResponse>
}