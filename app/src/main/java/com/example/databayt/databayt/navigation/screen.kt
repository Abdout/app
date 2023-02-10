package com.example.databayt.databayt.navigation

sealed class screen (val route: String){

    object Home: screen ("Home")
    object Blog: screen ("Blog")
    object Tool: screen ("Tool")
    object Club: screen ("Club")
    object Inspire: screen ("Inspire")

    object Login: screen ("Login")
    object Join: screen ("Join")
    object Seek: screen ("Seek")
    object Forget: screen ("Forget")
    object Real: screen ("Real")
    object Porfile: screen ("Porfile")
    object Kohler: screen ("Kohler")

}