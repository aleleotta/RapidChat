package com.example.rapidchat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rapidchat.ui.theme.RapidChatTheme

@Composable
fun TopBarLogin(navController: NavHostController) {
    Row (
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color(0xFF5C69FF)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextButton(onClick = { navController.navigate("Register") }) {
            Text(text = " Register", color = Color.White, fontSize = 20.sp)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
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
        Column (
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF))
                .fillMaxSize(),
        ) {
            TopBarLogin(navController)
            Spacer(modifier = Modifier.height(150.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF))
                    .padding(15.dp)
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
fun TopBarRegister(navController: NavHostController) {
    Row (
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .background(Color(0xFF5C69FF)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextButton(onClick = { navController.navigate("Login") }) {
            Text(text = " Login", color = Color.White, fontSize = 20.sp)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
    var usernameTextField by rememberSaveable {
        mutableStateOf("")
    }
    var passwordTextField by rememberSaveable {
        mutableStateOf("")
    }
    var phoneNumberTextField by rememberSaveable {
        mutableStateOf("")
    }
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column (
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF))
                .fillMaxSize(),
        ) {
            TopBarRegister(navController)
            Spacer(modifier = Modifier.height(150.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF))
                    .padding(15.dp)
            ) {
                Text(
                    text = "Register",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(70.dp))
                Row (
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Phone Number: ",
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    TextField(
                        value = phoneNumberTextField,
                        onValueChange = {newPhoneNumber -> phoneNumberTextField = newPhoneNumber},
                        label = {Text(phoneNumberTextField)}
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row (
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Username: ",
                        fontSize = 20.sp,
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
                        fontSize = 20.sp,
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
                        Text(text = "Register", fontSize = 21.sp, fontWeight = FontWeight.SemiBold)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    RapidChatTheme {
        val navController = rememberNavController()
        LoginScreen(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RapidChatTheme {
        val navController = rememberNavController()
        RegisterScreen(navController)
    }
}