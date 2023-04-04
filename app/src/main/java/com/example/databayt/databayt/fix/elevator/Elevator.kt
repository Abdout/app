package com.example.databayt.databayt.fix.elevator

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
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
fun Elevator (navController: NavController) {
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
                    .size(15.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Fix.route) },
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(110.dp))

            Text(
                text = stringResource(id = R.string.elevatorhead),
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

        Row(
            modifier = Modifier
                .padding(horizontal = 42.dp)
                .horizontalScroll(rememberScrollState())

        ) {
            Icon(
                modifier = Modifier
                    .size(36.dp)
                    .padding(top = 12.dp),


                painter = painterResource(
                    id = R.drawable.fuji
                ),
                contentDescription = null, // search icon
                tint = OffYellow
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                modifier = Modifier
                    .size(36.dp)
                    .padding(top = 10.dp),

                painter = painterResource(
                    id = R.drawable.mitsubishi
                ),
                contentDescription = null // search icon
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                modifier = Modifier
                    .padding(top = 10.dp),

                painter = painterResource(
                    id = R.drawable.otis
                ),
                contentDescription = null // search icon
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                modifier = Modifier
                    .padding(top = 7.dp),
                text = stringResource(id = R.string.kohler),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                modifier = Modifier
                    .padding(top = 8.dp),
                text = stringResource(id = R.string.fermator),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp,
                letterSpacing = 1.sp
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                modifier = Modifier
                    .size(53.dp),


                painter = painterResource(
                    id = R.drawable.tenau
                ),
                contentDescription = null // search icon
            )

        }



        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .horizontalScroll(rememberScrollState())

        ) {
            Column() {
                Image(
                    modifier = Modifier
                        .size(150.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.lm2a),
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
                        .size(150.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.lm2a),
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
                        .size(150.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.lm2a),
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
                        .size(150.dp)
                        .padding(top = 5.dp),


                    painter = painterResource(id = R.drawable.lm2a),
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

        Spacer(modifier = Modifier.padding(top = 20.dp))

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


