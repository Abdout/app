package com.example.databayt.databayt.real

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Filter (navController: NavController) {

    val kitchenState = remember { mutableStateOf(true) }
    val wifiState = remember { mutableStateOf(true) }
    val washerState = remember { mutableStateOf(true) }
    val airState = remember { mutableStateOf(true) }
    val tvState = remember { mutableStateOf(true) }




    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)


    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 20.dp)
        ) {
            Icon(
                modifier = Modifier
                    .size(17.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Real.route) },
                painter = painterResource(id = R.drawable.close),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(128.dp))

            Text(
                text = stringResource(id = R.string.filter),
                style = Head2,
            )

        }

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .verticalScroll(rememberScrollState())
        )
        {

            Text(
                text = stringResource(id = R.string.filtertype),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Row()
            {

                Icon(
                    modifier = Modifier.size(55.dp),

                    painter = painterResource(id = R.drawable.bed),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(40.dp))

                Icon(
                    modifier = Modifier.size(51.dp),
                    painter = painterResource(id = R.drawable.house),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(40.dp))

                Icon(

                    modifier = Modifier.size(52.dp),

                    painter = painterResource(id = R.drawable.apartment),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(40.dp))

                Icon(
                    modifier = Modifier.size(51.dp),

                    painter = painterResource(id = R.drawable.hotel),
                    contentDescription = null // decorative element
                )
            }

            Spacer(modifier = Modifier.padding(top = 4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 7.dp)
            )
            {
                Text(text = stringResource(id = R.string.room), style = Realbody)

                Spacer(modifier = Modifier.width(50.5.dp))

                Text(text = stringResource(id = R.string.home), style = Realbody)

                Spacer(modifier = Modifier.width(48.dp))

                Text(text = stringResource(id = R.string.aprt), style = Realbody)

                Spacer(modifier = Modifier.width(40.dp))

                Text(text = stringResource(id = R.string.hotel), style = Realbody)
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(top = 9.dp),
                color = Color.Black, thickness = 0.2.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.filterplace),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))




            Row()
            {

                Icon(
                    modifier = Modifier.size(25.dp),

                    painter = painterResource(id = R.drawable.pinout),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(10.dp))

                ClickableText(
                    text = AnnotatedString(
                        stringResource(id = R.string.filtercity)
                    ),
                    style = Head2,
                    onClick = {})

                Spacer(modifier = Modifier.width(2.dp))

                Icon(
                    modifier = Modifier
                        .size(22.dp)
                        .padding(top = 7.dp),
                    painter = painterResource(id = R.drawable.down),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(20.dp))

                Canvas(
                    modifier = Modifier
                        .padding(top = 13.dp)
                )
                {
                    drawCircle(
                        color = Color.Black,
                        radius = 6f
                    )

                }

                Spacer(modifier = Modifier.width(20.dp))

                ClickableText(
                    text = AnnotatedString(
                        stringResource(id = R.string.filterdistrict)
                    ),
                    style = Head2,
                    onClick = {})

                Spacer(modifier = Modifier.width(2.dp))

                Icon(
                    modifier = Modifier
                        .size(22.dp)
                        .padding(top = 7.dp),
                    painter = painterResource(id = R.drawable.down),
                    contentDescription = null // decorative element
                )
            }

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 3.dp)


            )
            {

                Icon(
                    modifier = Modifier
                        .size(20.dp)
                        .padding(top = 2.dp),
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(13.dp))

                ClickableText(
                    text = AnnotatedString(
                        stringResource(id = R.string.filterfrom)
                    ),
                    style = Head2,
                    onClick = {})

                Spacer(modifier = Modifier.width(2.dp))

                Icon(
                    modifier = Modifier
                        .size(22.dp)
                        .padding(top = 7.dp),
                    painter = painterResource(id = R.drawable.down),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(20.dp))

                Canvas(
                    modifier = Modifier
                        .padding(top = 13.dp)
                )
                {
                    drawCircle(
                        color = Color.Black,
                        radius = 6f
                    )

                }

                Spacer(modifier = Modifier.width(20.dp))

                ClickableText(
                    text = AnnotatedString(
                        stringResource(id = R.string.filterto)
                    ),
                    style = Head2,
                    onClick = {})

                Spacer(modifier = Modifier.width(2.dp))

                Icon(
                    modifier = Modifier
                        .size(22.dp)
                        .padding(top = 7.dp),
                    painter = painterResource(id = R.drawable.down),
                    contentDescription = null // decorative element
                )
            }


            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(top = 9.dp),
                color = Color.Black, thickness = 0.2.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))



            Text(
                text = stringResource(id = R.string.pricerange),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 7.dp))

            Text(
                text = stringResource(id = R.string.fromto),
                style = Head,
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Text(
                text = stringResource(id = R.string.avg),
                style = Body,
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Row() {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.range),
                    contentDescription = "null",
                    tint = Color.DarkGray

                )

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 15.dp),
                    color = Color.DarkGray, thickness = 2.dp
                )

                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.range),
                    contentDescription = "null",
                    tint = Color.DarkGray
                )


            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(top = 9.dp),
                color = Color.Black, thickness = 0.2.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bedroom),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Row() {

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(55.dp)
                        .background(
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.any)
                        ),
                        style = White,
                        onClick = { navController.navigate(screen.Real.route) }
                    )


                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "1"
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "2"
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "3"
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "4"
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bathroom),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Row() {

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(55.dp)
                        .background(
                            color = Color.DarkGray,
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.any)
                        ),
                        style = White,
                        onClick = { navController.navigate(screen.Real.route) }
                    )


                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "1"
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .height(35.dp)
                        .width(40.dp)
                        .border(
                            BorderStroke(width = 1.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )

                {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = "2"
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(top = 9.dp),
                color = Color.Black, thickness = 0.2.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.amenities),
                style = Realbody2,
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))


            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    modifier = Modifier
                        .weight(10f),
                    text = stringResource(id = R.string.kitchen),
                    style = Head2,
                )



                Checkbox(
                    modifier = Modifier
                        .weight(1f)
                        .size(1.dp)
                        .scale(0.7f),
                    checked = kitchenState.value,
                    onCheckedChange = { kitchenState.value = it },

                    colors = CheckboxDefaults.colors
                        (
                        checkmarkColor = OffWhite,
                        checkedColor = Color.DarkGray
                    )
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    modifier = Modifier
                        .weight(10f),
                    text = stringResource(id = R.string.wifi),
                    style = Head2,
                )


                Checkbox(
                    modifier = Modifier
                        .weight(1f)
                        .size(1.dp)
                        .scale(0.7f),
                    checked = wifiState.value,
                    onCheckedChange = { wifiState.value = it },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = OffWhite,
                        checkedColor = Color.DarkGray,


                        )
                )
            }


            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    modifier = Modifier
                        .weight(10f),
                    text = stringResource(id = R.string.washer),
                    style = Head2,
                )



                Checkbox(
                    modifier = Modifier
                        .weight(1f)
                        .size(1.dp)
                        .scale(0.7f),
                    checked = washerState.value,
                    onCheckedChange = { washerState.value = it },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = OffWhite,
                        checkedColor = Color.DarkGray,


                        )
                )
            }



            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    modifier = Modifier
                        .weight(10f),
                    text = stringResource(id = R.string.air),
                    style = Head2,
                )



                Checkbox(
                    modifier = Modifier
                        .weight(1f)
                        .size(1.dp)
                        .scale(0.7f),
                    checked = airState.value,
                    onCheckedChange = { airState.value = it },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = OffWhite,
                        checkedColor = Color.DarkGray,


                        )
                )
            }


            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    modifier = Modifier
                        .weight(10f),
                    text = stringResource(id = R.string.tv),
                    style = Head2,
                )



                Checkbox(
                    modifier = Modifier
                        .weight(1f)
                        .size(1.dp)
                        .scale(0.7f),
                    checked = tvState.value,
                    onCheckedChange = { tvState.value = it },
                    colors = CheckboxDefaults.colors(
                        checkmarkColor = OffWhite,
                        checkedColor = Color.DarkGray,


                        )
                )
            }

            Spacer(modifier = Modifier.padding(top = 40.dp))




            Row()
            {
                Text(
                    modifier = Modifier.padding(top = 25.dp),
                    text = stringResource(id = R.string.filterclear),
                    style = Bodya,
                    textDecoration = TextDecoration.Underline
                )


                Spacer(modifier = Modifier.width(118.dp))

                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(150.dp)
                        .background(
                            color = OffYellow,
                            shape = RoundedCornerShape(4.dp)
                        )
                )

                {

                    ClickableText(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.filtershow),
                        ),
                        style = Bodyc,
                        onClick = { navController.navigate(screen.Book.route) }
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))
        }
    }
}

