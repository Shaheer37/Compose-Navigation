package com.example.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

/*
* A Flow Emitter that exposes
*   1. a navigate function that the screens can call if they want to navigate
*      to a different screen.
*   2. a shared flow that can be collected to observe any navigation event and perform the navigation.
*
* So the shared flow will be observed by the Parent Composable that hosts all the screens that can be
* navigated between and is responsible to all navigation logic.
* While the navigate function will be invoked by the child screens for navigation.
* */

class Navigator<Action> {
    private val _navigate = MutableSharedFlow<Action>()
    val navigate = _navigate.asSharedFlow()

    suspend fun navigate(action: Action){
        try {
            _navigate.emit(action)
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}