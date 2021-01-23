package com.softserve.edu.hw3;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.println("Original a = " + a + " " + "b = " + b);
        System.out.println("Replaced a = " + b + " " + "b = " + a);
    }
}
