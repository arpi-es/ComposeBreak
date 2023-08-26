package com.example.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.countdown.component.Counter
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme

@Composable
fun CountdownRoute(
    viewModel: CountdownViewModel,
) {
    CountdownScreen("" , "")
}


@Composable
fun CountdownScreen(
    minutes : String,
    seconds: String,
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Counter(minutes = minutes, seconds = seconds)
    }
}

@ThemePreviews
@Composable
private fun CountdownScreenPreview() {

    ComposeBreakTheme {
        Surface {
            CountdownScreen(minutes = "32", seconds = "54")
        }

    }
}