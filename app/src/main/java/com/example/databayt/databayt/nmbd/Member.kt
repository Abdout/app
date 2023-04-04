package com.example.databayt.databayt.nmbd

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import java.lang.reflect.Member

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Member (navController: NavController) {

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

            Spacer(modifier = Modifier.width(110.dp))

            Text(
                text = stringResource(id = R.string.memberhead),
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

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            text = "Secretariat" , style = Head)

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 42.dp)
                .horizontalScroll(
                    rememberScrollState())
        ) {


            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clickable { navController.navigate(screen.Porfile.route) },
                shape = RoundedCornerShape(4.dp),
                backgroundColor = OffWhite,
                elevation = 4.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            ) {

                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .padding(top = 10.dp)
                        .scale(0.8f),
                    text = "Member", style = Head3
                )

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clickable { navController.navigate(screen.Porfile.route) },
                shape = RoundedCornerShape(4.dp),
                backgroundColor = OffWhite,
                elevation = 4.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            ) {

                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .padding(top = 10.dp)
                        .scale(0.8f),
                    text = "Politics", style = Head3
                )

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clickable { navController.navigate(screen.Porfile.route) },
                shape = RoundedCornerShape(4.dp),
                backgroundColor = OffWhite,
                elevation = 4.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            ) {

                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .padding(top = 10.dp)
                        .scale(0.8f),
                    text = "Law", style = Head3
                )

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clickable { navController.navigate(screen.Porfile.route) },
                shape = RoundedCornerShape(4.dp),
                backgroundColor = OffWhite,
                elevation = 4.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            ) {

                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .padding(top = 10.dp)
                        .scale(0.8f),
                    text = "Student", style = Head3
                )

            }

            Spacer(modifier = Modifier.width(10.dp))

            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clickable { navController.navigate(screen.Porfile.route) },
                shape = RoundedCornerShape(4.dp),
                backgroundColor = OffWhite,
                elevation = 4.dp,
                border = BorderStroke(width = 0.2.dp, color = Color.Gray)
            ) {

                Text(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .padding(top = 10.dp)
                        .scale(0.8f),
                    text = "Economic", style = Head3
                )

            }
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            text = "Member" , style = Head)

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(110.dp)
                .clickable { navController.navigate(screen.Porfile.route) },
            shape = RoundedCornerShape(7.dp),
            backgroundColor = OffWhite,
            elevation = 4.dp,
            border = BorderStroke(width = 0.2.dp, color = Color.Gray)
        ) {
            Row(

            ) {
                Image(
                    modifier = Modifier.scale(0.8f),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "null")

                Spacer(modifier = Modifier.width(5.dp))

                Column(
                    modifier = Modifier.padding(top = 10.dp),
                ) {

                    Text(
                        text = stringResource(id = R.string.profilename),
                        style = Head)

                    Text(
                        text = stringResource(id = R.string.rank),
                        style = Body)

                    Text(
                        text = stringResource(id = R.string.address),
                        style = Bodyb)

                    Text(text = "4 mutual connections")
                }
            }
        }
    }
}

