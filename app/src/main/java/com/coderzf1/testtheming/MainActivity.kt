package com.coderzf1.testtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.coderzf1.testtheming.ui.theme.CustomComposeTheme
import com.coderzf1.testtheming.ui.theme.Pink40
import com.coderzf1.testtheming.ui.theme.Purple40
import com.coderzf1.testtheming.ui.theme.PurpleGrey40
import com.coderzf1.testtheming.ui.theme.TestThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var testColor by remember { mutableStateOf(Color(Purple40.toArgb()))}
            TestThemingTheme(customComposeTheme = CustomComposeTheme(
                primaryColor = testColor)
            ) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = {
                            testColor = Color.Green
                        }) {
                            Text(text = "Click Me")
                        }
                    }

                }
            }
        }
    }
}

