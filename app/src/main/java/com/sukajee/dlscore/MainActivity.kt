package com.sukajee.dlscore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sukajee.dlscore.ui.DLSViewModel
import com.sukajee.dlscore.ui.MainPage
import com.sukajee.dlscore.ui.theme.DlscoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DlscoreTheme {
                // A surface container using the 'background' color from the theme
                val viewModel: DLSViewModel by viewModels()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPage(viewModel)
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun AppPreview() {
//    MainPage()
//}
