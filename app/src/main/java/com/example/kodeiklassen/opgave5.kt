package com.example.kodeiklassen

fun main() {
    val fahrenheitTemps = listOf(32.0,50.0,77.0,104.0)

    val celsiusTemps = convertToCelsius(fahrenheitTemps)

    println(celsiusTemps)
}

fun convertToCelsius(fahrenheitList: List<Double>): List<Double> {
    return fahrenheitList.map { (it - 32) * 5 / 9 }
}