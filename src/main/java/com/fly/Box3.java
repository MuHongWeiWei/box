package com.fly;

public class Box3 extends Box {
    //設定箱子3長寬高名字
    public Box3() {
        super(23, 14, 13, "Box3");
    }

    @Override
    public boolean validate(float length, float width, int height) {
        if (length <= this.length && width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
