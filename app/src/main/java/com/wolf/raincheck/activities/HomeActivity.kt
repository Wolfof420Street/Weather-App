package com.wolf.raincheck.activities


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import com.wolf.raincheck.ui.screens.HomeScreen
import com.wolf.raincheck.ui.theme.RainCheckTheme


class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RainCheckTheme() {
               Scaffold {
                    HomeScreen()
               }
            }
        }
    }
}