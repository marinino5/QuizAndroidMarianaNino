package com.mariananino.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariananino.quizandroid.ui.theme.QuizAndroidMarianaNiñoTheme
import org.w3c.dom.Text

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
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Punto3_Taller() {

    val morado = Color(0xFF6A4FB3)
    val grisChip = Color(0xFFE0E0E0)
    val grisProyecto = Color(0xFF9E9E9E)
    val bordeGris = Color(0xFFB0B0B0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Mariana Niño",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Desarrolladora Android apasionada por la tecnología y el diseño.",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 40.dp)
        )

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Posts", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Seguidores", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Likes", fontSize = 12.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = morado,
                    contentColor = Color.White
                )
            ) {
                Text("Seguir")
            }

            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp),
                border = BorderStroke(1.dp, bordeGris),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = morado
                )
            ) {
                Text("Mensaje")
            }

        }
    }
}