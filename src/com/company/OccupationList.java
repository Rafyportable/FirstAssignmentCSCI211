package com.company;

import java.util.Scanner;

public class OccupationList {

    public void loadArray(Occupation[] occ) throws Exception {

        String inCOS;
        String inTitle;
        String inEmployment;
        String inSalary;

        java.io.File occFile = new java.io.File("occupations.txt");

        Scanner inFile = new Scanner(occFile);

        for (int i = 0; i < 803; i++){

            inCOS = inFile.nextLine();
            inTitle = inFile.nextLine();
            inEmployment = inFile.nextLine();
            inSalary = inFile.nextLine();

            occ[i] = new Occupation(inCOS, inTitle, inEmployment, inSalary);

        }

        inFile.close();

        for (int j = 0; j < 803; j++){
            System.out.println(occ[j].toString());

        }

    }

    public void typeHere() throws Exception {

        Occupation[] amount = new Occupation[803];

        Scanner write = new Scanner(System.in);

        loadArray(amount);

        for (int i = 0; i < 803; i++) {

            System.out.println(amount[i].toString());

        }

        System.out.println("Please type the Standard Occupational Classification (SOC): ");

        String answer = write.next();

        for (int j = 0; j <=  amount.length - 1; j++) {

            if (amount[j].toString().contains(answer)){

                System.out.println("It is a match");

            } else {

                System.out.println("Sorry it seems there's no match for the SOC");

            }

        }

    }

}
