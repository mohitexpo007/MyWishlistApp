package eu.tutorials.mywishlistapp

sealed class Screen(val route: String) {
    object HomeScreen:Screen("home_Screen")
    object AddScreen:Screen("add_Screen")
}