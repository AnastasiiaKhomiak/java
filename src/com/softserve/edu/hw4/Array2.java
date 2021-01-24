package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array2 {
    public static void main(String[] args) {
        int []array = {2, -2, 3, -3, 5, -5, 7, -7, 1, 1};
        int max = 0;
        int min = array[0];
        int plus = 0;
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
            System.out.print(min);

            }
        }


    //}
//}

 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integers: ");
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(array));
    }

}


    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12};
        int sum = IntStream.of(myArray).sum();

        System.out.println(sum);
    }


}*/

