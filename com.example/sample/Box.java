package com.example.sample;

public class Box {
    static int sta = 10;

    static {
        System.out.println("STATIC block");
    }

    int w;
    int h;

    public Box() {
        w = 10;
        h = 10;

    }

    public Box(int a, int b) { //constructor overloading
        w = a;
        h = b;
    }

    public Box(Box ref) {  //method overloading
        w = ref.w;
        h = ref.h;
    }

    static void show(int val) {
        System.out.println("I M A SHAPE with val" + val);
        System.out.println("I M A SHAPE with val" + sta);
    }

    void calculateArea() {
        int area = w * h;
        System.out.println("Area is " + area);
    }

    void calculateArea(int multiplier) {
        int area = w * h * multiplier;
        System.out.println("Area is " + area);
    }
}
