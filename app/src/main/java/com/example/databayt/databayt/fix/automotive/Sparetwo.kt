package com.example.databayt.databayt.fix.automotive

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
import androidx.compose.ui.draw.scale
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
fun Sparetwo (navController: NavController) {

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
                                1 -> R.drawable.maf
                                2 -> R.drawable.maf
                                3 -> R.drawable.maf
                                4 -> R.drawable.maf
                                else -> R.drawable.maf
                            }
                        ),
                        contentDescription = "null",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(400.dp)
                            .fillMaxWidth()
                            .padding(40.dp)
                            .scale(0.8f)
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
                            .padding(horizontal = 15.dp))
                    {

                            Text(
                                modifier = Modifier
                                    .padding(14.dp)
                                    .padding(horizontal = 10.dp),
                                text = "Mass Air Flow Sensor",
                                style = Body)

                        Spacer(modifier = Modifier.width(70.dp))

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
                        inactiveColor = Color.Gray,
                        indicatorWidth = 10.dp,
                        spacing = 6.dp

                    )

                }
            }
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        {

            Text(text = "100% New, no Core Charges", style = Body)

            Spacer(modifier = Modifier.padding(top = 4.dp))

            Text(text = "Ceramic board provides reliable voltage to eliminate engine rough-idle problems", style = Body)

            Spacer(modifier = Modifier.padding(top = 4.dp))

            Text(text = "Platinum connector threads reduce the number of connection points for faster reaction to change", style = Body)

            Spacer(modifier = Modifier.padding(top = 4.dp))


        }


        Spacer(modifier = Modifier.padding(top = 20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(70.dp)
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
                    text = stringResource(id = R.string.buy),
                ),
                style = RealDetial,
                onClick = { navController.navigate(screen.Book.route) }
            )
        }
    }
}







