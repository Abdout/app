package com.example.databayt.databayt.flow

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
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
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Task (navController: NavController) {

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
                text = "TASK",
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


        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 35.dp)
            .horizontalScroll(rememberScrollState()))
        {

            Column() {
                Text(text = "Task", style = RealDetial)

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(text = "Task 1", style = Head2)

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(text = "Task 2", style = Head2)

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(text = "Task 3", style = Head2)

            }

            Spacer(modifier = Modifier.width(30.dp))

            Column() {
                Text(text = "Update", style = RealDetial)

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Icon(
                    painter = painterResource(id = R.drawable.flowupdate),
                    contentDescription = "null",
                tint = Color.Gray
                )

                Spacer(modifier = Modifier.padding(top = 2.dp))

                Icon(
                    painter = painterResource(id = R.drawable.flowupdate),
                    contentDescription = "null",
                    tint = Color.Gray)


                Spacer(modifier = Modifier.padding(top = 2.dp))

                Image(
                    painter = painterResource(id = R.drawable.flowupdated),
                    contentDescription = "null")


            }

            Spacer(modifier = Modifier.width(30.dp))

            Column() {
                Text(text = "Owner", style = RealDetial)

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(text = "Osman", style = Head2)

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(text = "Ahmed", style = Head2)

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(text = "Mohamed", style = Head2)

            }

            Spacer(modifier = Modifier.width(30.dp))

            Column()
            {
                Text(
                    text = stringResource(id = R.string.flowPriority),
                    style = RealDetial,
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

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



                Spacer(modifier = Modifier.padding(top = 4.dp))

                Row()
                {
                    Box(
                        modifier = Modifier
                            .padding(top = 3.8.dp)
                            .height(15.dp)
                            .width(15.dp)
                            .background(
                                color = OffYellow,
                                shape = CircleShape
                            )
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(

                        text = stringResource(id = R.string.flowMedium),
                        style = Head2,
                    )

                }

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Row()
                {
                    Box(
                        modifier = Modifier
                            .padding(top = 3.8.dp)
                            .height(15.dp)
                            .width(15.dp)
                            .background(
                                color = Purple700,
                                shape = CircleShape
                            )
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(

                        text = stringResource(id = R.string.flowLow),
                        style = Head2,
                    )

                }

            }

            Spacer(modifier = Modifier.width(30.dp))

            Column()
            {
                Text(
                    text = stringResource(id = R.string.flowStatus),
                    style = RealDetial,
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = stringResource(id = R.string.flowStuck),
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = stringResource(id = R.string.flowInprogress),
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = stringResource(id = R.string.flowDone),
                    style = Head2,
                )

            }

            Spacer(modifier = Modifier.width(30.dp))

            Column()
            {
                Text(
                    text = "Date",
                    style = RealDetial,
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = "Jul 4",
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = "Nov 15",
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = "Sep 2",
                    style = Head2,
                )

            }

            Spacer(modifier = Modifier.width(30.dp))

            Column()
            {
                Text(
                    text = "Time Est.",
                    style = RealDetial,
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = "2h",
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = "5h",
                    style = Head2,
                )

                Spacer(modifier = Modifier.padding(top = 4.dp))

                Text(
                    text = "7h",
                    style = Head2,
                )

            }
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

                Icon(
                    painter = painterResource(id = R.drawable.flowupdate),
                    contentDescription = "null",
                    tint = Color.Gray
                )

            }

            Spacer(modifier = Modifier.padding(top = 5.dp))

            Row() {

                Text(text = "Owner", style = Head2)

                Spacer(modifier = Modifier.width(78.dp))

                Text(text = "Osman", style = Head2)

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




    }
}
