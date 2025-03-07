package com.example.movielisting.network

import com.example.movielisting.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
   @GET("users?page=2")
   fun getMovies(): Call<ApiResponse>
}
//data class ApiResponse(val data: List<MovieData>)
