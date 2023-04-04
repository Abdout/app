package com.example.databayt.databayt

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Forget (navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)


    ) {
        ClickableText(
            text = AnnotatedString(
                text = stringResource(id = R.string.databayt)),
            onClick = {navController.navigate(screen.Home.route)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 38.dp)
                .padding(top = 32.dp),
            style = Heading,

            )

        Spacer(modifier = Modifier.padding(top = 150.dp))
        
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            text = stringResource(id = R.string.forgetpassword),
        style = RealDetial)

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 43.dp),
            text = stringResource(id = R.string.reset),
            style = Body5)

        Spacer(modifier = Modifier.padding(top = 40.dp))

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.phone),
                style = Body4 )}

        )
        

        Spacer(modifier = Modifier.padding(top = 30.dp))


        Button(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(75.dp)
                .background(Color.Black),

            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = OffYellow)
        ) {
            Text(text = stringResource(id = R.string.resetpassword),
                style = Body3)


        }
    }
}