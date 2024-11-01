package com.example.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

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