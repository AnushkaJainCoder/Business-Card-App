package com.example.businesscardapp
import android.media.Image
import androidx.compose.material.icons.filled.Phone
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Box(
                    modifier = Modifier.fillMaxSize().background(Color(0xFFE8F5E9))
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Body()
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Footer()
//                }
                    }

                }
            }
        }
    }
}

@Composable
fun Body(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.download)
    Column(
        modifier.fillMaxWidth().padding(top = 300.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier.height(120.dp).width(120.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF00796B)).padding(16.dp),
            Alignment.Center
        ) {
            Image(
                painter = image,
                contentDescription = "Android logo",
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = "Anushka Jain",
            fontSize = 40.sp,
            color = Color(0xFF212121),
            modifier = modifier.padding(top = 16.dp, bottom = 8.dp)
        )
        Text(
            text = "Android Dev Extraordinaire",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color(0xFF2E7D32) // Darker green
        )

    }
}

@Composable
fun Footer(modifier: Modifier = Modifier){
    Column(
        modifier.fillMaxSize().padding(16.dp, vertical = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        ContactDetails(Icons.Filled.Phone, "+91 12345623455")
        ContactDetails(Icons.Filled.Email, "ajain@gmail.com")
        ContactDetails(Icons.Filled.Person, "@socialmedia12")

    }
}

@Composable
fun ContactDetails(image: ImageVector, text: String,modifier: Modifier = Modifier){
    Row(
        modifier.fillMaxWidth().padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically


    ) {

            Icon(
                imageVector = image,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = modifier.width(24.dp).height(24.dp).padding(end = 8.dp)
            )
            Text(text)

    }
}