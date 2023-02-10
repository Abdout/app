package com.example.databayt.ui.theme

import android.provider.ContactsContract.Profile
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.databayt.R

val inter = FontFamily(
    Font(R.font.inter)
)

val semi = FontFamily(
    Font(R.font.semi)
)

val Heading = TextStyle(
    fontFamily = inter,
    fontSize = 24.sp,
    letterSpacing = 4.sp
)

val Body = TextStyle(
    fontFamily = inter,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    color = Color.Black
)

val Body2 = TextStyle(
    fontFamily = inter,
    fontSize = 16.sp,
    letterSpacing = 1.sp,
    color = OffBlue
)

val Body3 = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.Bold,
    fontSize = 22.sp,
    letterSpacing = 1.sp,
)

val Body4 = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.Light,
    fontSize = 16.sp,
    color = Color.DarkGray,
    letterSpacing = 1.5.sp,
    )

val Body5 = TextStyle(
    fontFamily = inter,
    fontSize = 17.sp,
    letterSpacing = 1.sp,

)
val Tool = TextStyle(
    fontFamily = inter,
    fontSize = 18.sp,
    letterSpacing = 2.sp,
    fontWeight = FontWeight.Medium
)

val Profilehead = TextStyle(
    fontFamily = inter,
    fontSize = 26.sp,
    letterSpacing = 1.sp,
    fontWeight = FontWeight.SemiBold
)

val Profilebody = TextStyle(
    fontFamily = inter,
    fontSize = 18.sp,
    letterSpacing = 1.sp,
    fontWeight = FontWeight.Normal
)

val Realbody = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.Light,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
)

val Realbody2 = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.Light,
    fontSize = 18.sp,
    letterSpacing = 0.4.sp,
)

val Realbody3 = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.ExtraLight,
    color = Color.Black,
    fontSize = 15.sp,
    letterSpacing = 0.4.sp,
)

val Realbody4 = TextStyle(
    fontFamily = inter,
    fontWeight = FontWeight.ExtraLight,
    color = Color.DarkGray,
    fontSize = 15.sp,
    letterSpacing = 0.4.sp,

    )


// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)