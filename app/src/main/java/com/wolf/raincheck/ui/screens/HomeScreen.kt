package com.wolf.raincheck.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wolf.raincheck.R
import com.wolf.raincheck.utils.CustomImage

@Preview
@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        HomeMain()
    }
}


@Composable
fun HomeMain() {
    val isLightTheme = MaterialTheme.colors.isLight
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .matchParentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CustomImage(
                        image =
                        if (isLightTheme) {
                            R.drawable.ic_world_map_light
                        } else {
                            R.drawable.ic_world_map_dark
                        },
                        contentScale = ContentScale.Fit,
                        contentDesc = "Background",
                        modifier = Modifier.offset(y = (-20).dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CustomImage(
                        image = R.drawable.ic_cloud_zappy,
                        contentScale = ContentScale.Fit,
                        contentDesc = "Weather img",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(top = 40.dp, bottom = 20.dp)
                    )
                    Row(modifier = Modifier.wrapContentSize()) {
                        Text(
                            text = "temprature",
                            style = MaterialTheme.typography.h1,
                            modifier = Modifier
                                .offset(y = (-24).dp)
                                .size(12.dp)
                        )
                        CustomImage(
                            image = R.drawable.ic_degree,
                            contentScale = ContentScale.Fit,
                            contentDesc = "Degree Icon",
                            modifier = Modifier
                        )
                    }
                    Spacer(modifier = Modifier.size(16.dp))
                }
            }
            WeatherList()
        }
    }
}



@Composable
fun WeatherList() {
    LazyColumn(
        content = {
            items(2) {
                WeatherItem()
            }
        }
    )
}


@Composable
fun WeatherItem() {
    Card(
        elevation = 10.dp,
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(10.dp)
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Location",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Date",
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Time",
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center
            )
            Text(
                text = "25",
                modifier = Modifier.size(40.dp).padding(10.dp),
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center
            )
//            CustomImage(
////                image = when () {
////                    "wind" -> R.drawable.ic_moon_cloud_fast_wind
////                    "rain" -> R.drawable.ic_moon_cloud_mid_rain
////                    "angledRain" -> R.drawable.ic_sun_cloud_angled_rain
////                    "thunder" -> R.drawable.ic_zaps
////                    else -> R.drawable.ic_moon_cloud_fast_wind
////                },
////                contentScale = ContentScale.Fit,
////                contentDesc = "Weather Icon",
////                modifier = Modifier
////                    .size(64.dp)
////                    .padding(bottom = 4.dp)
////            )
        }

    }
}
