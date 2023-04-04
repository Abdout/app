package com.example.databayt.databayt.seek.job

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Job (navController: NavController) {

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
                text = "JOB",
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
        
        Row() {
            
            Image(painter = painterResource(id = R.drawable.sudan),
                contentDescription = "null")

            Spacer(modifier = Modifier.width(10.dp))

            Image(painter = painterResource(id = R.drawable.saudi),
                contentDescription = "null")

            Spacer(modifier = Modifier.width(10.dp))

            Image(painter = painterResource(id = R.drawable.uae),
                contentDescription = "null")

            Spacer(modifier = Modifier.width(10.dp))

            Image(painter = painterResource(id = R.drawable.qatar),
                contentDescription = "null")

            Spacer(modifier = Modifier.width(10.dp))
            
        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            modifier = Modifier
                .padding(end = 20.dp)
                .padding(horizontal = 30.dp),

            text = "المقصد\n" +
                    "\n" +
                    "ملئ طلب التقديم لوضيفة بشكل آلي بدل البروسيس المزعجة بتاعت ملئ نفس البيانات كل مرة",
            textAlign = TextAlign.Right,
            style = Arabicbody
        )
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            text = "Keyword\n\nEasy apply\nLazy apply\n" +
                "auto fill\n" +
                "Extract information from picture\n" +
                "Shortcut keys\n" +
                "contribute job form or email ", style = Body)

    }
}
