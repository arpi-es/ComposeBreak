package com.example.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.countdown.component.Counter
import com.example.countdown.component.CounterController
import com.example.countdown.model.CountdownState
import com.example.countdown.model.CounterState
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme

@Composable
fun CountdownRoute(
    viewModel: CountdownViewModel,
) {
//    CountdownScreen("", "")
}


@Composable
fun CountdownScreen(
    counterState: CounterState,
    countdownState: CountdownState,
    onResetClicked: () -> Unit,
    onPlayClicked: () -> Unit,
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Counter(countdownState)
        Spacer(modifier = Modifier.height(20.dp))
        CounterController(
            counterState = counterState,
            onResetClicked = onResetClicked,
            onPlayClicked = onPlayClicked
        )
    }
}

@ThemePreviews
@Composable
private fun CountdownScreenPreview() {

    ComposeBreakTheme {
        Surface {
            CountdownScreen(
                counterState = CounterState.INITIAL,
                countdownState = CountdownState(),
                onResetClicked = {},
                onPlayClicked = {},
            )
        }

    }
}