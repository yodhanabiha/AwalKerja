package com.nabiha.awalkerja.features.authFeatures.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nabiha.awalkerja.common.NavRoute

const val routeNav = NavRoute.LoginScreenRoute

fun NavController.navigateToLoginScreen(){
    navigate(routeNav)
}

fun NavGraphBuilder.loginScreen(
    navController: NavHostController,
) {
    composable(route = routeNav) {
        LoginScreenRoute(navController = navController)
    }
}