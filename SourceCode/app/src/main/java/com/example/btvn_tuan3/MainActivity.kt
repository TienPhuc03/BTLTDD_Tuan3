package com.example.btvn_tuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                AppNavigation()
            }
        }
    }
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        // Màn hình 1: Chào
        composable("welcome") {
            WelcomeScreen(
                onNavigateToList = { navController.navigate("components_list") }
            )
        }
        // Màn hình 2: Menu danh sách
        composable("components_list") {
            ComponentsListScreen(
                onNavigateToText = { navController.navigate("text_detail") },
                onNavigateToImages = { navController.navigate("images_detail") },
                onNavigateToTextField = { navController.navigate("textfield_detail") },
                onNavigateToRowLayout = { navController.navigate("row_layout") }
            )
        }
        // Màn hình 3: Text Detail
        composable("text_detail") {
            TextDetailScreen(onBack = { navController.popBackStack() })
        }
        // Màn hình 4: Images Detail
        composable("images_detail") {
            ImagesDetailScreen(onBack = { navController.popBackStack() })
        }
        // Màn hình 5: TextField Detail
        composable("textfield_detail") {
            TextFieldDetailScreen(onBack = { navController.popBackStack() })
        }
        // Màn hình 6: Row Layout Detail
        composable("row_layout") {
            RowLayoutScreen(onBack = { navController.popBackStack() })
        }
    }
}