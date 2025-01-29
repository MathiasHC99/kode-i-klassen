package com.example.kodeiklassen

fun main() {
    // Define height and width of the rectangle
    val height = 8.5
    val width = 5.5

    // Call the function to compute and print results
    computeRectangleProperties(height, width)
}

// Function to compute and print area & perimeter
fun computeRectangleProperties(height: Double, width: Double) {
    val area = height * width
    val perimeter = 2 * (height + width)

    // Print the results
    println("Area of the rectangle: $area")
    println("Perimeter of the rectangle: $perimeter")
}


