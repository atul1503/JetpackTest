package com.example.jetpacktest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf



val Name: ProvidableCompositionLocal<String> = compositionLocalOf{"Atul"};

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyApp()
                
            }

        }
    }

        @Composable
        fun MyApp() {
            Column() {
                CompositionLocalProvider(Name provides "Tikku" ) {
                    Greeting()
                }

                SecondGreeting()
            }

        }

@Composable
fun Greeting(){
    Column() {
        Text("hello ${Name.current}")
        //SecondGreeting()
    }

}

@Composable
fun SecondGreeting() {
    Text("bye ${Name.current}")
}

