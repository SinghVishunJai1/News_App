package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.viewModels.NewsViewModel
import com.example.newsapp.screen.HomeScreen
import com.example.newsapp.screen.nav.NavApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: NewsViewModel by viewModels()

        setContent {
            NewsAppTheme {
                Scaffold(modifier = Modifier) {innerPadding ->
                    NavApp(viewModel = viewModel)
                }
            }
        }
    }
}




































