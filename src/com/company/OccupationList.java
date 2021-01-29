package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OccupationList {

    private String fromEmployment;
    private String fromSalary;
    private int toEmployment;
    private int toSalary;

    public void loadArray(Occupation[] occ) throws Exception {

        java.io.File occFile = new java.io.File("occupations.txt");

        Scanner inFile = new Scanner(occFile);

        for (int i = 0; i < 803; i++){

            String inCOS = inFile.nextLine();
            String inTitle = inFile.nextLine();

            //Updated employee variable from String to Integer
            fromEmployment = inFile.nextLine();
            fromEmployment = fromEmployment.replaceAll(",", "");
            toEmployment = Integer.parseInt(fromEmployment);

            //Updated salary variable from String to Integer
            fromSalary = inFile.nextLine();
            fromSalary = fromSalary.replaceAll(",", "");
            toSalary = Integer.parseInt(fromSalary);

            occ[i] = new Occupation(inCOS, inTitle, toEmployment, toSalary);

        }

        inFile.close();

    }

    public void typeHere() throws Exception {

        Occupation[] amount = new Occupation[803];

        Scanner write = new Scanner(System.in);

        loadArray(amount);

        System.out.println("Please type the Standard Occupational Classification (SOC): ");

        String answer = write.next();

        for (int j = 0; j <=  amount.length - 1; j++) {

            if (amount[j].toString().contains(answer)){

                System.out.println("\nIt is a match!\nHere's what we found: \n");
                System.out.println(amount[j].toString());
                break;

            } else {

                System.out.println("Nope not this one");

            }
        }
    }

    public void totalOccupation() throws Exception {

        int total = 0;
        java.io.File occFile = new java.io.File("occupations.txt");

        Scanner inFile = new Scanner(occFile);

        for (int i = 1; i < 805; i++){

            inFile.nextLine();
            inFile.nextLine();

            fromEmployment = inFile.nextLine();
            fromEmployment = fromEmployment.replaceAll(",", "");
            toEmployment = Integer.parseInt(fromEmployment);
            total += toEmployment;

            inFile.nextLine();

        }

        inFile.close();
        System.out.println(total);
    }

    public void avgSalary() throws Exception {

        int total = 0;

        java.io.File occFile = new java.io.File("occupations.txt");
        Scanner inFile = new Scanner(occFile);

        for (int i = 1; i < 805; i++){

            inFile.nextLine();
            inFile.nextLine();
            inFile.nextLine();

            fromSalary = inFile.nextLine();
            fromSalary = fromSalary.replaceAll(",", "");
            toSalary = Integer.parseInt(fromSalary);
            total += toSalary;

        }

        int Average = total / 804;

        inFile.close();

        System.out.println(Average);

    }

    public void print() throws IOException {

        //This code is based on StackOverflow, answered by Jiri Kremser, edited by Harshal Parekh
        try (BufferedReader br = new BufferedReader(new FileReader("occupations.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
