package com.example.databayt.databayt.flow

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.databayt.R
import com.example.databayt.databayt.navigation.screen
import com.example.databayt.ui.theme.*

@Composable
fun Update (navController: NavController) {

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
                    .size(22.dp)
                    .padding(top = 5.dp)
                    .clickable { navController.navigate(screen.Fix.route) },
                painter = painterResource(id = R.drawable.back),
                contentDescription = null // decorative element,
            )

            Spacer(modifier = Modifier.width(118.dp))

            Text(

                text = stringResource(id = R.string.flowupdate),
                style = Head2,
            )

        }

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
            text = "Update", style = RealDetial)

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp))
        {

            Image(
                modifier = Modifier.scale(0.8f),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "null")

            Spacer(modifier = Modifier.width(5.dp))

            Column() {

                Spacer(modifier = Modifier.padding(top = 20.dp))

                Text(
                    text = stringResource(id = R.string.profilename),
                    style = Head
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Row() {
                    Text(text = "2d", style = Head)

                    Spacer(modifier = Modifier.width(7.dp))

                    Canvas(
                        modifier = Modifier
                            .padding(top = 13.dp)
                    )
                    {
                        drawCircle(
                            color = Color.Black,
                            radius = 6f
                        )

                    }

                    Spacer(modifier = Modifier.width(7.dp))
                    
                    Icon(
                        modifier = Modifier
                            .scale(0.85f)
                            .padding(top = 4.dp),
                        painter = painterResource(id = R.drawable.gear),
                        contentDescription = "Null" )

                }
            }

            Spacer(modifier = Modifier.width(60.dp))

            Icon(
                modifier = Modifier
                    .scale(0.4f)
                    .padding(top = 20.dp),
                painter = painterResource(id = R.drawable.more2),
                contentDescription = "Null" )


        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp),
            text = "Hello world!", style = Head2)

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Divider(
            modifier = Modifier.fillMaxWidth(0.8f),
            color = Color.Black, thickness = 0.2.dp
        )

        Spacer(modifier = Modifier.padding(top = 15.dp))

        Row() {

            Icon(
                painter = painterResource(id = R.drawable.flowupdate),
                contentDescription = "null",
            )

            Spacer(modifier = Modifier.width(7.dp))

            Text(text = "Comment", style = Head2)

            Spacer(modifier = Modifier.width(75.dp))

            Icon(
                painter = painterResource(id = R.drawable.share2),
                contentDescription = "null",
            )

            Spacer(modifier = Modifier.width(7.dp))

            Text(text = "Share", style = Head2)




        }

        Spacer(modifier = Modifier.padding(top = 175.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(110.dp),
            border = BorderStroke(
                color = Color.Black,
                width = 0.7.dp),
            backgroundColor = OffWhite,
            elevation = 0.dp,
            shape = RoundedCornerShape(4.dp)
        ) {

            Column() {

                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(15.dp)
                        .padding(horizontal = 0.dp))

                {
                    Text(

                        text = "Write your update ....",
                        style = Field
                    )

                }

                Divider(
                    modifier = Modifier
                        .fillMaxWidth(1f),
                    color = Color.Black, thickness = 0.7.dp
                )



                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(12.dp)
                        .padding(horizontal = 10.dp))
                {

                    Icon(
                        painter = painterResource(id = R.drawable.flowphoto),
                        contentDescription = "null")


                    Spacer(modifier = Modifier.width(27.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.flowtag),
                        contentDescription = "null")

                    Spacer(modifier = Modifier.width(27.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.flowfile),
                        contentDescription = "null")

                    Spacer(modifier = Modifier.width(27.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.flowcamera),
                        contentDescription = "null")

                    Spacer(modifier = Modifier.width(27.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.flowvoice),
                        contentDescription = "null")

                    Spacer(modifier = Modifier.width(27.dp))


                    Icon(
                        painter = painterResource(id = R.drawable.flowsend),
                        contentDescription = "null")






                }


            }



        }




    }
}
