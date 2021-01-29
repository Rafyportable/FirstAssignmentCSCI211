package com.company;

import java.util.Scanner;

/* Rafael Rodriguez
   Professor: Chuck Herbert
   January 28th, 2021
   Programming Assignment: Multiple classes
 */

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        OccupationList type = new OccupationList();
        Scanner s = new Scanner(System.in);

        int select;

        System.out.println("*****************************");
        System.out.println("HELLO THERE");
        System.out.println("*****************************");
        System.out.println("Welcome to the Occupational Memory System (OMS)");
        System.out.println("*****************************");
        System.out.println("Here are your options: ");
        System.out.println("*****************************");

        while(true) {

            System.out.println("\n1: Print the entire list");
            System.out.println("\n2: Total number of occupations");
            System.out.println("\n3: The average salary of occupations");
            System.out.println("\n4: Look for an occupation based on SOC");
            System.out.println("\n5: Exit");

            select = s.nextInt();

            if (select == 1) {
                type.print();
            } else if (select == 2) {
                System.out.println("Here's the total amount of occupations according to our data \n");
                type.totalOccupation();
            } else if (select == 3) {
                System.out.println("Here's the average salary according to our data \n");
                type.avgSalary();
            } else if (select == 4) {
                type.typeHere();
            } else if (select == 5) {
                System.out.println("Thank you for using this program! Adios");
                break;
            }
        }
    }
}
