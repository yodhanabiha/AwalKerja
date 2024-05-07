package com.nabiha.awalkerja.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nabiha.awalkerja.common.NavRoute
import com.nabiha.awalkerja.features.authFeatures.landing.landingScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavRoute.LandingScreenRoute
) {
    Scaffold(/*bottomBar = { BottomBar(navController = navController) }*/) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = modifier.padding(innerPadding)
        ) {
            landingScreen(navController)
        }
    }
}
