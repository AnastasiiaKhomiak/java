package com.softserve.edu.hw3;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        Product product1 = new Product("milk", 29.00);
        Product product2 = new Product("bred", 15.90);
        Product product3 = new Product("salt", 18.50);
        Product product4 = new Product("oil", 120.90);



        double [] array = {product1.getPrice(), product2.getPrice(), product3.getPrice(), product4.getPrice()};
        double max = array[0];
        for (int i = 0; i < 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
            System.out.println(max);

        }
    }


