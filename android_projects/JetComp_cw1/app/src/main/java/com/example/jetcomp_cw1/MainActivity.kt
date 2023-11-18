package com.example.jetcomp_cw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.jetcomp_cw1.ui.theme.JetComp_cw1Theme

import kotlin.text.StringBuilder

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComp_cw1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Antoni")
                    Wizytowka("Aneta","Bereta")
                }
            }
        }
    }
}

@Composable
fun Wizytowka(firstname:String="Adam",lastname:String="Nowak",modifier: Modifier=Modifier){
    Text(
        text = "Witaj: $firstname $lastname",
        //modifier=modifier,
        textAlign = TextAlign.Center,
        fontSize = 20.sp, fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(10.dp)
            //.background(color = Color.LightGray).height(30.dp)
    )
}
@Composable
fun Numbers(count:Int){
    val numbers = arrayOf<Int>(1,2,3,4,56,7,78);
    val sb:StringBuilder = StringBuilder()
    for ( i in numbers){
        sb.append(i).append(" ")
    }
    Text(text = sb.toString(), textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth())
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetComp_cw1Theme {
        Column {
            Wizytowka(firstname = "Roman", lastname = "Boman", modifier = Modifier)
            Wizytowka();
            Numbers(count = 10)
        }

    }
}