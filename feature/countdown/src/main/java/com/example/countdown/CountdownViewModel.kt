package com.example.countdown

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.countdown.model.CountdownState
import com.example.countdown.model.WORKING_DURATION
import com.example.countdown.model.WorkingState
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CountdownViewModel : ViewModel() {


    private val _countdownState = mutableStateOf(CountdownState())
    val countdownState: State<CountdownState> = _countdownState
    private var timerJob: Job = Job()


    fun startCountdown() {
        timerJob = viewModelScope.launch {
            while (true) {
                delay(1000L)

                if (_countdownState.value.remainingTime > 0) {
                    _countdownState.value = _countdownState.value.copy(
                        remainingTime = _countdownState.value.remainingTime - 1,
                    )
                } else {
                    when(_countdownState.value.workingState){
                        WorkingState.REST -> {
                            _countdownState.value = _countdownState.value.copy(
                                workingState = WorkingState.WORKING,
                                remainingTime = WORKING_DURATION
                            )
                        }
                        WorkingState.WORKING -> {
                            resetCountdownState()
                            this.cancel()
                        }
                    }

                }

            }
        }
    }

    fun resetCountdown() {

        if (timerJob.isActive) {
            resetCountdownState()
            timerJob.cancel()
        }
    }

    fun resetCountdownState() {
        _countdownState.value = CountdownState()
    }
}





