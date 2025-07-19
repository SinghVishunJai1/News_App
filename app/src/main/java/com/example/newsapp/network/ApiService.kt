package com.example.newsapp.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Body

interface ApiService {
//https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=d34612efd84d41258edd61bcf9504f90
    @GET("top-headlines")
    suspend fun getBusinessHeadlines(
        @Query("country") country: String = "us",
        @Query("category") category: String = "business",
        @Query("apiKey") apiKey: String = "d34612efd84d41258edd61bcf9504f90"
    ): Response<NewsModel>

}
























//package com.example.newsapp.network
//
//import retrofit2.Response
//import retrofit2.http.GET
//import retrofit2.http.Query
//
//
//
//interface ApiService {
//
//
////    https://newsapi.org/v2/everything?q=tesla&from=2025-06-04&sortBy=publishedAt&apiKey=d34612efd84d41258edd61bcf9504f90
//
//    @GET("everything")
//   suspend fun getTopHeadlines(
//        @Query("q") q: String = "tesla",
//        @Query("from") from: String = "2025-06-04",
//        @Query("sortBy") sortBy: String = "publishedAt",
//        @Query("apiKey") apiKey: String = "d34612efd84d41258edd61bcf9504f90"
//    ) : Response<NewsModal>  // server ye return kar ke dega
//}


// jab server se data ko lete h usee bolte h 'Get'
// jab denge 'Post'




//package com.example.newsapp.network
//
//import retrofit2.Response
//import retrofit2.http.GET
//import retrofit2.http.Query
//
//interface ApiService {
//
//    @GET("everything")
//    suspend fun getTopHeadlines(
//        @Query("q") q: String = "tesla",
//        @Query("from") from: String = "2025-06-04",
//        @Query("sortBy") sortBy: String = "publishedAt",
//        @Query("apiKey") apiKey: String = "d34612efd84d41258edd61bcf9504f90"
//    ): Response<NewsModal>
//}
