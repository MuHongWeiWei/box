package com.fly;

public class Box5 extends Box{
    //設定箱子5長寬高名字
    public Box5() {
        super(39.5f, 27.5f, 23, "Box5");
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
