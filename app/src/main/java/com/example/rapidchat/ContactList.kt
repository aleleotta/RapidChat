package com.example.rapidchat

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rapidchat.ui.theme.RapidChatTheme

@Composable
fun ContactView(modifier: Modifier = Modifier) {}

@Composable
fun TopBar(modifier: Modifier = Modifier) {}

@Composable
fun List(modifier: Modifier = Modifier) {}

@Composable
fun ContactItem(modifier: Modifier = Modifier) {}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    RapidChatTheme {
        TopBar()
    }
}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    RapidChatTheme {
        List()
    }
}

@Preview(showBackground = true)
@Composable
fun ContactItemPreview() {
    RapidChatTheme {
        ContactItem()
    }
}