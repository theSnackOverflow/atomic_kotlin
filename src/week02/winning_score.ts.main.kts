#!/usr/bin/env kotlin

fun main() {
    val a3 = readLine()!!.toInt()
    val a2 = readLine()!!.toInt()
    val a1 = readLine()!!.toInt()
    val b3 = readLine()!!.toInt()
    val b2 = readLine()!!.toInt()
    val b1 = readLine()!!.toInt()

    val appleScore = a3 * 3 + a2 * 2 + a1
    val bananaScore = b3 * 3 + b2 * 2 + b1

    if (appleScore > bananaScore) {
        println("A")
    } else if (appleScore < bananaScore) {
        println("B")
    } else {
        println("T")
    }
}