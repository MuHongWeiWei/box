package com.fly.kotlin


class Box3 : Box(23f, 14f, 13, "Box3") {

    override fun validate(length: Float, width: Float, height: Int): Boolean {
        if (length < this.length && width <= this.width && height <= this.height) {
            return true
        }
        return false
    }

    override fun getName() = print(this.name)


}