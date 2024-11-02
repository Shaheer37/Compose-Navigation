package com.example.navigation.route

/*
* In case the developers don't want to use Navigation actions for some reason, then this interface can be used
* in declarations of the route sealed classes., like follows.

sealed class Destinations: Route{
    data object Destination1: Destinations() {
        override val route: String = "Destination1"
    }
}

* This way we can create Local Navigators that dictate that this Navigator does not use Actions but routes.
*
* */

interface Route {
    val route: String
}