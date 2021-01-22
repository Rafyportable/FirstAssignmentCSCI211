package com.company;

import java.util.Scanner;

public class OccupationList {

    public static void loadArray(Occupation[] occ) throws Exception {

        int i;

        String inCOS;
        String inTitle;
        int inEmployment;
        int inSalary;

        java.io.File occFile = new java.io.File("occupations.txt");

        Scanner inFile = new Scanner(occFile);

        for ( i = 0; i < 1000; i++){

            inCOS = inFile.nextLine();
            inTitle = inFile.nextLine();
            inEmployment = Integer.parseInt(inFile.nextLine());
            inSalary = Integer.parseInt(inFile.nextLine());

            occ[i] = new Occupation(inCOS, inTitle, inEmployment, inSalary);

        }
        inFile.close();
    }

}
