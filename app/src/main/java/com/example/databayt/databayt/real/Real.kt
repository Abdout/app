package com.example.databayt.databayt.real

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.databayt.pagination.room
import com.example.databayt.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalComposeUiApi::class)
@ExperimentalPagerApi
@Composable
fun Real (navController: NavController) {

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
                .padding(horizontal = 35.dp)
                .padding(top = 20.dp)
        ) {
            Icon(
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Fix.route) },
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(130.dp))

            Text(
                text = stringResource(id = R.string.real),
                style = Head2,
            )

        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        //Search
        var textValue = remember {
            mutableStateOf("")
        }


        val keyboardController = LocalSoftwareKeyboardController.current

        var focusState by remember { mutableStateOf(false) }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight(0.085f)
                .onFocusChanged { focus ->
                    focusState = focus.isFocused
                },

            value = textValue.value,
            onValueChange = { textValue.value = it },
            placeholder = {
                Text(
                    text = if (focusState) "" else
                        stringResource(id = R.string.search),

                    style = Field
                )
            },

            trailingIcon = {
                Icon(
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 10.dp),


                    painter = painterResource(
                        id = R.drawable.search
                    ),
                    contentDescription = null // search icon
                )
            },


            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = colorResource(id = R.color.offgrey),
                cursorColor = Color.Black,
                trailingIconColor = colorResource(id = R.color.offgrey),

                ),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    keyboardController?.hide()
                }
            )
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp)
        )
        {
            Icon(
                modifier = Modifier
                    .clickable { navController.navigate(screen.Filter.route) },
                painter = painterResource(id = R.drawable.filter),
                contentDescription = "null"
            )

        }


        Spacer(modifier = Modifier.padding(top = 20.dp))


        val pagerState = rememberPagerState(
            pageCount = room.size,
            initialOffscreenLimit = 2
        )


        Card(
            modifier = Modifier
                .fillMaxWidth(0.82f)
                .height(380.dp),
            shape = RoundedCornerShape(4.dp),
            backgroundColor = OffWhite,
            elevation = 3.dp,
        ) {
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
                            .height(250.dp)
                            .fillMaxWidth()
                            .clickable { navController.navigate(screen.Detial.route) }
                    )
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(15.dp)

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.fav),
                        contentDescription = "null",
                        tint = OffWhite
                    )

                }
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 135.dp)
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
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(bottom = 20.dp)

                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp)
                    ) {

                        Text(
                            text = stringResource(id = R.string.location),
                            style = Realbody2,

                            )
                        Spacer(modifier = Modifier.width(70.dp))
                        Icon(
                            modifier = Modifier
                                .size(22.dp)
                                .padding(top = 2.5.dp),
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = stringResource(id = R.string.rate),
                            style = Realbody2,
                        )

                    }



                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),

                        text = stringResource(id = R.string.hosted),
                        style = Realbody4,

                        )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),

                        text = stringResource(id = R.string.date),
                        style = Realbody4,

                        )

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp),

                        text = stringResource(id = R.string.price),
                        style = Realbody3,

                        )
                }

                Spacer(modifier = Modifier.padding(top = 20.dp))

            }
        }
    }
}

