package com.example.composeloginscreeninit

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeloginscreeninit.ui.theme.Black
import com.example.composeloginscreeninit.ui.theme.ComposeLoginScreenInitTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(modifier: Modifier = Modifier, label: String, trailing: String) {
    val uiColor: Color = if (isSystemInDarkTheme()) Color.White else Black

    TextField(
        modifier = modifier,
        value = "",
        onValueChange = {},
        label = {
            Text(text = label, style = MaterialTheme.typography.labelMedium, color = uiColor)
        },
        colors = TextFieldDefaults.textFieldColors(

        )
    )
}

@Preview
@Composable
fun LoginTextFieldView() {
    ComposeLoginScreenInitTheme {
        LoginTextField(label = "Email", trailing = "Wrong Password")
    }
}