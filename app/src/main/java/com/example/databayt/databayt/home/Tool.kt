package com.example.databayt.databayt.home

import android.graphics.Paint.Style
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
fun Tool (navController: NavController) {
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

            Column() {

                ClickableText(

                    text = AnnotatedString(text = stringResource(id = R.string.tool)),
                    style = Heada,
                    onClick = {
                        navController.navigate(screen.Tool.route)
                    })


                Spacer(modifier = Modifier.padding(top = 2.5.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.13f)
                        .padding(horizontal = 3.dp),
                    color = Color.Black, thickness = 1.5.dp,

                    )

            }


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

        Spacer(modifier = Modifier.padding(top = 25.dp))



        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 42.dp)
        ) {

            Text(
                text = stringResource(id = R.string.abouttool),
                fontSize = 20.sp,
                style = Head
            )


            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 17.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.map)
                        ),
                        style = Tool,
                        onClick = { navController.navigate(screen.Map.route) }
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    modifier = Modifier.padding(top = 2.2.dp),
                    text = stringResource(id = R.string.maphead),
                    style = Head
                )


            }
            Spacer(modifier = Modifier.padding(top = 12.dp))

            Text(
                text = stringResource(id = R.string.mapbody),
                style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(
                            color = OffYellow,
                            shape = RoundedCornerShape(4.dp)
                        )
                )

                {

                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 13.dp)
                            .padding(top = 13.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.flow),
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Flow.route) }
                    )

                }

                Spacer(modifier = Modifier.width(20.dp))

                Column() {
                    Text(
                        text = stringResource(id = R.string.flowhead),
                        style = Head
                    )

                }


            }

            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.flowbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 22.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.fix)
                        ),
                        style = Tool,
                        onClick = { navController.navigate(screen.Fix.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.fixhead),
                    style = Head
                )


            }
            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.fixbody),
                style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))


            Row(

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
                            .padding(horizontal = 19.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.zap)
                        ),
                        style = Tool,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.zaphead),
                    style = Head
                )


            }
            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.zapbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.seek)
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.seekhead),
                    style = Head
                )

            }


            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.seekbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))



            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.sign)
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.signhead),
                    style = Head
                )

            }


            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.singbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.deal)
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.dealhead),
                    style = Head
                )

            }


            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.dealbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 14.2.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.vote)
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Seek.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.votehead),
                    style = Head
                )

            }


            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.votebody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Divider(
                modifier = Modifier.fillMaxWidth(1f),
                color = Color.Black, thickness = 0.6.dp
            )

            Spacer(modifier = Modifier.padding(top = 25.dp))

            Row()
            {

                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .background(color = OffYellow, shape = RoundedCornerShape(4.dp))
                )

                {
                    ClickableText(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .padding(top = 12.dp),
                        text = AnnotatedString(
                            text = stringResource(id = R.string.real)
                        ),
                        style = Tool2,
                        onClick = { navController.navigate(screen.Real.route) }
                    )


                }

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = stringResource(id = R.string.realhead),
                    style = Head
                )

            }


            Spacer(modifier = Modifier.padding(top = 17.dp))

            Text(

                text = stringResource(id = R.string.realbody), style = Body4
            )

            Spacer(modifier = Modifier.padding(top = 40.dp))

        }
    }
}





