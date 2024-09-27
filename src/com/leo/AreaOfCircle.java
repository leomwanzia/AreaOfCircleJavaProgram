package com.leo;

import java.util.Scanner;

public class AreaOfCircle { //declares a public class of AreaOfCircle
    public static void main(String[] args) { //entry point
        Scanner in = new Scanner(System.in); //reads input from the standard input from keyboard

        System.out.println("Enter the Radius of the circle : "); // prints a prompt to console

        double radius = in.nextDouble(); //reads double value from the user ,stores in radius
        // Area = π x 2(radius) formula
        double area = Math.PI * radius * radius; //represents the value of pi in the formula
        System.out.println("The area of the circle is :" + area);
    }
}
