package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x ;
        x = 5+5 ;
        System.out.println("The value of x is: " + x);
        int y = 10;
        System.out.println("The value of y is: " + y);
        int z = x + y;
        System.out.println("The value of z (x + y) is: " + z);
        if (z > 10) {
            System.out.println("z is greater than 10");
        } else {
            System.out.println("z is not greater than 10");
        }

    }
}