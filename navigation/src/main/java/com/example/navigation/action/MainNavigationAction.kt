package com.example.navigation.action

/*
* This sealed class dictates all the actions that can happen in the Main NavHost
* The intention of creating this is to conceal the navigation implementation from the callers.
* This way the caller only knows that on some interaction or other event I should call this action,
* like show settings and the data required for the action. But how that setting screen is shown
* is handled in the caller of the action.
* */
sealed class MainNavigationAction{
    data object GoToDestination2: MainNavigationAction()
}