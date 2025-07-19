package com.example.newsapp.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.Repo.Repo
import com.example.newsapp.network.NewsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {


    val res = mutableStateOf<NewsModel?>(null)

    private val repo = Repo()

    init {
        fetchNews()
    }


    fun fetchNews(){

        viewModelScope.launch(Dispatchers.IO) {



            res.value =repo.fetchBusinessNews().body()


        }
    }


}



























//package com.example.newsapp.viewModels
//
//import androidx.compose.runtime.mutableStateOf
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.newsapp.Repo.Repo
//import kotlinx.coroutines.launch
//
//// 🔸 ViewModel ka kaam: UI aur Data ke beech bridge ka kaam karta hai
//class NewsViewModels : ViewModel() {
//
//    // 🔹 Ye UI ke liye live data/state banate hain
//    val res = mutableStateOf<NewsModal?>(null)
//
//    private val repo = Repo() // 🔹 Data lane ka kaam repo karega
//
//    // 🔸 Jaise hi ViewModel create hota hai, data fetch hota hai
//    init {
//        fetchData()
//    }
//
//    // 🔹 API se data fetch karne ka function
//    fun fetchData() {
//        viewModelScope.launch {
//            try {
//                val response = repo.fetchTopHeadlines()
//                if (response.isSuccessful) {
//                    res.value = response.body()
//                } else {
//                    // Handle error response
//                    println("API Error: ${response.code()} ${response.message()}")
//                }
//            } catch (e: Exception) {
//                // Network error ya server down
//                println("Exception: ${e.localizedMessage}")
//            }
//        }
//    }
//}
//
//
//
////
////package com.example.newsapp.viewmodel
//
////import androidx.compose.runtime.mutableStateOf
////import androidx.lifecycle.ViewModel
////import androidx.lifecycle.viewModelScope
//
////
////import com.example.newsapp.network.NewsModal
////
////import com.example.newsapp.repo.Repo
////
////import kotlinx.coroutines.Dispatchers
////import kotlinx.coroutines.launch
////
////class NewsViewModel : ViewModel() {
////
////    val res = mutableStateOf<NewsModal?>(null)
////    val isLoading = mutableStateOf(false)
////    val errorMessage = mutableStateOf<String?>(null)
////
////    private val repo = Repo()
////
////    init {
////        fetchData()
////    }
////
////    fun fetchData() {
////        viewModelScope.launch(Dispatchers.IO) {
////            isLoading.value = true
////            errorMessage.value = null
////            try {
////                val response = repo.fetchNewsFromApi()
////                if (response.isSuccessful) {
////                    res.value = response.body()
////                } else {
////                    errorMessage.value = "Error: ${response.message()}"
////                }
////            } catch (e: Exception) {
////                errorMessage.value = "Exception: ${e.message}"
////            } finally {
////                isLoading.value = false
////            }
////        }
////    }
////}
