package com.fly;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        int height = scanner.nextInt();

        Box box3 = new Box3();
        Box box5 = new Box5();

        if (box3.validate(length, width, height)) {
            box3.getName();
        } else if (box5.validate(length, width, height)) {
            box5.getName();
        } else {
            System.out.println("沒有能裝的");
        }

    }
}
