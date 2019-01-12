package com.fly;

public abstract class Box {

    //創建box長寬高名字
    float length;
    float width;
    float height;
    String name;

    public Box(float length, float width, float height, String name) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    //判斷是否能裝
    public abstract boolean validate(float length, float width, int height);

    //取得箱子名稱
    public abstract void getName();
}
