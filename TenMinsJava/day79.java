// create function getCsvColumnNumber(columnName) returns the position of the column (base 1)
package TenMinsJava;

import java.io.File;
import java.util.Scanner;

public class day79 {
    public static int getCsvColumnNumber(String columnName) {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            String first = "";
            if (fScan.hasNextLine()) {
                first = fScan.nextLine();
            }
            String values[] = first.split(",");
            for (int i = 0; i < values.length; i++) {
                if (values[i].trim().equals(columnName)) {
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