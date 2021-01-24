package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter array length: "); //ввуди довжину масиву
        //int size = sc.nextInt(); //змінна довжиеи масиву
        System.out.println("Please enter 10 numbers: ");
        //int arr[] = sc.nextInt();
        int arr[] = {21, -1, 1, 1, 1, 1, 1, 1, 1, 1}; //створили масив
        int sum = 0;

        for (int element : arr) { //пройшлись по масиву
            //arr[i] = sc.nextInt(); //записуємо цифри в масив
            sum = sum + element; //sum = sum + кожен елемент масиву

                }
                System.out.print(sum);
            }

        }




           // int array[] = {5, 8, 19, 21, 54};
            // int sum = array[0] + array[1] + array[2] + array[3] + array[4];
            // System.out.println(sum);


