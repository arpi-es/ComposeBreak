package com.example.countdown

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.countdown.model.CountdownState

class CountdownViewModel : ViewModel() {


    private val _counterState = mutableStateOf(CountdownState())
    val counterState : State<CountdownState> = _counterState
}





