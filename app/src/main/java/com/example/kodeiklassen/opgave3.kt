package com.example.kodeiklassen

fun main() {
val prices = mutableListOf(3,6,12,54,23,76,34,101,2)

    val filteredPrices = filterGreaterThan(prices)

    println("Numbers greater than 10: $filteredPrices")
}

fun filterGreaterThan(numbers: List<Int>): List<Int> {
    return numbers.filter {it > 10}
}