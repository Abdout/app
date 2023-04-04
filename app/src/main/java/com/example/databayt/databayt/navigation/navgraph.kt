package com.example.databayt.databayt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.databayt.databayt.*
import com.example.databayt.databayt.fix.Fix
import com.example.databayt.databayt.fix.Kohler
import com.example.databayt.databayt.fix.automotive.Automotive
import com.example.databayt.databayt.fix.automotive.Spare
import com.example.databayt.databayt.fix.automotive.Spareone
import com.example.databayt.databayt.fix.automotive.Sparetwo
import com.example.databayt.databayt.fix.elevator.Elevator
import com.example.databayt.databayt.fix.generator.Generator
import com.example.databayt.databayt.flow.Flow
import com.example.databayt.databayt.flow.Task
import com.example.databayt.databayt.flow.Update
import com.example.databayt.databayt.home.Blog
import com.example.databayt.databayt.home.Club
import com.example.databayt.databayt.home.Inspire
import com.example.databayt.databayt.home.Tool
import com.example.databayt.databayt.map.Company
import com.example.databayt.databayt.map.Document
import com.example.databayt.databayt.map.Health
import com.example.databayt.databayt.map.Map
import com.example.databayt.databayt.member.Profile
import com.example.databayt.databayt.nmbd.Member
import com.example.databayt.databayt.nmbd.NMBD
import com.example.databayt.databayt.nmbd.Sign
import com.example.databayt.databayt.real.*
import com.example.databayt.databayt.seek.degree.Degree
import com.example.databayt.databayt.seek.job.Job
import com.example.databayt.databayt.seek.scholar.Scholar
import com.example.databayt.databayt.seek.visa.Visa
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
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

        composable(route = screen.Flow.route){
            Flow(navController)
        }

        composable(route = screen.Task.route){
            Task(navController)
        }

        composable(route = screen.Update.route){
            Update(navController)
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

        composable(route = screen.Fix.route){
            Fix(navController)
        }

        composable(route = screen.Map.route){
            Map(navController)
        }

        composable(route = screen.Elevator.route){
            Elevator(navController)
        }

        composable(route = screen.Automotive.route){
            Automotive(navController)
        }

        composable(route = screen.Health.route){
            Health(navController)
        }

        composable(route = screen.Company.route){
            Company(navController)
        }

        composable(route = screen.Document.route){
            Document(navController)
        }



        composable(route = screen.Detial.route){
            Detial(navController)
        }

        composable(route = screen.Filter.route){
            Filter(navController)
        }

        composable(route = screen.Book.route){
            Book(navController)
        }

        composable(route = screen.Share.route){
            Share(navController)
        }

        composable(route = screen.NMBD.route){
            NMBD(navController)
        }

        composable(route = screen.Sign.route){
           Sign(navController)
        }

        composable(route = screen.Spare.route){
            Spare(navController)
        }

        composable(route = screen.Spareone.route){
            Spareone(navController)
        }

        composable(route = screen.Sparetwo.route){
            Sparetwo(navController)
        }

        composable(route = screen.Member.route){
            Member(navController)
        }

        composable(route = screen.Generator.route){
            Generator(navController)
        }

        composable(route = screen.Job.route){
            Job(navController)
        }

        composable(route = screen.Scholar.route){
            Scholar(navController)
        }

        composable(route = screen.Degree.route){
            Degree(navController)
        }

        composable(route = screen.Visa.route){
            Visa(navController)
        }









    }

}