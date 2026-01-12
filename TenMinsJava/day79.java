// create function getCsvColumnNumber(columnName) returns the position of the column (base 1)
package TenMinsJava;

import java.io.File;
import java.util.Scanner;

public class day79 {
    public static int getCsvColumnNumber(String columnName) {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            // initialize the first row or location for columns
            String first = "";
            if (fScan.hasNextLine()) {
                first = fScan.nextLine();
            }
            else {
                System.err.println("Csv not yet initialize");
            }
            // turns the values at the first row into an array
            String values[] = first.split(",");
            for (int i = 0; i < values.length; i++) {
                // checks column name to i index and add 1 because i starts at 0
                if (values[i].trim().toUpperCase().equals(columnName.toUpperCase())) {
                    return i+1;
                }
            }
            return 0;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getCsvColumnNumber("first"));
    }
}