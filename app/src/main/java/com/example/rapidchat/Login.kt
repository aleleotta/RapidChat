package com.example.rapidchat

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import java.util.Stack

@Composable
fun topBar() {
    Row (
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color(0xFF5C69FF)),
        verticalAlignment = Alignment.Top,
    ) {}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val navController = rememberNavController()
    NavControllerHandler().Navigation(navController)
    var usernameTextField by rememberSaveable {
        mutableStateOf("")
    }
    var passwordTextField by rememberSaveable {
        mutableStateOf("")
    }
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Row(
            verticalAlignment = Alignment.Top
        ) {
            topBar()
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "New on RapidChat?",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .clickable {  },
                    color = Color.Black
                )
                Text(
                    text = "Register here!",
                    fontSize = 10.sp,
                    modifier = Modifier
                        .clickable {  },
                    color = Color.Black
                )
            }
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
                    onClick = { navController.navigate("Register") },
                    content = {
                        Text(text = "Login", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
                    }
                )
            }
        }
    }
}

@Composable
fun RegisterScreen() {
    val navController = rememberNavController()
    NavControllerHandler().Navigation(navController)
    topBar()
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