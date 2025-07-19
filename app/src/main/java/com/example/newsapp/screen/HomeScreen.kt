package com.example.newsapp.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.newsapp.screen.nav.Routes
import com.example.newsapp.viewModels.NewsViewModel


@Composable
fun HomeScreen(viewModel: NewsViewModel,navController: NavController) {

    val res = viewModel.res.value?.articles ?: emptyList()

    Column{


        LazyColumn{

            items(res) {



                EachCard(title = it.title, imageUrl = it.urlToImage, onClick = {
                    navController.navigate(Routes.DetailScreenRoutes(
                        title = it.title,
                        discription = it.description,
                        imageUrl = it.urlToImage,
                        content = it.content,
                        url = it.url
                    ))
                })



            }
        }

    }
}




@Composable
fun EachCard(

    onClick: () -> Unit,

    title: String?,

    imageUrl: String?
) {

   Card (
       modifier = Modifier.fillMaxWidth().padding(8.dp).clickable {
           onClick() },
   ) {
       Row(
           verticalAlignment = Alignment.CenterVertically,
           modifier = Modifier.fillMaxWidth().height(100.dp).padding(18.dp)
       ) {

           if (imageUrl != null) {
               AsyncImage(
                   model = imageUrl,
                   contentDescription = null,
                   contentScale = ContentScale.Crop,
                   modifier = Modifier.size(100.dp).clip(RoundedCornerShape(8.dp))

               )
           }else{

               Image(
                   imageVector = Icons.Default.Face,
                   contentDescription = null,
               )
           }

           Spacer(modifier = Modifier.width(16.dp))

           Column(modifier = Modifier.padding(8.dp)) {


                   if (title !=null){
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                   }else{
                     Text(
                         text = "Title is not found",
                         fontSize = 16.sp,
                         fontWeight = FontWeight.Bold
                     )
                   }


           }


       }
   }
}


