package com.example.btvn_tuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen (onNavigateToList: () -> Unit ){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 40.dp ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Spacer(modifier = Modifier.height(40.dp))
        //cumj logo gioi thieu
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.compose_logo),
                contentDescription = "logo",
                modifier = Modifier.size(230.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text (
                text = "Jetpack Compose",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text (
                text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center
            )
        }
        Button(
            onClick = onNavigateToList,
            modifier = Modifier.fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF1E88E5))
        ) {
            Text (
                text = "I'm ready!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color.White
            )
        }
    }
}

private fun ColumnScope.Image(painter: Painter, modifier: Modifier) {}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    MaterialTheme {
        WelcomeScreen(onNavigateToList = {}) // Truyền {} rỗng để xem trước
    }
}

