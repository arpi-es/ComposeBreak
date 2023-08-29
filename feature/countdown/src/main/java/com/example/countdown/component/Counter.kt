package com.example.countdown.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import com.example.countdown.CountdownState
import com.example.countdown.CounterState
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme
import com.example.ext_functions.minutes
import com.example.ext_functions.seconds

@Composable
fun Counter(
    countdownState: CountdownState
) {

    val minutes by remember {
        mutableStateOf(countdownState.remainingTime.minutes.toString())
    }

    val seconds by remember {
        mutableStateOf(countdownState.remainingTime.seconds.toString())
    }

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
            Counter(countdownState = CountdownState() )
        }

    }

}