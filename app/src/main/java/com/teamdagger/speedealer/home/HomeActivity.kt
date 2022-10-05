package com.teamdagger.cardealer.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teamdagger.speedealer.ui.theme.SpeeDealerTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpeeDealerTheme {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Column {
            Header()
        }
    }
}

@Composable
fun Header() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = MaterialTheme.colors.primary,
    ) {
        SearchTitle()
    }
}

@Composable
fun SearchTitle() {
    Row(
       modifier = Modifier
       .padding(start = 16.dp, end = 16.dp, top = 32.dp)
    ){
        Text(
            modifier = Modifier.weight(1f),
            text = "Explore"
        )
        Icon(
            Icons.Default.Search,
            contentDescription = null // decorative element
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    SpeeDealerTheme {
        Screen()
    }
}