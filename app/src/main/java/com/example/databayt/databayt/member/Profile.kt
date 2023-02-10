package com.example.databayt.databayt.member

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.ui.theme.*

@Composable
fun Profile (navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)


    ) {
        Image(
            modifier = Modifier
                .padding(horizontal = 38.dp)
                .padding(top = 38.dp)
                .size(200.dp),

            painter = painterResource(id = R.drawable.profile),
            contentDescription = null // decorative element
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 45.dp),

            text = stringResource(id = R.string.profilename),
            style = Profilehead,

            )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 47.dp),

            text = stringResource(id = R.string.rankat),
            style = Profilebody,

            )

        Spacer(modifier = Modifier.padding(top = 1.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 47.dp),

            text = stringResource(id = R.string.address),
            style = Profilebody,

            )

        Spacer(modifier = Modifier.padding(top = 30.dp))




        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 43.dp)
            .size(size = 60.dp)


        )
        {
            Icon(

                painter = painterResource(id = R.drawable.facebook),
                contentDescription = null // decorative element,


            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.messenger),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.whatsapp),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.twitter),
                contentDescription = null // decorative element
            )
        }




    }
}