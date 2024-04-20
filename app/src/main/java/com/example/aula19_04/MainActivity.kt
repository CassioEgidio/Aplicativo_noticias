package com.example.aula19_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.sp
import com.example.aula19_04.ui.theme.Aula1904Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1904Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}
@Composable
fun app() {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Row (
            Modifier
                .fillMaxWidth(),
                Arrangement.Center,
        ){
            Text(text =  "App de notícias",
                 color = Color.Blue,
                 fontSize = 24.sp
            )
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {

        }
        Column (
            Modifier
                .background(
                    Color.Gray,
                    shape = RoundedCornerShape(12.dp)
                )

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Título da notícia",
                    modifier = Modifier.padding(start = 30.dp)
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Descrição curta da notícia")
            }
            Row (
                Modifier
                    .fillMaxWidth(),
                    Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler mais")
                }

            }

        }

        Row (
            Modifier
                .padding(8.dp)
        ) {

        }

        Column (
            Modifier
                .background(
                    Color.Gray,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {

            Row (
                Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Título da notícia",
                    modifier = Modifier.padding(start = 30.dp)
                    )
            }

            Row (
                Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Descrição curta da notícia")
            }

            Row (
                Modifier
                    .fillMaxWidth(),
                    Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "Ler mais")
                }
            }
        }



    }
}

@Composable
@Preview
fun appPreview() {
    Aula1904Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            app()
        }
    }
}