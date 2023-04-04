package com.example.databayt.databayt.nmbd

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun NMBD (navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = OffWhite)
            .verticalScroll(rememberScrollState())

    )
    {


        Image(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 30.dp)
                .size(180.dp),

            painter = painterResource(id = R.drawable.nm),
            contentDescription = null // decorative element
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 40.dp),

            text = stringResource(id = R.string.nmbd),
            style = Head)

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            modifier = Modifier
                .padding(horizontal = 40.dp),

            text = stringResource(id = R.string.politicalparty),
            style = Profilebody,

            )




        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .size(size = 55.dp)
                .horizontalScroll(rememberScrollState()))
        {

            Icon(
                modifier = Modifier
                    .scale(1f)
                    .padding(top = 1.dp),


                painter = painterResource(id = R.drawable.call),
                contentDescription = null // decorative element,


            )

            Spacer(modifier = Modifier.width(10.dp))

            Icon(
                modifier = Modifier
                    .scale(1.28f),

                painter = painterResource(id = R.drawable.pin),
                contentDescription = null // decorative element,


            )

            Spacer(modifier = Modifier.width(20.dp))


            Icon(

                painter = painterResource(id = R.drawable.whatsapp),
                contentDescription = null // decorative element,


            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.messenger),
                contentDescription = null // decorative element,


            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.telegram),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(

                painter = painterResource(id = R.drawable.facebook),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                modifier = Modifier
                    .scale(1.1f),
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                modifier = Modifier
                    .scale(1.1f),
                painter = painterResource(id = R.drawable.youtube),
                contentDescription = null // decorative element
            )

            Spacer(modifier = Modifier.width(20.dp))


            Icon(
                modifier = Modifier
                    .scale(0.8f),
                painter = painterResource(id = R.drawable.tiktok),
                contentDescription = null // decorative element
            )
        }

        Spacer(modifier = Modifier.padding(top = 40.dp))



        Row(


            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 43.dp)
        )
        {
            Column() {

                ClickableText(

                    text = AnnotatedString(text = stringResource(id = R.string.paradigm)),
                    style = Heada,
                    onClick = {
                        navController.navigate(screen.Home.route)
                    })

                Spacer(modifier = Modifier.padding(top = 2.5.dp))

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(0.225f)
                        .padding(horizontal = 1.dp),
                    color = Color.Black, thickness = 1.5.dp,

                    )


            }






            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.archive)),
                style = Headb,
                onClick = {
                    navController.navigate(screen.Club.route)
                })

            Spacer(modifier = Modifier.width(25.dp))

            ClickableText(

                text = AnnotatedString(text = stringResource(id = R.string.member)),
                style = Headb,

                onClick = {
                    navController.navigate(screen.Member.route)
                })
        }


        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            modifier = Modifier
                .padding(end = 20.dp)
                .padding(horizontal = 30.dp),

            text = "بسم الله الرحمن الرحيم \n" +
                    "الحركة الوطنية للبناء والتنمية\n\n" +

                    "هي حركة إصلاح اجتماعي وسياسي شامل، تقيم رؤاها وتستقي قيمها من هدي الدين وكريم شيم السودانيين، وتوظف الشأن الفكري والثقافي والفني والسياسي؛ من أجل إنجاز نهضة شاملة على أرض الوطن السودان.\n" +
                    "تقوم الحركة الوطنية للبناء والتنمية على إرث المسلمين في السودان خاصة، وإرث شعب السودان عامة، وتجربة الأمة المسلمة والأحرار في العالم، في السعي نحو الحرية والكرامة والنهضة الاجتماعية والمادية، والتحرر من قوى الهيمنة والاستغلال.\n" +
                    "تفهم الحركة السياسة والعمل الاجتماعي باعتباره بناء لمسارات الإصلاح والعمران لا مجال للنفعيات والذاتيات والكسب بالباطل، ولا تستثنى الحركة أح ًدا من عامة السودانيين الصالحين في أن تتقدم لهم بدعوتها، وهي كذلك تحرص على أن ينتمي لقياداتها وصفها من\n" +
                    "عرف عنه نظافة اليد، وصلاح المسعى، ومن يتقي معوج المسلك وفاسد العمل\n",
            textAlign = TextAlign.Right,
            style = Arabicbody
        )
        Spacer(modifier = Modifier.padding(top = 40.dp))

        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(0.8f)
                .height(70.dp)
                .background(
                    color = OffYellow,
                    shape = RoundedCornerShape(4.dp)
                )
        )

        {

            ClickableText(
                modifier = Modifier
                    .align(Alignment.Center),
                text = AnnotatedString(
                    text = stringResource(id = R.string.join),
                ),
                style = RealDetial,
                onClick = { navController.navigate(screen.Sign.route) }
            )
        }

        Spacer(modifier = Modifier.padding(top = 40.dp))
    }
}