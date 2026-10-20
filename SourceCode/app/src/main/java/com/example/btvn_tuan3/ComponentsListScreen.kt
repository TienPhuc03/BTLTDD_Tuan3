package com.example.btvn_tuan3


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun ComponentsListScreen(
    onNavigateToText: () -> Unit,
    onNavigateToImages: () -> Unit,
    onNavigateToTextField: () -> Unit,
    onNavigateToRowLayout: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 28.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text (
            text ="UI Components List",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Color (0xFF1E88E5)
        )
        Spacer(modifier = Modifier.height(12.dp))
        //dislay
        SectionHeader("Display")
        ComponentCard("TextField", "Input field for text", onClick = onNavigateToTextField)
        ComponentCard("Image", "Displays an image", onClick = onNavigateToImages)
        Spacer(modifier = Modifier.height(12.dp))
        //input
        SectionHeader("Input")
        ComponentCard("TextField", "Input field for text", onClick = onNavigateToTextField)
        ComponentCard("PasswordField", "Input field for passwords", onClick = onNavigateToTextField)
        Spacer( modifier = Modifier.height(12.dp))
        //layout
        SectionHeader("Layout")
        ComponentCard("Column", "Arranges elements vertically", onClick = { /* Demo */ })
        ComponentCard("Row", "Arranges elements horizontally", onClick = onNavigateToRowLayout)
        Spacer(modifier = Modifier.height(12.dp))
        //tu tim hieu
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFCDD2))
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text ="Tu tim hieu",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color (0xFF1E88E5)
                )
                Text (
                    text = "Tim ra tat ca cac thanh phan UI co ban",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = FontFamily.Serif,
                    color = Color.Black
                )
            }
        }
    }
}
@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        color = Color.DarkGray,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    )
}

@Composable
fun ComponentCard(title: String, description: String, onClick: () -> Unit) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .clickable{onClick()},
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFD3E6FA))

    ){
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ){
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color.Black
            )
            Text(
                text = description,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Serif,
                color = Color.Black
            )
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComponentsListScreenPreview() {
    MaterialTheme {
        ComponentsListScreen(
            onNavigateToText = {},
            onNavigateToImages = {},
            onNavigateToTextField = {},
        ) {}
    }
}