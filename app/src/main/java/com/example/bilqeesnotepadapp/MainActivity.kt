package com.example.bilqeesnotepadapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bilqeesnotepadapp.ui.theme.BilqeesnotepadappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BilqeesnotepadappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()

                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){

    var userName by remember {mutableStateOf("")}
    var passWord by remember {mutableStateOf("")}

    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Text (
            text = "Simple Login Page",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        TextField(
            value = userName,
            onValueChange = {userNameInput-> userName = userNameInput },
            label = {Text(text = "Username")},
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )

        TextField(
            value = passWord,
            onValueChange = {userPasswordId-> passWord = userPasswordId},
            label = {Text(text = "Paaword")},
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        )

        androidx.compose.material3.Button(onClick = { /*TODO*/}) {
            Text(text = "Login")
        }

    }
}



