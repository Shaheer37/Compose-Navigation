package com.example.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

abstract class Navigator<Action> {
    protected val _navigate = MutableSharedFlow<Action>(

    )
    val navigate = _navigate.asSharedFlow()

    abstract suspend fun navigate(action: Action)
}