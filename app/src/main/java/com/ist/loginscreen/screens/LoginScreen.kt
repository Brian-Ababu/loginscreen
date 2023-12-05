package com.ist.loginscreen.screens

//import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.R
import com.ist.loginscreen.components.DefaultButtonComponent
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.PasswordTextFieldComponent
import com.ist.loginscreen.components.SimpleTextComponent
import com.ist.loginscreen.components.UserFieldComponent
import com.ist.loginscreen.components.myImage

@Composable
@Preview
fun LoginScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            myImage(image = R.drawable.headingimage)
            HeadingTextComponent(value = "Hi, Welcome Back!" )
            SimpleTextComponent(value = "Hello again you've been missed!")
            UserFieldComponent(labelValue ="myname@uxclass.live", label="Email")
            PasswordTextFieldComponent(labelValue ="Please Enter Your Password", label = "Password", icon= Icons.Default.Lock)
            DefaultButtonComponent(value = "LogIn")
        }
    }
}