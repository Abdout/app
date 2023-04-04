package com.example.databayt.databayt.real

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Book (navController: NavController) {

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
                    .size(20.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Detial.route) },
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(85.dp))

            Text(
                text = stringResource(id = R.string.book),
                style = Head2,
            )

        }

        Spacer(modifier = Modifier.padding(top = 25.dp))

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

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bookprotected),
                style = Body
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f),
                color = Color.Black, thickness = 0.3.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.booktrip),
                style = Realbody2
            )

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Text(
                text = stringResource(id = R.string.bookdate),
                style = Bodya,

            )


            Row()
            {
                Text(
                    text = stringResource(id = R.string.date),
                    style = Bodyb,

                )

                Spacer(modifier = Modifier.width(224.dp))

                Text(
                    text = stringResource(id = R.string.bookedit),
                    style = Bodya,
                    textDecoration = TextDecoration.Underline

                )

            }

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Text(
                text = stringResource(id = R.string.bookguest),
                style = Bodya
            )


            Row()
            {
                Text(
                    text = stringResource(id = R.string.bookguestno),
                    style = Bodyb
                )

                Spacer(modifier = Modifier.width(245.dp))

                Text(
                    text = stringResource(id = R.string.bookedit),
                    style = Bodya,
                    textDecoration = TextDecoration.Underline
                )

            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f),
                color = Color.Black, thickness = 0.3.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bookprice),
                style = Realbody2
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row()
            {
                Text(
                    text = stringResource(id = R.string.booknight),
                    style = Body
                )

                Spacer(modifier = Modifier.width(180.dp))

                Text(
                    text = stringResource(id = R.string.booknights),
                    style = Body
                )

            }

            Row()
            {
                Text(
                    text = stringResource(id = R.string.bookfee),
                    style = Body
                )

                Spacer(modifier = Modifier.width(215.dp))

                Text(
                    text = stringResource(id = R.string.bookfees),
                    style = Body
                )

            }

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row()
            {
                Text(
                    text = stringResource(id = R.string.booktotal),
                    style = Body,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.width(252.dp))

                Text(
                    text = stringResource(id = R.string.booktotals),
                    style = Body,
                    fontWeight = FontWeight.SemiBold
                )

            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f),
                color = Color.Black, thickness = 0.3.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bookpay),
                style = Realbody2
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row()
            {
                Icon(
                    modifier = Modifier
                        .padding(top = 4.dp),
                    painter = painterResource(id = R.drawable.cash),
                    contentDescription = "null"
                )

                Spacer(modifier = Modifier.width(7.dp))

                Text(
                    text = stringResource(id = R.string.bookcash),
                    style = Bodya
                )

                Spacer(modifier = Modifier.width(247.dp))

                Icon(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .size(13.dp),
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "null"
                )
            }

            Spacer(modifier = Modifier.padding(top = 7.dp))

            Row()
            {
                Icon(
                    modifier = Modifier
                        .padding(top = 2.dp),
                    painter = painterResource(id = R.drawable.credit),
                    contentDescription = "null"
                )

                Spacer(modifier = Modifier.width(7.dp))

                Text(
                    text = stringResource(id = R.string.bookcredit),
                    style = Bodya
                )

                Spacer(modifier = Modifier.width(130.dp))

                Icon(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .size(13.dp),
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "null"
                )
            }

            Spacer(modifier = Modifier.padding(top = 7.dp))

            Row()
            {
                Box(
                    modifier = Modifier
                        .height(20.dp)
                        .width(26.dp)
                        .padding(top = 3.dp)
                        .border(
                            BorderStroke(width = 0.6.dp, color = Color.Black),
                            shape = RoundedCornerShape(2.dp))
                )

                {
                    Image(
                        modifier = Modifier
                            .align(Alignment.Center),
                        painter = painterResource(id = R.drawable.paypal),
                        contentDescription = "null")
                }

                Spacer(modifier = Modifier.width(7.dp))

                Text(
                    text = stringResource(id = R.string.bookpaypal),
                    style = Bodya
                )

                Spacer(modifier = Modifier.width(233.dp))

                Icon(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .size(13.dp),
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "null"
                )
            }

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier
                    .fillMaxWidth(1f),
                color = Color.Black, thickness = 0.3.dp
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                text = stringResource(id = R.string.bookpolicy),
                style = Body
            )

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Button(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(70.dp)
                    .background(Color.Black),

                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = OffYellow)
            ) {
                Text(
                    text = stringResource(id = R.string.book),
                    style = Body3
                )
            }

            Spacer(modifier = Modifier.padding(top = 40.dp))

        }
    }
}
