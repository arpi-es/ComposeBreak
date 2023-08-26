package com.example.countdown.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.countdown.CounterState
import com.example.designsystem.ThemePreviews
import com.example.designsystem.theme.ComposeBreakTheme


@Composable
fun CounterController(
    counterState: CounterState,
    onResetClicked: () -> Unit,
    onPlayClicked: () -> Unit,
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(0.3f),
            onClick = {
                when (counterState) {
                    CounterState.INITIAL -> onPlayClicked
                    CounterState.PLAY -> onResetClicked
                    CounterState.PAUSE -> onResetClicked
                }
            }
        ) {
            Icon(
                imageVector = when (counterState) {
                    CounterState.INITIAL -> Icons.Default.PlayArrow
                    CounterState.PLAY -> Icons.Filled.ExitToApp
                    CounterState.PAUSE -> Icons.Filled.PlayArrow
                },
                contentDescription = null
            )

        }
    }
}


@ThemePreviews
@Composable
private fun CounterControllerPreview() {

    ComposeBreakTheme {
        Surface {
            CounterController(
                counterState = CounterState.INITIAL,
                onResetClicked = {},
                onPlayClicked = {},
            )
        }
    }
}