package com.softserve.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        System.out.println("My first program");
        //
        //       for (int i=0; i<args.length; i++)
        {
            //           System.out.println("argument i =" + i + " value = " + args[i]);

        }
        //       byte b = 49;
//        System.out.println("b = " + b + "b as Char = " + (char)b);
        int x = 0;
        int y = 0;
        double a = 1;
        double b = 2;
        //       BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in));
        //               System.out.print("x = ");
        //               String text = br.readLine();

            /*Scanner sc = new Scanner(System.in);
            System.out.println("x = ");
            x = sc.nextInt();
            System.out.println("y = ");
            y = sc.nextInt();
            sc.close();
            System.out.println("x / y = " + (x % y));
            */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("a = ");
            a = sc.nextDouble();
            System.out.println("b = ");
            b = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Scanner Error found");
        }
        System.out.println("a / b = " + (a / b));
    }
}


