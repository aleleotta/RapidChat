package com.example.rapidchat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.rapidchat.ui.theme.RapidChatTheme

@Composable
fun MessagesView(modifier: Modifier = Modifier) {
    ContactNameLayout()
    MessagesLayout()
    BottomBarLayout()
}

@Composable
fun ContactNameLayout(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xff88a1fc)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = ""
        )
    }
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
        MessagesView()
    }
}