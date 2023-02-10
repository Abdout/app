package com.example.databayt.databayt

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
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
                modifier = Modifier.padding(top = 40.dp),
                text = stringResource(id = R.string.databayt),
                style = Heading,

                )

            Spacer(modifier = Modifier.width(70.dp))

            ClickableText(
                modifier = Modifier.padding(top = 45.dp),
                text = AnnotatedString(text = stringResource(id = R.string.login)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Login.route)
                })

            Spacer(modifier = Modifier.width(14.dp))

            Box(

                modifier = Modifier
                    .padding(top = 42.dp)
                    .height(27.dp)
                    .width(45.dp)
                    .background(OffWhite)
                    .border(
                        BorderStroke(width = 0.5.dp, color = Color.Black),
                        shape = RoundedCornerShape(2.dp),


                        )
            ) {

                ClickableText(
                    modifier = Modifier
                        .padding(horizontal = 6.dp)
                        .padding(top = 3.dp),
                    text = AnnotatedString(
                        text = stringResource(id = R.string.join)
                    ),
                    style = Body,
                    onClick = { navController.navigate(screen.Join.route) }

                )

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
                .fillMaxHeight(0.09f)
                .onFocusChanged { focus ->
                    focusState = focus.isFocused
                },

            value = textValue.value,
            onValueChange = { textValue.value = it },
            placeholder = {
                Text(
                    text = if (focusState) "" else
                        stringResource(id = R.string.search),
                    style = Body4
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
                focusedBorderColor = colorResource(id = R.color.offgrey),
                unfocusedBorderColor = colorResource(id = R.color.offgrey),
                unfocusedLabelColor = Color.Red,
                cursorColor = colorResource(id = R.color.offgrey),

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
                .padding(horizontal = 43.dp)
        )
        {


            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.blog)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Home.route)
                })

            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.tool)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Tool.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.club)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Club.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.inspire)),
                style = Body,
                onClick = {
                    navController.navigate(screen.Inspire.route)
                })
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Column(modifier = Modifier
            .fillMaxSize(0.8f)
            .verticalScroll(rememberScrollState())

        ) {
            Text(text = "داتابيت\n" + "مشروع تقني حول أتمتة الأعمال\n" +
                    "\n" + "دعوى المشروع جاية من الايمان باللامركزية و المصدر المفتوح وبالاقتصاد التشاركي وريادة الأعمال المجتمعية واثره على البلد\n" +
                    "\n" + "والايمان بالدور المهم للتقنية في اتصال الناس وتفاعله مع بعضها البعض\n" +
                    "\n" + "و مجتمع التقنين هم انفسهم من اكثر المجتمعات الملهمة للعمل الجماعي والتعاون، وهم كذلك الاكثر اتصالا وبالتالي الاسرع تطورا وربما تضم منصة (قيتهب) اكبر تجمع بشري على الاطلاق لناس من هَم اكاديمي واحد، لذلك اصبح للتقنية قوة خارقة ووتيرة نمو مخيفة\n" +
                    "\n" + "\n" +
                    "\n" + "ايضا يكاد لا توجد شركة فاحشة الثراء لا تستثمر  بالاساس في التقنية\n" +
                    "\n" + "و اقيم ما جاء في التقنية، الأتمتة بشكل عام\n" +
                    "لى ما لها من قدرة على الدفع بالانتاجية والجودة لمستويات عالية\n" +
                    "\n" + "وأتمتة الاعمال بالتحديد\n" + "لأهميته في تنسيق الجهود\n" +
                    "\n" + "لذلك داتابيت معنيه بتقديم ادوات تساعد على أتمتة الأعمال\n" +
                    "\n" + "هذه الادوات قد تكون ادوات عامة موجهة لمختلف الفرق على اختلاف مشروعاتهم او قد توجه لي فريق بعينه\n" + "\n" +
                    "ايضا هذه الادوات قد تكون ادوات متوافر عليها في السوق العالمي بشكل مجاني او مدفوع الثمن او قد تبني من الصفر حسب ما هو أجدى\n",
                textAlign = TextAlign.Right
            )


        }


        }
        

}

