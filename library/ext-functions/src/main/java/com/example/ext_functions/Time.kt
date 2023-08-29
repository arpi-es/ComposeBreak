package com.example.ext_functions

val Int.minutes: Int
    get() = this / 60

val Int.seconds: Int
    get() = this % 60


fun String.timeToTwoDigitFormat(): String =
    if (this.length == 1) {
        "0$this"
    } else {
        this
    }