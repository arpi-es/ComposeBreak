package com.example.countdown

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountdownViewModel : ViewModel() {


    private val _counterState = mutableStateOf(CountdownState())
    val counterState : State<CountdownState> = _counterState
}


data class CountdownState(
    val counterState: CounterState = CounterState.INITIAL,
    val workingState: WorkingState = WorkingState.REST,
    val remainingTime : Int = REST_DURATION
)


enum class CounterState {
    INITIAL, PLAY, PAUSE
}

enum class WorkingState {
    REST, WORKING
}

const val REST_DURATION = 20
const val WORKING_DURATION = 20 * 60
