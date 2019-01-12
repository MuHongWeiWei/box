package com.fly.kotlin

class Box5: Box(39.5f, 27.5f, 23, "Box5") {
    override fun validate(length: Float, width: Float, height: Int): Boolean {
        if (length < this.length && width <= this.width && height <= this.height) {
            return true
        }
        return false
    }

    override fun getName() = print(this.name)
}