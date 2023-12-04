package com.ist.loginscreen.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ist.loginscreen.components.HeadingTextComponent
import com.ist.loginscreen.components.SimpleTextComponent
import com.ist.loginscreen.components.UserFieldComponent

@Composable
@Preview
fun SignupScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()){
            SimpleTextComponent(value = "Hello")
            HeadingTextComponent(value = "Welcome back")
            UserFieldComponent(labelValue ="Firstname", label="firstName")
            UserFieldComponent(labelValue ="Lastname", label="lastName")
            UserFieldComponent(labelValue ="Email", label="Email")
        }
    }
}