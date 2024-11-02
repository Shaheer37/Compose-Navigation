package com.example.navigation.local.navigators

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import com.example.navigation.Navigator
import com.example.navigation.action.MainNavigationAction

/*
* This is an example LocalNavigator that will retain the instance of the Navigation for a specific tree of screens.
*
* This has to be created in the navigation module because in case of multi-modular implementation the main navigation
* screen will depend on child screen modules. Hence the child screen modules will not have access to LocalNavigators
* declared in main navigation screens.
* */

val LocalMainNavigator: ProvidableCompositionLocal<Navigator<MainNavigationAction>> = compositionLocalOf {
    error("Navigator not assigned")
}