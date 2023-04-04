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
fun Spareone (navController: NavController) {
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

            Spacer(modifier = Modifier.width(130.dp))

            Text(
                text = stringResource(id = R.string.sparehead),
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
                    navController.navigate(screen.Inspire.route)
                })
        }





        Spacer(modifier = Modifier.padding(top = 20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(140.dp)
                .clickable { navController.navigate(screen.Sparetwo.route) },
            shape = RoundedCornerShape(7.dp),
            backgroundColor = OffWhite,
            elevation = 4.dp
        )
        {
            Row(modifier = Modifier
                .padding(20.dp))
            {
                Column()
                {
                    Text(text = "MAF Sensor",
                    style = Head)

                    Spacer(modifier = Modifier.padding(top = 7.dp))

                    Text(text = "Part no. MA320",
                        style = Body)

                    Spacer(modifier = Modifier.padding(top = 22.dp))

                    Row() {

                        Text(text = "7000 SDG",
                            style = Body)

                        Spacer(modifier = Modifier.width(10.dp))

                        Icon(
                            modifier = Modifier.size(18.dp),
                            painter = painterResource(id = R.drawable.shop),
                            contentDescription = "null")

                    }
                }
                Spacer(modifier = Modifier.width(55.dp))

                Image(
                    modifier = Modifier
                        .size(110.dp),

                    painter = painterResource(id = R.drawable.maf),
                    contentDescription = "null",
                    //contentScale = ContentScale.Crop
            )
            }
        }





    }
}
