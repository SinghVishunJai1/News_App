package com.example.newsapp.screen.nav

import kotlinx.serialization.Serializable

sealed class Routes{
    @Serializable
    object MainScreenRouts
    @Serializable
    data class DetailScreenRoutes(
        val title: String,
        val discription: String,
        val imageUrl: String,
        val content: String,
        val url: String
    )
}