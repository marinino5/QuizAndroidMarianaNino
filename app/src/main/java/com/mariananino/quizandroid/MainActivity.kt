package com.mariananino.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mariananino.quizandroid.ui.theme.QuizAndroidMarianaNiñoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Punto1() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally) {


            Text(
                text = "Encabezado",
                modifier = Modifier
                    .background(Color(0xFF90CAF9))
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                color = Color.Black)


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .background(Color(0xFFA5D6A7))
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {

                Text(
                    text = "Item 1",
                    modifier = Modifier
                        .background(Color(0xFFFFF59D))
                        .padding(12.dp))
                Text(
                    text = "Item 2",
                    modifier = Modifier
                        .background(Color(0xFFFFCC80))
                        .padding(12.dp))
                Text(
                    text = "Item 3",
                    modifier = Modifier
                        .background(Color(0xFFCE93D8))
                        .padding(12.dp)) }
            Text(
                text = "Pie de página",
                modifier = Modifier
                    .background(Color(0xFFEF9A9A))
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                color = Color.Black
            )
        }
    }
