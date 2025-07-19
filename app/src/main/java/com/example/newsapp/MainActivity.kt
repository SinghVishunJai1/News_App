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
























//package com.example.newsapp
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.activity.viewModels
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.newsapp.screen.HomeScreen
//import com.example.newsapp.ui.theme.NewsAppTheme
//import com.example.newsapp.viewmodel.NewsViewModel
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//
//        val viewModel: NewsViewModel by viewModels()
//
//        setContent {
//            NewsAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    HomeScreen(
//                       viewModel=viewModel
//                    )
//                }
//            }
//        }
//    }
//}

















//package com.example.newsapp
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.activity.viewModels
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Scaffold
//import androidx.compose.ui.Modifier
//import com.example.newsapp.screen.HomeScreenn
//
//import com.example.newsapp.ui.theme.NewsAppTheme
//import com.example.newsapp.viewModels.NewsViewModels
//import kotlin.getValue
//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//
//       val viewModels: NewsViewModels by viewModels()
//        setContent {
//            NewsAppTheme {
//
//
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//                    HomeScreenn(viewModels = viewModels)
//
//
//                }





























                    // GlobalScope basically launch to h jata h par automatic stop nhi hota
                    // memory leakage problem hota h
                    // launch laganee se quratin launch ho jata h

//                    GlobalScope.launch {
////                        val checkApi = RetrofitClient.retrofit.getTopHeadlines().body()
////                        Log.d("mydata",checkApi.toString())
//
//
//
//
////                        val data= fetchData()
////                        Log.d("Data",data)
//                    }


//                    // another Scope --> lifecycles scope
//                    // ye basically quratin activity ke ander se launch hoga
//                    // jab activity destroy ho jayga waise hi quratins bhi destroy ho jayga
//                    // thats why it is more efficient
//                    //quratins thread ke ander chalte h
//                    // agrr check karna h ...quratin ke bareeme to log.d() use karo
//
//                    // Dispatchers are the main threads
//                    lifecycleScope.launch(Dispatchers.IO) {
//                        Log.d("scope", Thread.currentThread().name)
//                    }

//
//            }
//        }
//    }
//}
//
//








// GlobalScope basically launch to h jata h par automatic stop nhi hota
// memory leakage problem hota h
// launch laganee se quratin launch ho jata h

//                    GlobalScope.launch {
////                        val checkApi = RetrofitClient.retrofit.getTopHeadlines().body()
////                        Log.d("mydata",checkApi.toString())
//
//
//
//
////                        val data= fetchData()
////                        Log.d("Data",data)
//                    }


//                    // another Scope --> lifecycles scope
//                    // ye basically quratin activity ke ander se launch hoga
//                    // jab activity destroy ho jayga waise hi quratins bhi destroy ho jayga
//                    // thats why it is more efficient
//                    //quratins thread ke ander chalte h
//                    // agrr check karna h ...quratin ke bareeme to log.d() use karo
//
//                    // Dispatchers are the main threads
//                    lifecycleScope.launch(Dispatchers.IO) {
//                        Log.d("scope", Thread.currentThread().name)
//                    }