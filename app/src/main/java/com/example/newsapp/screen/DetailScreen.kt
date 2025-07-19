package com.example.newsapp.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.ui.platform.LocalContext


import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import coil3.compose.SubcomposeAsyncImage
import coil3.toUri
import com.example.newsapp.R

@Composable
fun DetailScreen(
    title: String,
    discription: String,
    imageUrl: String,
    content: String,
    url: String
){



    val verticalScrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).verticalScroll(
            state = verticalScrollState,
                enabled = true
            )
    ) {

        Text(text = title,fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(5.dp))

        SubcomposeAsyncImage(
            model = imageUrl,
            loading = {
                CircularProgressIndicator()
            },
            error = {
                Text(text = "Error")
            },
            contentDescription = null,
        )

        Text(text = discription)

        Text(text = content)

        val context = LocalContext.current

        ElevatedButton(
            onClick = {

                val urlIntent=Intent(Intent.ACTION_VIEW).apply {
                    data=Uri.parse(url)
                }
                val urlintent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(urlIntent)

            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Read More")
        }


    }




}