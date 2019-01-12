package com.fly.kotlin


open abstract class Box (var length: Float, var width: Float, var height: Int, var name: String){

    abstract fun validate (length: Float, width: Float, height: Int) : Boolean

    abstract fun getName()
}