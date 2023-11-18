package com.example.jetcomp_cw2

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcomp_cw2.ui.theme.JetComp_cw2Theme

class MainActivity : ComponentActivity() { override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetComp_cw2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")
                   // cw2_jcomp()
                    cw3_jcomp()
                }
            }
        }
    }
}
@Composable
fun cw1_jcomp(modifier: Modifier=Modifier){
    Column(

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .padding(10.dp)
        ) {
            Text(text = "Row1 Col1",modifier=Modifier.width(minOf(200.dp)))
            Text(text = "Row1 Col2")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(10.dp)
        ) {
            Text(text = "Row2 Col1",modifier=Modifier.width(minOf(200.dp)))
            Text(text = "Row2 Col2")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cw2_jcomp(){
    var info = remember {
        mutableStateOf("")
    }
    Column {
        Row {
            TextField(value = info.value,
                onValueChange = {it->info.value=it} )
            Text(text = info.value)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cw3_jcomp(){
    var counter by remember {
        mutableStateOf(0)
    }
    Column {
        Button(onClick = {
                         if(counter<100){
                             counter++
                         }
        },
            Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Zwiększ licznik")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = counter.toString(),
            fontSize = 70.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            if(counter>0){
                counter--
            }
        },
            Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Zmniejsz licznik")
        }
    }
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
    JetComp_cw2Theme {
        //Greeting("Android")
        //cw1_jcomp()
        //cw2_jcomp()
        cw3_jcomp()
    }
}