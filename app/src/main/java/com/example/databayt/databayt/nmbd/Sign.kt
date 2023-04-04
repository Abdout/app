package com.example.databayt.databayt.nmbd

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.ui.theme.*

@Composable
fun Sign (navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)
            .verticalScroll(rememberScrollState())

    ) {

        Spacer(modifier = Modifier.padding(top = 40.dp))

        LinearProgressIndicator(
            progress = 0.4f,
            color = OffYellow,
            backgroundColor = Color.LightGray,
            modifier = Modifier
                .width(300.dp)
                .height(7.dp))

        Icon(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 30.dp)
                .size(200.dp),
            painter = painterResource(id = R.drawable.uploadimage),
            contentDescription = null,
            tint = Color.Gray// decorative element
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))
        
        Text(text = "Upload\nphoto", style = Heading)

        Icon(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 30.dp)
                .size(150.dp),
            painter = painterResource(id = R.drawable.document),
            contentDescription = null,
           // decorative element
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(text = "Upload\nresume", style = Heading)

        Spacer(modifier = Modifier.padding(top = 20.dp))

        OutlinedTextField(
            value = "", onValueChange = {}
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 30.dp),
            text = "Keyword\n\n"+
                "navigate to new screen just after upload completed\n" +
                "auto navigate\n" +
                "shift foucs request",
            style = Body
        )

        Spacer(modifier = Modifier.padding(top = 40.dp))


    }
}