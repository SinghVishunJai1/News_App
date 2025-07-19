package com.example.newsapp.screen.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.newsapp.screen.DetailScreen
import com.example.newsapp.screen.HomeScreen
import com.example.newsapp.viewModels.NewsViewModel

@Composable

fun NavApp(viewModel: NewsViewModel){

    val navController = rememberNavController()
    NavHost(navController=navController, startDestination =Routes.MainScreenRouts ){

        composable<Routes.MainScreenRouts>{
            HomeScreen(viewModel = viewModel, navController = navController)
        }


        composable<Routes.DetailScreenRoutes>{

            val data=it.toRoute<Routes.DetailScreenRoutes>()


            DetailScreen(
                title = data.title,
                discription = data.discription,
                imageUrl = data.imageUrl,
                content = data.content,
                url = data.url
            )
        }
    }
}