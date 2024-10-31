package com.example.navigation.screens.navigation

import android.util.Log
import com.example.navigation.Navigator
import com.example.navigation.action.MainNavigationAction

class NavigatorImpl: Navigator<MainNavigationAction>() {

    override suspend fun navigate(action: MainNavigationAction) {
        try {
            Log.d("NavigatorImpl", "${_navigate.emit(action)}")
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}