package com.example.composeloginscreeninit

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeloginscreeninit.ui.theme.Black
import com.example.composeloginscreeninit.ui.theme.ComposeLoginScreenInitTheme

@Composable
fun LoginScreen() {
    Surface() {
        Column(modifier = Modifier.fillMaxSize()) {
            val uiColor: Color = if (isSystemInDarkTheme()) Color.White else Black
            Box(contentAlignment = Alignment.TopCenter) {
                Image(
                    painter = painterResource(id = R.drawable.shape),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.46f),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    ComposeLoginScreenInitTheme {
        LoginScreen()
    }
}