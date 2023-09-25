package com.example.countdown.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import com.example.countdown.model.CountdownState
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme
import com.example.ext_functions.minutes
import com.example.ext_functions.seconds
import com.example.ext_functions.timeToTwoDigitFormat

@Composable
fun Counter(
    countdownState: CountdownState
) {

    val minutes by remember {
        mutableStateOf(countdownState.remainingTime.minutes.toString().timeToTwoDigitFormat())
    }

    val seconds by remember {
        mutableStateOf(countdownState.remainingTime.seconds.toString().timeToTwoDigitFormat())
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