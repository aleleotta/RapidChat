package com.example.rapidchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rapidchat.ui.theme.RapidChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RapidChatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun ContactNameLayout(modifier: Modifier = Modifier) {
    Text(
        text = "",
        modifier = modifier
    )
}

@Composable
fun MessagesLayout(modifier: Modifier = Modifier) {
    Text(
        text = "",
        modifier = modifier
    )
}

@Composable
fun BottomBarLayout(modifier: Modifier = Modifier) {
    Text(
        text = "",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ContactNamePreview() {
    RapidChatTheme {
        ContactNameLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun MessagesPreview() {
    RapidChatTheme {
        MessagesLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    RapidChatTheme {
        BottomBarLayout()
    }
}

@Preview(showBackground = true)
@Composable
fun SurfacePreview() {
    RapidChatTheme {
        ContactNameLayout()
        MessagesLayout()
        BottomBarLayout()
    }
}