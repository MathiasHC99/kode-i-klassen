package com.example.kodeiklassen

fun main() {
    val inputStrings = listOf("apple","banana","kiwi","strawberry","pear","coconut")

    val result = stringsLength(inputStrings)

    println(result)
}

fun stringsLength(strings: List<String>): List<Int> {
    return strings.map {if (it.length > 5) it.length else 0}
}


