package com.example.navigation.screens.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.Destination1
import com.example.navigation.Destination2
import com.example.navigation.Navigator
import com.example.navigation.action.LocalMainNavigator
import com.example.navigation.action.MainNavigationAction
import com.example.navigation.screens.Destination1Screen
import com.example.navigation.screens.Destination2Screen

@Composable
fun MainNavHost(
    navController: NavHostController = rememberNavController(),
    navigator: Navigator<MainNavigationAction> = Navigator()
){
    CompositionLocalProvider(LocalMainNavigator provides navigator) {
        NavHost(
            modifier = Modifier.fillMaxSize(),
            navController = navController,
            startDestination = Destination1
        ) {
            composable<Destination1> {
                Destination1Screen()
            }
            composable<Destination2> {
                Destination2Screen()
            }

        }
    }

    LaunchedEffect(Unit) {
        navigator.navigate.collect {
            when(it){
                MainNavigationAction.GoToDestination2 -> {
                    navController.navigate(Destination2("param1"))
                }
            }
        }
    }

}