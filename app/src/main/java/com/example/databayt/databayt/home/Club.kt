package com.example.databayt.databayt.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Club (navController: NavController) {
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
                .padding(horizontal = 38.dp)
        ) {

            Text(
                modifier = Modifier.padding(top = 32.dp),
                text = stringResource(id = R.string.databayt),
                style = Heading,

                )

            Spacer(modifier = Modifier.width(170.dp))

            Icon(
                modifier = Modifier
                    .size(60.dp)
                    .padding(top = 33.dp),
                painter = painterResource(id = R.drawable.menu),
                contentDescription = null

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

        Spacer(modifier = Modifier.padding(top = 15.dp))
        Row(


            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 43.dp)
        )
        {


            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.blog)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Home.route)
                })

            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.tool)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            Column() {

                ClickableText(

                    text = AnnotatedString(text = stringResource(id = R.string.club)),
                    style = Heada,
                    onClick = {
                        navController.navigate(screen.Club.route)
                    })


                Spacer(modifier = Modifier.padding(top = 2.5.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.18f)
                        .padding(horizontal = 2.dp),
                    color = Color.Black, thickness = 1.5.dp,

                    )

            }


            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.inspire)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Inspire.route)
                })

        }

        Spacer(modifier = Modifier.padding(top = 25.dp))

        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .horizontalScroll(rememberScrollState())

        ) {

            Column() {


                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.seastar),
                    contentDescription = null // decorative element
                )
                Spacer(modifier = Modifier.padding(top = 7.dp))

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 53.dp),

                    text = AnnotatedString(text = stringResource(id = R.string.date)),
                    style = HeadYellow,

                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })

            }



            Spacer(modifier = Modifier.width(20.dp))

            Column() {


                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.tech),
                    contentDescription = null // decorative element
                )
                Spacer(modifier = Modifier.padding(top = 7.dp))

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 53.dp),

                    text = AnnotatedString(text = stringResource(id = R.string.lm2a)),
                    style = HeadYellow,

                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })

            }



            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.engineer),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.padding(top = 7.dp))

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 53.dp),

                    text = AnnotatedString(text = stringResource(id = R.string.lm2a)),
                    style = Head,
                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })

            }


            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 5.dp)
                        .clickable { navController.navigate(screen.NMBD.route) }
                    ,


                    painter = painterResource(id = R.drawable.nm),
                    contentDescription = null // decorative element
                )
                Spacer(modifier = Modifier.padding(top = 7.dp))

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 53.dp),

                    text = AnnotatedString(text = stringResource(id = R.string.lm2a)),
                    style = Head,
                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })

            }



            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.watson),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.padding(top = 7.dp))

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 53.dp),

                    text = AnnotatedString(text = stringResource(id = R.string.lm2a)),
                    style = Head,
                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })

            }
        }
    }
}

