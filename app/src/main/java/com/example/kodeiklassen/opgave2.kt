package com.example.kodeiklassen

fun main() {
    val number1 = 10
    val number2 = 5

    computeOperations(number1, number2)
}

fun computeOperations(a:Int, b:Int) {
    val sum = a + b
    val difference = a - b
    val product = a * b
    val average = (a + b) / 2
    val distance = kotlin.math.abs(a - b) // Absolute difference
    val max = kotlin.math.max(a, b)
    val min = kotlin.math.min(a, b)


    // Print results
    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Average: $average")
    println("Distance: $distance")
    println("Maximum: $max")
    println("Minimum: $min")
}
