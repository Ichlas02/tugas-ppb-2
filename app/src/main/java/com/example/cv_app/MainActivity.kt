package com.example.cv_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cv_app.ui.theme.CVappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CVappTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background) {
                    Greeting("Ichlasul Hasanat", "5025201091", "PPB I")
                }
            }
        }
    }
}

@Composable
fun Greeting(nama: String, nrp: String, kelas: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1F1E33))
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.background(Color(0xFF1F1E33))
        ){
            Image(
                painter = painterResource(id = R.drawable.pfp),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(128.dp)
                    .padding(12.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
        }
        Text(
            text = "Nama: $nama",
            fontSize = 20.sp,
            color = Color(0xFFffffff)
        )
        Text(
            text = "NRP: $nrp",
            fontSize = 20.sp,
            color = Color(0xFFffffff)
        )
        Text(
            text = "Kelas: $kelas",
            fontSize = 20.sp,
            color = Color(0xFFffffff)
        )
        Text(
            text = "Desc: Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                    "Donec mollis eu lectus eget volutpat...",
            fontSize = 20.sp,
            color = Color(0xFFffffff)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CVappTheme {
        Greeting("Ichlasul Hasanat", "5025201091", "PPB I")
    }
}