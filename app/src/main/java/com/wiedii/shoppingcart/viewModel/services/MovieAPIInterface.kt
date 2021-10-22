package com.wiedii.shoppingcart.viewModel.services

import com.wiedii.shoppingcart.viewModel.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieAPIInterface {

    @GET("3/movie/popular?api_key=2d0b8d80e35d3f6bb63f72d134fa33cc")
    fun getMovieList() : Call<MovieResponse>
}