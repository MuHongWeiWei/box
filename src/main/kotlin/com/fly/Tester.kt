package com.fly.kotlin

fun main(args: Array<String>) {
    println("Please enter object's length:")
    val length: Float = readLine()!!.toFloat()
    println("Please enter object's width:")
    val width = readLine()!!.toFloat()
    println("Please enter object's height:")
    val height = readLine()!!.toInt()

    val box3 = Box3()
    val box5 = Box5()

    when {
        box3.validate(length, width, height) -> box3.getName()
        box5.validate(length, width, height) -> box5.getName()
        else -> println("沒箱子可裝")
    }
}