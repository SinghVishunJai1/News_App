package com.example.newsapp.network



import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
// https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=d34612efd84d41258edd61bcf9504f90

    val retrofit: ApiService = Retrofit.Builder()
        .baseUrl("https://newsapi.org/v2/")
        .client(OkHttpClient.Builder().build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)
}




