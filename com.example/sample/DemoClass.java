package com.example.sample;

public class DemoClass {
    public static void main(String[] args) {
        Box defaultBox = new Box(); // Default Constructor
        System.out.println(defaultBox.h);
        System.out.println(defaultBox.w);
        defaultBox.calculateArea();
        defaultBox.h = 24;
        Box abox = new Box(10, 20);  // Para constructor
        System.out.println(abox.h);
        System.out.println(abox.w);
        abox.calculateArea();
        abox.calculateArea(12);
        Box copyBox = new Box(defaultBox); // Copy Constructor
        System.out.println(copyBox.h);
        System.out.println(copyBox.w);
        copyBox.calculateArea();
        System.out.println(Box.sta);
    }
}
