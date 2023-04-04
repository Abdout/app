package com.example.databayt.databayt.flow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Flow (navController: NavController) {
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
                    .size(15.dp),
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(130.dp))

            Text(
                text = stringResource(id = R.string.flow),
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
                .fillMaxWidth()
                .padding(
                    horizontal = 40.dp
                )
        ) {

            ClickableText(

                text = AnnotatedString(text = "Recent"),
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

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp))
        {

            Text(
                text = "Task 1",
                style = RealDetial
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row() {

                Text(text = "Update", style = Head2)

                Spacer(modifier = Modifier.width(70.dp))

                Image(
                    modifier = Modifier.clickable { navController.navigate(screen.Update.route) },
                    painter = painterResource(id = R.drawable.flowupdated),
                    contentDescription = "null",

                )

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Owner", style = Head2)

                Spacer(modifier = Modifier.width(78.dp))

                ClickableText(

                    text = AnnotatedString(text = "Osman"),
                    style = Head2,
                    onClick = {
                        navController.navigate(screen.Porfile.route)
                    })

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Priority", style = Head2)

                Spacer(modifier = Modifier.width(71.dp))

                Row()
                {
                    Box(
                        modifier = Modifier
                            .padding(top = 3.8.dp)
                            .height(15.dp)
                            .width(15.dp)
                            .background(
                                color = Color.Red,
                                shape = CircleShape
                            )
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(

                        text = stringResource(id = R.string.flowHigh),
                        style = Head2,
                    )

                }

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Status", style = Head2)

                Spacer(modifier = Modifier.width(80.dp))

                Text(text = "Stuck", style = Head2)

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Date", style = Head2)

                Spacer(modifier = Modifier.width(95.dp))

                Text(text = "Jul 4", style = Head2)

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Time Est.", style = Head2)

                Spacer(modifier = Modifier.width(53.dp))

                Text(text = "2h", style = Head2)

            }

        }



        Spacer(modifier = Modifier.padding(top = 70.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 300.dp))
        {
            Image(

                painter = painterResource(id = R.drawable.plus),
                contentDescription = "null" )


        }

        Spacer(modifier = Modifier.padding(top = 30.dp))





        Row(modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(bottom = 0.dp)


        )
        {

            Icon(
                modifier = Modifier.size(40.dp),

                painter = painterResource(id = R.drawable.house),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(50.dp))

            Icon(
                modifier = Modifier
                    .size(45.dp)
                    .clickable { navController.navigate(screen.Task.route) },
                painter = painterResource(id = R.drawable.work),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(48.dp))

            Icon(

                modifier = Modifier.size(45.dp),

                painter = painterResource(id = R.drawable.notification),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(48.dp))

            Icon(
                modifier = Modifier.size(42.dp),

                painter = painterResource(id = R.drawable.more),
                contentDescription = null // decorative element
            )
        }

        Spacer(modifier = Modifier.padding(top = 4.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
        )
        {
            Text(text ="Home", style = Realbody)

            Spacer(modifier = Modifier.width(50.dp))

            Text(text = "Work", style = Realbody)

            Spacer(modifier = Modifier.width(55.dp))

            Text(text = "Notif.", style = Realbody)

            Spacer(modifier = Modifier.width(50.dp))

            Text(text = "More", style = Realbody)
        }


    }
}