package com.example.farnama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.example.farnama.ui.auth.LoginScreen
import com.example.farnama.ui.theme.FarnamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FarnamaTheme {
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    var loggedIn by remember { mutableStateOf(false) }
                    if (loggedIn) {
                        Text("ورود موفق بود") // فعلاً موقت
                    } else {
                        LoginScreen(onLoginSuccess = { loggedIn = true })
                    }
                }
            }
        }
    }
}