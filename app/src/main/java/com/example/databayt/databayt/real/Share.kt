package com.example.databayt.databayt.real

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Share (navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Teal200)


    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 20.dp)
        ) {
            Icon(
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Detial.route) },
                painter = painterResource(id = R.drawable.close),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(120.dp))

            Text(
                text = stringResource(id = R.string.realshare),
                style = Head2,
            )

        }

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            text = stringResource(id = R.string.realsharedesc),
            style = Realbody2,
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .verticalScroll(rememberScrollState())
        )
        {
            Row()
            {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .height(100.dp),
                    shape = RoundedCornerShape(4.dp)
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.room1),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                Column()
                {
                    Text(
                        text = stringResource(id = R.string.breifdesc),
                        style = Realbody2
                    )

                    Spacer(modifier = Modifier.padding(top = 28.dp))

                    Row()
                    {

                        Icon(
                            modifier = Modifier
                                .size(18.dp)
                                .padding(top = 0.dp),
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            modifier = Modifier
                                .padding(top = 0.dp),
                            text = stringResource(id = R.string.rate),
                            style = Body,
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = stringResource(id = R.string.nightprice),
                            style = Body
                        )

                    }
                }


            }

            Spacer(modifier = Modifier.padding(top = 50.dp))
            
            Card(
                modifier = Modifier
                    .height(52.dp),
                border = BorderStroke(
                    color = Color.LightGray,
                    width = 0.5.dp),
                backgroundColor = Color.White,
                elevation = 0.dp,
                shape = RoundedCornerShape(8.dp)
            ) {

                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(12.dp))
                {
                    Text(
                        modifier = Modifier
                            .weight(10f),
                        text = stringResource(id = R.string.realsharecopylink),
                        style = Head2
                    )

                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.copy),
                        contentDescription = "null")

                }
                
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Card(
                modifier = Modifier
                    .height(100.dp),
                border = BorderStroke(
                    color = Color.LightGray,
                    width = 1.dp),
                backgroundColor = Color.White,
                elevation = 0.dp,
                shape = RoundedCornerShape(8.dp)
            ) {

                Column() {

                    Row(verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(12.dp))
                    {
                        Text(
                            modifier = Modifier
                                .weight(10f),
                            text = stringResource(id = R.string.realsharewhatsapp),
                            style = Head2
                        )

                        Icon(
                            modifier = Modifier
                                .weight(1f)
                                .size(25.dp),
                            painter = painterResource(id = R.drawable.whatsapp),
                            contentDescription = "null")

                    }

                    Divider(
                        modifier = Modifier
                            .fillMaxWidth(1f),
                        color = Color.LightGray, thickness = 0.7.dp
                    )

                    Row(verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(12.dp))
                    {
                        Text(
                            modifier = Modifier
                                .weight(10f),
                            text = stringResource(id = R.string.realsharemessenger),
                            style = Head2
                        )

                        Icon(
                            modifier = Modifier
                                .weight(1f)
                                .size(23.dp),
                            painter = painterResource(id = R.drawable.messenger),
                            contentDescription = "null")

                    }


                }



            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Card(
                modifier = Modifier
                    .height(52.dp),
                border = BorderStroke(
                    color = Color.LightGray,
                    width = 0.5.dp),
                backgroundColor = Color.White,
                elevation = 0.dp,
                shape = RoundedCornerShape(8.dp)
            ) {

                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(12.dp))
                {
                    Text(
                        modifier = Modifier
                            .weight(10f),
                        text = stringResource(id = R.string.realsharemore),
                        style = Head2
                    )

                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.more2),
                        contentDescription = "null")

                }

            }

        }
    }
}