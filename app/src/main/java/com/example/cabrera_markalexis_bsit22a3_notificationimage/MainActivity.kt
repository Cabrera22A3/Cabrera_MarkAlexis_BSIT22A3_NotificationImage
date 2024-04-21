package com.example.cabrera_markalexis_bsit22a3_notificationimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cabrera_markalexis_bsit22a3_notificationimage.ui.theme.Cabrera_MarkAlexis_BSIT22A3_NotificationImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cabrera_MarkAlexis_BSIT22A3_NotificationImageTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    //gumamit ng columns and rows para maayos yung layout ng image at text
    //vertical arrangement para ma center ung lahat na nasa column
    //chorizontal allignment para mag align ung content pa higa
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.checkedpic1),
            contentDescription = null,
            contentScale = ContentScale.FillWidth, //para ma fill ng image yung pinaka width ng device
            modifier = Modifier.padding(start = 60.dp, end = 60.dp).fillMaxWidth()//padding para maisaayos kung tama ba yung sukat sa width
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,// para patabain yung font
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cabrera_MarkAlexis_BSIT22A3_NotificationImageTheme {
        Greeting()
    }
}