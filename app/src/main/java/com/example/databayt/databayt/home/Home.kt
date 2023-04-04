package com.example.databayt.databayt

import android.widget.Toast
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Home (navController: NavController) {
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

            //drop menu

            val listItems = arrayOf("Log in", "Join", "Contact", "Share")

            val contextForToast = LocalContext.current.applicationContext

            var expanded by remember {
                mutableStateOf(false)
            }

            Box(
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = {
                    expanded = true
                }) {

                    Icon(
                        modifier = Modifier
                            .size(60.dp)
                            .padding(top = 33.dp),
                        painter = painterResource(id = R.drawable.menu),
                        contentDescription = null

                    )
                }


            }

            DropdownMenu(

                offset = DpOffset(x = (168).dp, y = (7).dp),

                modifier = Modifier
                    .background(OffWhite)
                    .fillMaxWidth(0.4f),
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {

                DropdownMenuItem(
                    onClick = { navController.navigate(screen.Login.route) })
                {
                    Text("Log in", style = Heada)
                }

                Divider()

                DropdownMenuItem(
                    onClick = { navController.navigate(screen.Join.route) })
                {
                    Text("Join", style = Heada)
                }

                Divider()

                DropdownMenuItem(
                    onClick = { navController.navigate(screen.Login.route) })
                {
                    Text("Contact", style = Heada)
                }

                Divider()

                DropdownMenuItem(
                    onClick = { navController.navigate(screen.Login.route) })
                {
                    Text("Collaboration", style = Heada)
                }
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
            Column() {

                ClickableText(

                    text = AnnotatedString(text = stringResource(id = R.string.blog)),
                    style = Heada,
                    onClick = {
                        navController.navigate(screen.Home.route)
                    })

                Spacer(modifier = Modifier.padding(top = 2.5.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.1f)
                        .padding(horizontal = 1.dp),
                    color = Color.Black, thickness = 1.5.dp,

                    )


            }




            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.tool)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.club)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Club.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.inspire)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Inspire.route)
                })
        }



        Spacer(modifier = Modifier.padding(top = 28.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())

        ) {

            Text(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 45.dp),

                text = AnnotatedString(text = stringResource(id = R.string.abouthead)),
                style = Arabichead,
                textAlign = TextAlign.Right
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(
                modifier = Modifier
                    .padding(end = 17.dp)
                    .padding(horizontal = 30.dp),

                text = AnnotatedString(text = stringResource(id = R.string.aboutbody)),
                style = Arabicbody,
                textAlign = TextAlign.Right
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Box()

            {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(480.dp),
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "null",
                    contentScale = ContentScale.Crop)

                Spacer(modifier = Modifier.padding(top = 40.dp))

                Column(modifier = Modifier
                    .padding(top = 40.dp, start = 40.dp, end = 40.dp, bottom = 15.dp))
                {

                    Spacer(modifier = Modifier.padding(top = 20.dp))


                    Text(text = "Contact", style = RealDetial)

                    Spacer(modifier = Modifier.padding(top = 5.dp))

                    Text(text = "Developer", style = RealDetial)

                    Spacer(modifier = Modifier.padding(top = 5.dp))

                    Text(text = "Privacy policy", style = RealDetial)

                    Spacer(modifier = Modifier.padding(top = 15.dp))

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp)) {
                        Icon(

                            painter = painterResource(id = R.drawable.coffee),
                            contentDescription = null // decorative element
                        )

                        ClickableText(

                            modifier = Modifier.padding(top = 20.dp),

                            text = AnnotatedString(text = "Buy\nme a coffee"),
                            style = RealDetial,
                            onClick = {
                                navController.navigate(screen.Inspire.route)
                            })
                    }

                    Row(modifier = Modifier.fillMaxWidth()) {

                        Image(
                            modifier = Modifier.size(150.dp),
                            painter = painterResource(id = R.drawable.appstore),
                            contentDescription = "null" )

                        Spacer(modifier = Modifier.width(30.dp))

                        Image(
                            modifier = Modifier.size(150.dp),
                            painter = painterResource(id = R.drawable.googleplay),
                            contentDescription = "null" )


                    }






                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp)
                            .size(size = 35.dp)


                    )
                    {




                        Icon(

                            painter = painterResource(id = R.drawable.github),
                            contentDescription = null // decorative element,


                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Icon(

                            painter = painterResource(id = R.drawable.whatsapp),
                            contentDescription = null // decorative element
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Icon(

                            painter = painterResource(id = R.drawable.messenger),
                            contentDescription = null // decorative element
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Icon(

                            painter = painterResource(id = R.drawable.telegram),
                            contentDescription = null // decorative element
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Icon(

                            painter = painterResource(id = R.drawable.facebook),
                            contentDescription = null // decorative element
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Icon(

                            painter = painterResource(id = R.drawable.twitter),
                            contentDescription = null // decorative element
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 20.dp))

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 55.dp)) {
                        Icon(
                            modifier = Modifier
                                .padding(top = 1.dp)
                                .size(20.dp),
                            painter = painterResource(id = R.drawable.copyright),
                            contentDescription = "null")

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(text = "Databayt, All rights free", style = Heada)

                    }




                }


            }


        }


    }
}

