package com.example.rapidchat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.rapidchat.ui.theme.RapidChatTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val navController = rememberNavController()
    var usernameTextField by rememberSaveable {
        mutableStateOf("")
    }
    var passwordTextField by rememberSaveable {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier
            .background(color = Color(0xFFFFFF))
            .padding(15.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(70.dp))
            Row (
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Username: ",
                    fontSize = 25.sp,
                )
                Spacer(modifier = Modifier.width(10.dp))
                TextField(
                    value = usernameTextField,
                    onValueChange = {newUsername -> usernameTextField = newUsername},
                    label = {Text(usernameTextField)}
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row (
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Password: ",
                    fontSize = 25.sp,
                )
                Spacer(modifier = Modifier.width(10.dp))
                TextField(
                    value = passwordTextField,
                    onValueChange = {newPassword -> passwordTextField = newPassword},
                    label = {Text(passwordTextField)}
                )
            }
            Spacer(modifier = Modifier.height(70.dp))
            Button(
                modifier = Modifier
                    .width(130.dp)
                    .height(60.dp),
                onClick = { /*TODO*/ },
                content = {
                    Text(text = "Login", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
                }
            )
        }
    }
}

@Composable
fun RegisterScreen() {
    val navController = rememberNavController()
}

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