package com.example.lenta.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lenta.R

@Composable
fun ListItem() {

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(237.dp)
                .padding(7.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()


            ) {
                Image(
                    painter = painterResource(id = R.drawable.sea_1),
                    contentDescription = "Sea_1 image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.75f),
                    contentScale = ContentScale.Crop,

                    )
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                )
                {
                    Text(
                        text = "I am strong.",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 21.sp

                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(237.dp)
                .padding(7.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()



            ) {
                Image(
                    painter = painterResource(id = R.drawable.sea_4),
                    contentDescription = "sea_4 image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.75f),
                    contentScale = ContentScale.Crop,

                    )
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                )
                {
                    Text(
                        text = "I believe in myself.",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 21.sp


                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(272.dp)
                .padding(7.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Image(
                    painter = painterResource(id = R.drawable.sea_3),
                    contentDescription = "Sea_3 image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(177.75.dp),
                    contentScale = ContentScale.Crop,

                    )
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                )
                {
                    Text(
                        text = "Each day is a new opportunity to grow and be a better version of",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 21.sp

                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(237.dp)
                .padding(7.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()



            ) {
                Image(
                    painter = painterResource(id = R.drawable.sea_2),
                    contentDescription = "Sea_2 image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.75f),
                    contentScale = ContentScale.Crop,

                    )
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                )
                {
                    Text(
                        text = "I am strong.",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        fontSize = 21.sp

                    )
                }
            }
        }
    }
}