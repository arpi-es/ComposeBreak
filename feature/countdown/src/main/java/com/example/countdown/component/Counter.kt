package com.example.countdown.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme

@Composable
fun Counter(
    minutes: String,
    seconds: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        CounterText(text = minutes)
        Text(text = " : ")
        CounterText(text = seconds)
    }

}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ThemePreviews
@Composable
private fun CounterPreview() {

    ComposeBreakTheme {
        Surface {
            Counter(minutes = "32", seconds = "54")
        }

    }

}