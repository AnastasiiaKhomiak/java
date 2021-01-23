package com.softserve.edu.hw3;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Arrays;
import java.util.Scanner;

public class NotEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 4 integer: ");
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) { //прохожусь циклом по масиву
            // if (array[i] % 2 == 0) {
            array[i] = scanner.nextInt(); // записую значення в масив
        }
        for (int element : array) {
            if (element % 2 != 0) {
                System.out.println(element);
            }
        }
    }
    }




