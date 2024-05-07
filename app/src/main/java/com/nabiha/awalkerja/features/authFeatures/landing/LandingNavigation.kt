package com.nabiha.awalkerja.features.authFeatures.landing

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nabiha.awalkerja.common.NavRoute

const val landingRoute = NavRoute.LandingScreenRoute

fun NavController.navigateToLandingScreen(){
    navigate(landingRoute)
}

fun NavGraphBuilder.landingScreen(
    navController: NavHostController,
) {
    composable(route = landingRoute) {
        LandingScreenRoute(navController = navController)
    }
}