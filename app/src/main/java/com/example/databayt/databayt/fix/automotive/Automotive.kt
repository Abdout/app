package com.example.databayt.databayt.fix.automotive

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
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
fun Automotive (navController: NavController) {
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

            Spacer(modifier = Modifier.width(105.dp))

            Text(
                text = stringResource(id = R.string.automotivehead),
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
                Row() {
                    Icon(
                        modifier = Modifier
                            .size(28.dp)
                            .padding(top = 5.dp),
                        painter = painterResource(
                            id = R.drawable.filter
                        ),
                        contentDescription = null // search icon
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        modifier = Modifier
                            .size(35.dp)
                            .padding(end = 10.dp),

                        painter = painterResource(
                            id = R.drawable.search),
                        contentDescription = null // search icon
                    )

                }

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

                    text = AnnotatedString(text = stringResource(id = R.string.manual)),
                    style = Heada,
                    onClick = {
                        navController.navigate(screen.Home.route)
                    })

                Spacer(modifier = Modifier.padding(top = 2.5.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.174f)
                        .padding(horizontal = 1.dp),
                    color = Color.Black, thickness = 1.5.dp,

                    )
            }

            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.community)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Club.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.spare)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Spare.route)
                })
        }





        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 42.dp)
                .horizontalScroll(rememberScrollState())

        ) {

            Card(
                modifier = Modifier
                    .width(70.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = OffWhite,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            )
            {
                Icon(
                    modifier = Modifier
                        .padding(7.dp),
                    painter = painterResource(
                        id = R.drawable.hyundai
                    ),
                    contentDescription = null, // search icon
                    tint = OffYellow
                )

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(
                modifier = Modifier
                    .width(70.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = OffWhite,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            )
            {
                Icon(
                    modifier = Modifier
                        .padding(7.dp),
                    painter = painterResource(
                        id = R.drawable.kia
                    ),
                    contentDescription = null, // search icon

                )

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(
                modifier = Modifier
                    .width(70.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = OffWhite,
                elevation = 2.dp,
               border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            )
            {
                Icon(
                    modifier = Modifier
                        .padding(8.dp),
                    painter = painterResource(
                        id = R.drawable.toyota
                    ),
                    contentDescription = null, // search icon

                )

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(
                modifier = Modifier
                    .width(70.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = OffWhite,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            )
            {
                Icon(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(0.dp),
                    painter = painterResource(
                        id = R.drawable.chevrolet
                    ),
                    contentDescription = null, // search icon

                )

            }

            Spacer(modifier = Modifier.width(20.dp))



        }



        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 42.dp)
                .horizontalScroll(rememberScrollState())
        )
        {
            Card(modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(110.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = OffYellow,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray))
            {
                Column() {
                    Box(modifier = Modifier.background(OffWhite)){
                        Image(
                            painter = painterResource(id = R.drawable.accent),
                            contentDescription = "null",
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = stringResource(id = R.string.accent),
                    style = Auto)

                }

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(110.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = Color.LightGray,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray))
            {
                Column() {
                    Box(modifier = Modifier.background(OffWhite)){
                        Image(
                            painter = painterResource(id = R.drawable.tucson),
                            contentDescription = "null",
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = stringResource(id = R.string.tucson),
                        style = Auto)

                }

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(110.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = Color.LightGray,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray))
            {
                Column() {
                    Box(modifier = Modifier.background(OffWhite)){
                        Image(
                            painter = painterResource(id = R.drawable.santafe),
                            contentDescription = "null",
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = stringResource(id = R.string.santafe),
                        style = Auto)

                }

            }

            Spacer(modifier = Modifier.width(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth(0.3f)
                .height(110.dp),
                shape = RoundedCornerShape(7.dp),
                backgroundColor = Color.LightGray,
                elevation = 2.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray))
            {
                Column() {
                    Box(modifier = Modifier.background(OffWhite)){
                        Image(
                            painter = painterResource(id = R.drawable.creta),
                            contentDescription = "null",
                            contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.padding(top = 6.dp))

                    Text(
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        text = stringResource(id = R.string.creta),
                        style = Auto)

                }

            }


        }


        Spacer(modifier = Modifier.padding(top = 40.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 40.dp
                )
        ) {

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.all)),
                style = Head,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })

            Spacer(modifier = Modifier.width(0.dp))


            Icon(
                modifier = Modifier
                    .size(23.dp)
                    .padding(top = 5.dp),
                painter = painterResource(id = R.drawable.down),
                contentDescription = null // decorative element,
            )


        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ) {

            Icon(
                modifier = Modifier
                    .size(25.dp),
                painter = painterResource(id = R.drawable.pdf),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(10.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.startingguide)),
                style = Head,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ) {

            Icon(
                modifier = Modifier
                    .size(25.dp),
                painter = painterResource(id = R.drawable.pdf),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(10.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.installationmanual)),
                style = Head,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ) {

            Icon(
                modifier = Modifier
                    .size(25.dp),
                painter = painterResource(id = R.drawable.pdf),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(10.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.instructionmanual)),
                style = Head,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ) {

            Icon(
                modifier = Modifier
                    .size(25.dp),
                painter = painterResource(id = R.drawable.pdf),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(10.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.servicemanual)),
                style = Head,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })
        }

    }
}
