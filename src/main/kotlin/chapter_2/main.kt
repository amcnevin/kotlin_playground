package chapter_2

fun main(args: Array<String>) {
    println("Hello, World!")
}

// using an expression body
fun max(a: Int, b: Int): Int = if (a > b) a else b

// using a block body
fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

// test of val and var
val ten = 10
var eleven = 11

// why not make val's const?