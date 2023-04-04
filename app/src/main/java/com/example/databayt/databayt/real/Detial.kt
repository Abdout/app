package com.example.databayt.databayt.real

import android.widget.Button
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.databayt.pagination.room
import com.example.databayt.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Detial (navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)
    )

    {
        Column() {
            val pagerState = rememberPagerState(
                pageCount = room.size,
                initialOffscreenLimit = 2
            )



            Box(
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                HorizontalPager(
                    state = pagerState,
                ) { page ->

                    Image(

                        painter = painterResource(
                            id = when (page) {
                                1 -> R.drawable.room1
                                2 -> R.drawable.room2
                                3 -> R.drawable.room3
                                4 -> R.drawable.room4
                                else -> R.drawable.room4
                            }
                        ),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(300.dp)
                            .fillMaxWidth()
                            .clickable { }

                    )


                }
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)


                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp)
                    )
                    {
                        Card(
                            modifier = Modifier
                                .size(50.dp)
                                .padding(8.dp)
                                .clickable { navController.navigate(screen.Real.route) },
                            backgroundColor = OffWhite,
                            shape = CircleShape,
                            elevation = 0.dp
                        ) {

                            Icon(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .padding(end = 2.dp),
                                painter = painterResource(id = R.drawable.back),
                                contentDescription = "null"
                            )

                        }

                        Spacer(modifier = Modifier.width(230.dp))

                        Card(
                            modifier = Modifier
                                .size(50.dp)
                                .padding(8.dp)
                                .clickable { navController.navigate(screen.Share.route) },
                            backgroundColor = OffWhite,
                            shape = CircleShape,
                            elevation = 0.dp
                        ) {

                            Icon(
                                modifier = Modifier
                                    .padding(9.dp)
                                    .padding(top = 0.dp),
                                painter = painterResource(id = R.drawable.share),
                                contentDescription = "null"
                            )

                        }
                        Spacer(modifier = Modifier.width(0.dp))

                        Card(
                            modifier = Modifier
                                .size(50.dp)
                                .padding(8.dp),
                            backgroundColor = OffWhite,
                            shape = CircleShape,
                            elevation = 0.dp
                        ) {

                            Icon(
                                modifier = Modifier
                                    .padding(7.dp)
                                    .padding(top = 2.dp),
                                painter = painterResource(id = R.drawable.fav),
                                contentDescription = "null"
                            )

                        }


                    }


                }
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 10.dp)
                ) {
                    HorizontalPagerIndicator(
                        pagerState = pagerState,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(10.dp),
                        activeColor = OffYellow,
                        inactiveColor = OffWhite,
                        indicatorWidth = 8.dp,
                        spacing = 6.dp

                    )

                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            text = stringResource(id = R.string.desc),
            style = RealDetial
        )

        Spacer(modifier = Modifier.padding(top = 7.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            Text(
                modifier = Modifier
                    .padding(top = 0.dp),
                text = stringResource(id = R.string.review),
                style = Realbody3,
            )

            Spacer(modifier = Modifier.width(10.dp))

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

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                modifier = Modifier
                    .padding(top = 0.dp),
                text = stringResource(id = R.string.location),
                style = Realbody3,
            )
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Spacer(modifier = Modifier.padding(top = 150.dp))

        Divider(
            modifier = Modifier.fillMaxWidth(1f),
            color = Color.Black, thickness = 0.3.dp
        )

        Spacer(modifier = Modifier.padding(top = 15.dp))


        Row()
        {
            Column() {

                Text(
                    text = stringResource(id = R.string.nightprice),
                    style = Realbody4)

                Text(
                    text = stringResource(id = R.string.date),
                    style = Realbody4)

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Divider(
                    modifier = Modifier.fillMaxWidth(0.18f),
                    color = Color.Black, thickness = 1.dp)


            }

            Spacer(modifier = Modifier.width(180.dp))

            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(110.dp)
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
                        text = stringResource(id = R.string.reserve),
                    ),
                    style = Tool2,
                    onClick = { navController.navigate(screen.Book.route) }
                )
            }
        }
    }
}



