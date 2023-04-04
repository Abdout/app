package com.example.databayt.databayt.fix

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Fix (navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)


    ) {

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 44.dp)

        ) {

            Box(

                modifier = Modifier
                    .height(50.dp)
                    .width(80.dp)
                    .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

            )

            {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 22.dp)
                        .padding(top = 12.dp),
                    text = stringResource(id = R.string.fix),
                    style = Tool
                )


            }

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = stringResource(id = R.string.fixhead), style = Tool)


        }
        Spacer(modifier = Modifier.padding(top = 17.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 44.dp),
            text = stringResource(id = R.string.fixbody), style = Body4
        )

        Spacer(modifier = Modifier.padding(top = 24.dp))

        Divider(
            modifier = Modifier.fillMaxWidth(0.77f),
            color = Color.Black, thickness = 0.7.dp
        )

        Spacer(modifier = Modifier.padding(top = 60.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
        )
        {
            Icon(
                modifier = Modifier
                    .size(100.dp)
                    .clickable { navController.navigate(screen.Automotive.route) },
                painter = painterResource(id = R.drawable.wheel),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(65.dp))

            Icon(
                modifier = Modifier
                    .size(110.dp)
                    .clickable { navController.navigate(screen.Elevator.route) },
                painter = painterResource(id = R.drawable.elevator),
                contentDescription = null
            )


        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 55.dp)
        )
        {
            Text(text = stringResource(id = R.string.automotive), style = Tool)

            Spacer(modifier = Modifier.width(60.dp))

            Text(text = stringResource(id = R.string.elevator),
                style = Tool,
                modifier = Modifier.fillMaxWidth()
                    .padding(end = 0.dp
                    ))
        }

        Spacer(modifier = Modifier.padding(top = 60.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)
        )
        {
            Icon(
                modifier = Modifier
                    .size(100.dp)
                    .clickable { navController.navigate(screen.Generator.route) },
                painter = painterResource(id = R.drawable.power),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(70.dp))

            Icon(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.fan),
                contentDescription = null
            )


        }

        Spacer(modifier = Modifier.padding(top = 18.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 55.dp)
        )
        {
            Text(text = stringResource(id = R.string.generator), style = Tool)

            Spacer(modifier = Modifier.width(65.dp))

            Text(text = stringResource(id = R.string.appliance),
                style = Tool,
                modifier = Modifier.fillMaxWidth()
                    .padding(end = 0.dp
                    ))
        }

    }
}




