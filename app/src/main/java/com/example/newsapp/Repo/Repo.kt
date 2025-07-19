package com.example.newsapp.Repo


import com.example.newsapp.network.NewsModel
import com.example.newsapp.network.RetrofitClient
import retrofit2.Response

class Repo {
    suspend fun fetchBusinessNews(): Response<NewsModel> {
        return RetrofitClient.retrofit.getBusinessHeadlines()
    }
}




















//package com.example.newsapp.Repo
//
//import com.example.newsapp.network.NewsModal
//import com.example.newsapp.network.RetrofitClient
//import retrofit2.Response
//
//class Repo {
//  suspend  fun fetchNewsFromApi(): Response<NewsModal>{
//
//        return RetrofitClient.retrofit.getTopHeadlines()
//    }
//}


//package com.example.newsapp.repo
//
//import com.example.newsapp.network.NewsModal
//import com.example.newsapp.network.RetrofitClient
//import retrofit2.Response
//
//class Repo {
//    suspend fun fetchNewsFromApi(): Response<NewsModal> {
//        return RetrofitClient.apiService.getTopHeadlines()
//    }
//}
//
