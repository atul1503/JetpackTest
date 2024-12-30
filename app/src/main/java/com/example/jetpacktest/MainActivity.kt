package com.example.jetpacktest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.jetpacktest.States.StateViewModel


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewModel=StateViewModel()
            MyApp(viewModel)
                
            }

        }
    }

        @Composable
        fun MyApp(viewModel: StateViewModel) {
            Column {
                Greeting(viewModel)

                SecondGreeting(viewModel)
            }

        }

@Composable
fun Greeting(viewModel: StateViewModel){
    val context= LocalContext.current
    println("rendered first greeting")
    Column() {
        Text("hello ${viewModel.name.value}")
        Button(onClick = {

            if(viewModel.name.value=="Tikku"){
                viewModel.updateName("Mridula")
            }
            else{
                viewModel.updateName("Tikku")
            }

        }) {
            Text("Change Name")
        }
        //SecondGreeting()
    }

}

@Composable
fun SecondGreeting(viewModel: StateViewModel) {
    println("rendered second greeting")
    Text("bye ${viewModel.age.value}")
    Button(onClick = {
        viewModel.incAge()
    }) {

        Text("Add age")
    }
}

