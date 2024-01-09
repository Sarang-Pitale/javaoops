package com.example.sample;

public class Sample1 {
    public static void main(String[] a){
        Box obj=new Box();
        obj.calculateArea();// calculateArea is not public but it is default so no issue in same package

    }
}
