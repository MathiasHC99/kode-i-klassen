package com.example.kodeiklassen

fun main() {
    greetPerson("Bob") {name -> "Hello $name"}

    greetPerson("Alice") {name -> "Welcome, dear $name"}
}

fun greetPerson(name: String, generateGreeting: (String) -> String) {
    val greetingMessage = generateGreeting(name)
    println(greetingMessage)
}