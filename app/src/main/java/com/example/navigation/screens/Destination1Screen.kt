package com.example.navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.navigation.action.LocalMainNavigator
import com.example.navigation.action.MainNavigationAction
import kotlinx.coroutines.launch

@Composable
fun Destination1Screen(){
    val navigator = LocalMainNavigator.current
    val coroutineScope = rememberCoroutineScope()
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Destination1",
            modifier = Modifier.clickable {
                coroutineScope.launch {
                    navigator.navigate(MainNavigationAction.GoToDestination2)
                }
            }
        )
    }
}