package com.softserve.edu.hw4;

import java.util.Scanner;

public class EmplAppl {

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Perto", "Developer");
        employee[1] = new Employee("Stepan", "Devops");
        employee[2] = new Employee("Mariia", "QA");
        employee[3] = new Employee("Taniia", "PM");
        employee[4] = new Employee("Igor", "TA");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide department: ");
        String departament = scanner.next();

        for (Employee current: employee) {
            if (current.getDepartment().trim().equalsIgnoreCase(departament))
                System.out.println(current);
        }
        
    }
}
