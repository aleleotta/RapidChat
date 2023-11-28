package com.example.rapidchat

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rapidchat.ui.theme.RapidChatTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {}

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    RapidChatTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RapidChatTheme {
        RegisterScreen()
    }
}