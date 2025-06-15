package eu.tutorials.mywishlistapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(viewModel:WishViewModel= viewModel(), navController: NavHostController= rememberNavController()){
    NavHost(navController = navController,
        startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
            HomeView()
        }
    }
}