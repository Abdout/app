package com.example.databayt.databayt.map

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Composable
fun Company (navController: NavController) {
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
                    .clickable { navController.navigate(screen.Fix.route) },
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(110.dp))

            Text(
                text = stringResource(id = R.string.healthhead),
                style = Body,
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

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 42.dp))
        {
            Icon(


                painter = painterResource(id = R.drawable.filter),
                contentDescription = "null"
            )

        }


        Spacer(modifier = Modifier.padding(top = 20.dp))

        var expandedStateb by remember { mutableStateOf(false) }

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            shape = RoundedCornerShape(4.dp),
            backgroundColor = OffWhite,
            elevation = 4.dp,
            onClick = {
                expandedStateb = !expandedStateb
            }
        ) {
            Column() {
                Row() {
                    Image (
                        painter = painterResource(id = R.drawable.sayga),
                        contentDescription = "null",
                        modifier = Modifier
                            .size(85.dp)
                            .padding(horizontal = 20.dp)
                    )

                    //Spacer(modifier = Modifier.width(3.dp))

                    ClickableText(
                        modifier = Modifier.padding(top = 19.dp),

                        text = AnnotatedString(text = stringResource(id = R.string.sagya)),
                        style = Head,
                        onClick = {
                            expandedStateb = !expandedStateb
                        })

                }



                if (expandedStateb) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 28.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .size(28.dp),

                            painter = painterResource(id = R.drawable.pin),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(5.dp))

                        ClickableText(
                            modifier = Modifier
                                .padding(top = 3.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.royalpin)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 4.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 1.5.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.time),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.royalhours)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 2.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.call),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(8.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.royalcall)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 34.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 1.8.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.royalemail)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 5.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.8.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 2.5.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.web),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.royalweb)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 20.dp))


                }

            }
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        var expandedState by remember { mutableStateOf(false) }

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            shape = RoundedCornerShape(4.dp),
            backgroundColor = OffWhite,
            elevation = 4.dp,
            onClick = {
                expandedState = !expandedState
            }
        ) {
            Column() {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.morouj),
                        contentDescription = "null",
                        modifier = Modifier
                            .size(85.dp)
                            .padding(horizontal = 20.dp)
                    )

                    //Spacer(modifier = Modifier.width(3.dp))

                    ClickableText(
                        modifier = Modifier.padding(top = 19.dp),

                        text = AnnotatedString(text = stringResource(id = R.string.morouj)),
                        style = Head,
                        onClick = {
                            expandedState = !expandedState
                        })

                }



                if (expandedState) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 28.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .size(28.dp),

                            painter = painterResource(id = R.drawable.pin),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(5.dp))

                        ClickableText(
                            modifier = Modifier
                                .padding(top = 3.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.fedialpin)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 4.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 1.5.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.time),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.fedialhours)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 2.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.call),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(8.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.fedialcall)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 34.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 1.8.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.fedialemail)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 5.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 33.8.dp)
                    ) {

                        Icon(
                            modifier = Modifier
                                .padding(top = 2.5.dp)
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.web),
                            contentDescription = "null"
                        )


                        Spacer(modifier = Modifier.width(10.dp))

                        ClickableText(
                            modifier = Modifier.padding(top = 0.dp),

                            text = AnnotatedString(text = stringResource(id = R.string.fedialweb)),
                            style = Body,
                            onClick = {
                                navController.navigate(screen.Home.route)
                            })
                    }

                    Spacer(modifier = Modifier.padding(top = 20.dp))


                }

            }
        }


    }
}

