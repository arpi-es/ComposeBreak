package com.example.countdown.model

data class CountdownState(
    val counterState: CounterState = CounterState.INITIAL,
    val workingState: WorkingState = WorkingState.REST,
    val remainingTime : Int = WORKING_DURATION
)
