package com.example.birthdaywish

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaywish.ui.theme.BirthdayWishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayWishTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageWish("Happy Birthday Bro!","From Aryan")
                }
            }
        }
    }
}

@Composable
fun TextWish(wish: String,from: String){
    Column {
        Row(horizontalArrangement = Arrangement.Center ,
            verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = wish, fontSize = 32.sp, color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black)
                    .border(3.dp, Color.Red)
                    .padding(22.dp)

            )
        }

        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = from,fontSize=18.sp,color=Color.White,
                modifier = Modifier
                    .padding(12.dp)
                    .background(Color.Black)
                    .border(3.dp, Color.Red)
                    .padding(8.dp)
            )
        }
    }
}
@Composable
fun ImageWish(wish: String,from: String) {
    val image= painterResource(id = R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),contentScale= ContentScale.Crop)

        TextWish(wish = wish, from = from)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayWishTheme {
        ImageWish("Happy Birthday","From Aryan")
    }
}