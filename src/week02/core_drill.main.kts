#!/usr/bin/env kotlin

import kotlin.math.PI

fun main() {
    val r = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    val volume = PI * r * r * h / 3
    println(volume)
}