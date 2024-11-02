package com.example.navigation

import kotlinx.serialization.Serializable

@Serializable
data object Destination1

@Serializable
data class Destination2(
    val param1: String
)