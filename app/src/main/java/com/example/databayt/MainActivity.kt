package com.example.databayt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.databayt.databayt.*
import com.example.databayt.databayt.member.Profile
import com.example.databayt.databayt.navigation.NavGraph
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.databayt.real.Real
import com.example.databayt.ui.theme.DatabaytTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           val navController = rememberNavController()
           NavGraph(navController = navController)


        }
    }
}

