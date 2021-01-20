package com.softserve.edu.hw2;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        int k = 16;
        System.out.println(k);
        int a = k++;
        System.out.println("k++ = " + a);
        int b = ++k;
        System.out.println("++k = "+ b);
        int c = k--;
        System.out.println("k-- = " + c);
        int d = k + +k;
        System.out.println("k + +k = " + d);
        int e = 50 - --k;
        System.out.println("50 - --k = " + e);
        int f = k * k;
        System.out.println("k*k = " + f);
        int g = k / 3;
        System.out.println("k / 3 = " + g);
        int h = k % 3;
        System.out.println("k % 3 = " + h);
        boolean bool = k++ < ++k;


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name  = scanner.next();
        System.out.println("Hello, " + name);

    }
}
