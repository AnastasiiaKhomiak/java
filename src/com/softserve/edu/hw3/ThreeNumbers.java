package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Обявляєо Scanner
        System.out.print("Enter 3 numbers for sorting: ");
        //int n = scanner.nextInt();
        int array[] = new int[3]; //створюємо масив розміром 3
        for (int i = 0; i < 3; i++ ) { // циклом про
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}



