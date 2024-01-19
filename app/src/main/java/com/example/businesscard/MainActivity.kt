package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =  Color(0xFFDAEEE3)
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen( modifier: Modifier = Modifier,
                        backgroundColor: Color =Color(0xFF26362D)) {
  //  val backgroundColor:Color =  Color(0xFF26362D)
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),) {
        Column(
            modifier = Modifier

                .align(Alignment.Center)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .clip(CircleShape)
                    //.rotate(90f)
                    .size(80.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = stringResource(id = R.string.fullname),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = modifier,
            )
            Text(
                text = stringResource(id = R.string.title),
                modifier = modifier,
                color = Color(0xFFFFC107)
            )
        }

        Column(
            modifier = Modifier
                 .padding(bottom = 30.dp)
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
             Row (

             ){
                /* Image(
                     painter = painterResource(id = R.drawable.profile_picture),
                     contentDescription = "Profile Picture",
                     modifier = Modifier
                         .clip(CircleShape)
                         .rotate(270f)
                         .size(80.dp),
                     contentScale = ContentScale.FillBounds
                 )*/
                 Image(
                     painter = painterResource(id = R.drawable.contact),
                     contentDescription =null,
                     modifier = Modifier.
                     size(20.dp )



                 )
                 Spacer(modifier = Modifier.width(20.dp))
                 Text(
                     text = stringResource(id = R.string.contact),
                     modifier = modifier
                 )
             }
            Row {

                Image(
                    painter = painterResource(id = R.drawable.x_logo),
                    contentDescription =null,
                    modifier = Modifier.
                    size(20.dp )

                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = stringResource(id = R.string.social_media_handle),
                    modifier = modifier
                )
            }
            Row {

                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription =null,
                    modifier = Modifier.
                    size(20.dp )

                )
                //Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = stringResource(id = R.string.email),
                    modifier = modifier
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardTheme() {

        BusinessCardScreen(  )
    }
}