package com.example.databayt.databayt.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Inspire (navController: NavController) {
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
                modifier = Modifier.padding(top = 40.dp),
                text = stringResource(id = R.string.databayt),
                style = Heading,

                )

            Spacer(modifier = Modifier.width(70.dp))

            ClickableText(
                modifier = Modifier.padding(top = 45.dp),
                text = AnnotatedString(text = stringResource(id = R.string.login)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Login.route)
                })

            Spacer(modifier = Modifier.width(14.dp))

            Box(

                modifier = Modifier
                    .padding(top = 42.dp)
                    .height(27.dp)
                    .width(45.dp)
                    .background(OffWhite)
                    .border(
                        BorderStroke(width = 0.5.dp, color = Color.Black),
                        shape = RoundedCornerShape(2.dp),


                        )
            ) {

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 6.dp)
                        .padding(top = 3.dp),
                    text = AnnotatedString(
                        text = stringResource(id = R.string.join)
                    ),
                    style = Body,
                    onClick = { navController.navigate(screen.Join.route) }

                )

            }
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
                .fillMaxHeight(0.1f)
                .onFocusChanged { focus ->
                    focusState = focus.isFocused
                },

            value = textValue.value,
            onValueChange = { textValue.value = it },
            placeholder = {
                Text(
                    text = if (focusState) "" else
                        stringResource(id = R.string.search),
                    style = Body4
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
                focusedBorderColor = colorResource(id = R.color.offgrey),
                unfocusedBorderColor = colorResource(id = R.color.offgrey),
                unfocusedLabelColor = Color.Red,
                cursorColor = colorResource(id = R.color.offgrey),

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
                .padding(horizontal = 43.dp)
        )
        {


            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.blog)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Blog.route)
                })

            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.tool)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.club)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Club.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.inspire)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Inspire.route)
                })

        }

        Spacer(modifier = Modifier.padding(top = 25.dp))


        Column() {

            Row(
                modifier = Modifier
                    .padding(horizontal = 42.dp)


            ) {


                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 13.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.seek)
                        ),
                        style = Tool,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(text = stringResource(id = R.string.seekhead), style = Tool)


            }
            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 44.dp),
                text = stringResource(id = R.string.seekbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 24.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(0.77f),
                color = Color.Black, thickness = 0.2.dp
            )

            Spacer(modifier = Modifier.padding(top = 24.dp))

            Row(
                modifier = Modifier
                    .padding(horizontal = 42.dp)


            ) {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 13.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.fix)
                        ),
                        style = Tool,
                        onClick = { navController.navigate(screen.Seek.route) }
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

            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(80.dp)
                    .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

            )

            {
                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 13.dp)
                        .padding(top = 12.dp),
                    text = AnnotatedString(
                        text = stringResource(id = R.string.por)
                    ),
                    style = Tool,
                    onClick = { navController.navigate(screen.Porfile.route) }
                )


            }

            Spacer(modifier = Modifier.padding(top = 24.dp))

            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(80.dp)
                    .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

            )

            {
                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 13.dp)
                        .padding(top = 12.dp),
                    text = AnnotatedString(
                        text = stringResource(id = R.string.real)
                    ),
                    style = Tool,
                    onClick = { navController.navigate(screen.Real.route) }
                )


            }

            Spacer(modifier = Modifier.padding(top = 24.dp))

            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(80.dp)
                    .background(color = OffYellow, shape = RoundedCornerShape(4.dp))

            )

            {
                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 13.dp)
                        .padding(top = 12.dp),
                    text = AnnotatedString(
                        text = stringResource(id = R.string.real)
                    ),
                    style = Tool,
                    onClick = { navController.navigate(screen.Real.route) }
                )


            }

        }


    }



}


