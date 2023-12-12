package com.example.composeloginscreeninit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.composeloginscreeninit.ui.theme.ComposeLoginScreenInitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLoginScreenInitTheme {
                Text(text = "Hello World")
            }
        }
    }
}
