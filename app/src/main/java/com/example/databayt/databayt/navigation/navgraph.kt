package com.example.databayt.databayt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.databayt.databayt.*
import com.example.databayt.databayt.fix.Kohler
import com.example.databayt.databayt.home.Blog
import com.example.databayt.databayt.home.Club
import com.example.databayt.databayt.home.Inspire
import com.example.databayt.databayt.home.Tool
import com.example.databayt.databayt.member.Profile
import com.example.databayt.databayt.real.Real

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(navController = navController,
        startDestination = screen.Home.route)
    {
        composable(route = screen.Home.route){
            Home(navController)
        }

        composable(route = screen.Login.route){
            Login(navController)
        }

        composable(route = screen.Join.route){
            Join(navController)
        }

        composable(route = screen.Forget.route){
            Forget(navController)
        }

        composable(route = screen.Seek.route){
            Seek(navController)
        }

        composable(route = screen.Porfile.route){
            Profile(navController)
        }

        composable(route = screen.Real.route){
            Real(navController)
        }

        composable(route = screen.Blog.route){
            Blog(navController)
        }

        composable(route = screen.Tool.route){
            Tool(navController)
        }

        composable(route = screen.Club.route){
            Club(navController)
        }

        composable(route = screen.Inspire.route){
            Inspire(navController)
        }

        composable(route = screen.Kohler.route){
          Kohler(navController)
        }




    }

}