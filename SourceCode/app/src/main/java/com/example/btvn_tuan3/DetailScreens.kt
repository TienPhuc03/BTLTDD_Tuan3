package com.example.btvn_tuan3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextDetailScreen(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Text Detail", color = Color(0xFF1E88E5), fontWeight = FontWeight.Bold, fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.Gray)
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            val styledText = buildAnnotatedString {
                append("The ")
                withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                    append("quick ")
                }
                withStyle(SpanStyle(color = Color(0xFFA0522D), fontSize = 30.sp, fontWeight = FontWeight.Bold)) {
                    append("Brown\n")
                }
                append("fox ")
                withStyle(SpanStyle(letterSpacing = 5.sp)) {
                    append("jumps ")
                }
                withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("over\n")
                }
                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("the ")
                }
                withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {
                    append("lazy ")
                }
                append("dog.")
            }
            Text(text = styledText, fontSize = 22.sp, lineHeight = 38.sp)
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImagesDetailScreen(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Images", color = Color(0xFF1E88E5), fontWeight = FontWeight.Bold, fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.Gray)
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //tai anh tu mang (URL)
            SubcomposeAsyncImage(
                model = "https://scontent.fsgn13-1.fna.fbcdn.net/v/t39.30808-6/544896793_1085041350475363_3523549399601263365_n.jpg?stp=dst-jpg_tt6&cstp=mx2048x1366&ctp=s2048x1366&_nc_cat=104&_nc_map=urlgen_bucketless&ccb=1-7&_nc_sid=833d8c&_nc_ohc=3gVYTbSmX_sQ7kNvwF2sAaN&_nc_oc=AdoldHxLhOsQ3Us-ZtKjLf8HQkR5M79o3rpedQIIYFdunWQVwAHeR0Jk35JXs-HMfwkCRR57ezRFbon-R1TduuYc&_nc_zt=23&_nc_ht=scontent.fsgn13-1.fna&_nc_gid=8KYQgvfzPZcN3rBPcQbnLA&_nc_ss=7b2a8&oh=00_AQPMpd_yECG5fON02n30tHskePTIDAKuEStw7NNCFvkmIw&oe=6ADAB342",
                contentDescription = "Online Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop,
                // SKELETON
                loading = {
                    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFE0E0E0)))
                }
            )
//            Spacer(modifier = Modifier.height(6.dp))
//            Text(
//                text = "https://scontent.fsgn13-1.fna.fbcdn.net/v/t39.30808-6/544896793_1085041350475363_3523549399601263365_n.jpg?stp=dst-jpg_tt6&cstp=mx2048x1366&ctp=s2048x1366&_nc_cat=104&_nc_map=urlgen_bucketless&ccb=1-7&_nc_sid=833d8c&_nc_ohc=3gVYTbSmX_sQ7kNvwF2sAaN&_nc_oc=AdoldHxLhOsQ3Us-ZtKjLf8HQkR5M79o3rpedQIIYFdunWQVwAHeR0Jk35JXs-HMfwkCRR57ezRFbon-R1TduuYc&_nc_zt=23&_nc_ht=scontent.fsgn13-1.fna&_nc_gid=8KYQgvfzPZcN3rBPcQbnLA&_nc_ss=7b2a8&oh=00_AQPMpd_yECG5fON02n30tHskePTIDAKuEStw7NNCFvkmIw&oe=6ADAB342",
//                fontSize = 10.sp,
//                color = Color(0xFF1976D2)
//            )
            Spacer(modifier = Modifier.height(24.dp))
            SubcomposeAsyncImage(
                model = "https://scontent.fsgn13-1.fna.fbcdn.net/v/t39.30808-6/544896793_1085041350475363_3523549399601263365_n.jpg?stp=dst-jpg_tt6&cstp=mx2048x1366&ctp=s2048x1366&_nc_cat=104&_nc_map=urlgen_bucketless&ccb=1-7&_nc_sid=833d8c&_nc_ohc=3gVYTbSmX_sQ7kNvwF2sAaN&_nc_oc=AdoldHxLhOsQ3Us-ZtKjLf8HQkR5M79o3rpedQIIYFdunWQVwAHeR0Jk35JXs-HMfwkCRR57ezRFbon-R1TduuYc&_nc_zt=23&_nc_ht=scontent.fsgn13-1.fna&_nc_gid=8KYQgvfzPZcN3rBPcQbnLA&_nc_ss=7b2a8&oh=00_AQPMpd_yECG5fON02n30tHskePTIDAKuEStw7NNCFvkmIw&oe=6ADAB342",
                contentDescription = "In App Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop,
                loading = {
                    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFE0E0E0)))
                }
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = "in app", fontSize = 11.sp, color = Color.Gray)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldDetailScreen(onBack: () -> Unit) {
    var inputText by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("TextField", color = Color(0xFF1E88E5), fontWeight = FontWeight.Bold, fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.Gray)
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                placeholder = { Text("Thông tin nhập", color = Color.LightGray) },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = if (inputText.isEmpty()) "Tự động cập nhật dữ liệu theo textfield" else inputText,
                color = Color(0xFFD32F2F),
                fontSize = 13.sp
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowLayoutScreen(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Row Layout", color = Color(0xFF1E88E5), fontWeight = FontWeight.Bold, fontSize = 16.sp) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.Gray)
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFAFAFA))
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    // 4 Hàng (Row) mô phỏng khung xương giao diện
                    repeat(4) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(48.dp)
                                    .background(Color(0xFFB3D1F5), RoundedCornerShape(8.dp))
                            )
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(48.dp)
                                    .background(Color(0xFF4285F4), RoundedCornerShape(8.dp))
                            )
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(48.dp)
                                    .background(Color(0xFFB3D1F5), RoundedCornerShape(8.dp))
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Text Detail")
@Composable
fun TextDetailPreview() {
    MaterialTheme {
        TextDetailScreen(onBack = {})
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Images Detail")
@Composable
fun ImagesDetailPreview() {
    MaterialTheme {
        ImagesDetailScreen(onBack = {})
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "TextField Detail")
@Composable
fun TextFieldDetailPreview() {
    MaterialTheme {
        TextFieldDetailScreen(onBack = {})
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Row Layout")
@Composable
fun RowLayoutPreview() {
    MaterialTheme {
        RowLayoutScreen(onBack = {})
    }
}