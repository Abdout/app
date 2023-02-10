package com.example.databayt.databayt.real

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Real (navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)


    ) {



        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(modifier = Modifier.padding(end = 15.dp)) {

            var textValue = remember {
                mutableStateOf("")
            }

            val colorPrimary = colorResource(id = R.color.offgrey)
            val colorSecondary = colorResource(id = R.color.black)
            val test = colorResource(id = R.color.offyellow)

            val keyboardController = LocalSoftwareKeyboardController.current


            OutlinedTextField(
                modifier = Modifier
                    .width(175.dp)
                    .height(50.dp),

                value = textValue.value,
                onValueChange = {textValue.value = it},

                trailingIcon = {Icon(
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 5.dp),


                    painter = painterResource(
                        id = R.drawable.search),
                    contentDescription = null // search icon
                )},


                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorSecondary,
                    focusedLabelColor = colorSecondary,
                    unfocusedBorderColor = colorPrimary,
                    unfocusedLabelColor = Color.Red,
                    cursorColor = colorSecondary,

                    trailingIconColor = colorSecondary,


                    ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(
                    onSearch = {
                        keyboardController?.hide()
                    }
                )
            )

            Spacer(
                modifier = Modifier
                    .width(10.dp))

            Row(modifier = Modifier.padding(top = 8.dp)) {

                Icon(
                    modifier = Modifier.size(33.dp),

                    painter = painterResource(id = R.drawable.pin),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(12.dp))

                Icon(
                    modifier = Modifier.size(33.dp),




                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription = null // decorative element
                )

                Spacer(modifier = Modifier.width(12.dp))

                Icon(
                    modifier = Modifier.size(33.dp),




                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = null // decorative element
                )


            }
        }

        Spacer(modifier = Modifier.padding(top = 25.dp))

        Row(modifier = Modifier
            .fillMaxWidth(0.8f)




        )
        {

            Icon(
                modifier = Modifier.size(61.dp),

                painter = painterResource(id = R.drawable.bed),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(30.dp))

            Icon(
                modifier = Modifier.size(57.dp),

                painter = painterResource(id = R.drawable.house),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(30.dp))

            Icon(

                modifier = Modifier.size(60.dp),

                painter = painterResource(id = R.drawable.apartment),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(30.dp))

            Icon(
                modifier = Modifier.size(57.dp),

                painter = painterResource(id = R.drawable.hotel),
                contentDescription = null // decorative element
            )
        }

        Spacer(modifier = Modifier.padding(top = 7.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
        )
        {
            Text(text = stringResource(id = R.string.room), style = Realbody)

            Spacer(modifier = Modifier.width(47.dp))

            Text(text = stringResource(id = R.string.home), style = Realbody)

            Spacer(modifier = Modifier.width(47.dp))

            Text(text = stringResource(id = R.string.aprt), style = Realbody)

            Spacer(modifier = Modifier.width(38.dp))

            Text(text = stringResource(id = R.string.hotel), style = Realbody)
        }
        Spacer(modifier = Modifier.padding(top = 0.dp))

        Image(
            modifier = Modifier
                .size(330.dp),

            painter = painterResource(id = R.drawable.randomroom),
            contentDescription = null // decorative element
        )
        
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)) {

            Text(
                text = stringResource(id = R.string.location),
                style = Realbody2,

                )
            Spacer(modifier = Modifier.width(100.dp))
            Icon(
                modifier = Modifier.size(25.dp),
                painter = painterResource(id = R.drawable.star),
                contentDescription = null )
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = stringResource(id = R.string.rate),
                style = Realbody2,)
            
        }

       

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),

            text = stringResource(id = R.string.hosted),
            style = Realbody4,

            )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),

            text = stringResource(id = R.string.date),
            style = Realbody4,

            )

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),

            text = stringResource(id = R.string.price),
            style = Realbody3,


            )




    }
}

