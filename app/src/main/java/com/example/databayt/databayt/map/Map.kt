package com.example.databayt.databayt.map

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
fun Map (navController: NavController) {
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
                        .padding(horizontal = 17.dp)
                        .padding(top = 12.dp),
                    text = stringResource(id = R.string.map),
                    style = Tool
                )


            }

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = stringResource(id =
            R.string.maphead), style = Tool)


        }
        Spacer(modifier = Modifier.padding(top = 17.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 44.dp),
            text = stringResource(id = R.string.mapbody), style = Body4
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
                .padding(horizontal = 64.dp)
        )
        {
            Icon(
                modifier = Modifier
                    .size(90.dp)
                    .clickable { navController.navigate(screen.Health.route) },
                painter = painterResource(id = R.drawable.health),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(88.dp))

            Icon(
                modifier = Modifier
                    .size(85.dp)
                    .clickable { navController.navigate(screen.Document.route) },
                painter = painterResource(id = R.drawable.document),
                contentDescription = null
            )


        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 75.dp)
        )
        {
            Text(text = stringResource(id = R.string.health), style = Tool)

            Spacer(modifier = Modifier.width(87.dp))

            Text(text = stringResource(id = R.string.document),
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
                modifier = Modifier.size(95.dp),
                painter = painterResource(id = R.drawable.shop),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(80.dp))

            Icon(
                modifier = Modifier
                    .size(90.dp)
                    .clickable { navController.navigate(screen.Company.route) },
                painter = painterResource(id = R.drawable.company),
                contentDescription = null
            )


        }

        Spacer(modifier = Modifier.padding(top = 18.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 80.dp)
        )
        {
            Text(text = stringResource(id = R.string.shop), style = Tool)

            Spacer(modifier = Modifier.width(100.dp))

            Text(text = stringResource(id = R.string.company),
                style = Tool,
                modifier = Modifier.fillMaxWidth()
                    .padding(end = 0.dp
                    ))
        }

    }
}




