package com.example.navigation.action

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import com.example.navigation.Navigator

val LocalMainNavigator: ProvidableCompositionLocal<Navigator<MainNavigationAction>> = compositionLocalOf {
    error("Navigator not assigned")
}

sealed class MainNavigationAction{
    data object GoToDestination2: MainNavigationAction()
}