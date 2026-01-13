// using readAllCsvRows(), create function searchCsvRows(columnName, value) return array of rowId
package TenMinsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class day81 {
    public static int[] searchCsvRows(String columnName, String value) {
        try {
            ArrayList<Integer> result = new ArrayList<>();
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            // initialize the first row or location for columns
            String first = "";
            int rowId = 1;
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
                    while (fScan.hasNextLine()) {
                        String row[] = first.split(",");
                        if (row[i].trim().equalsIgnoreCase(value)) {
                            result.add(rowId);
                        }
                        rowId++;
                    }
                    for (int n = 0; n < result.size(); n++) {
                        int num[] = new int[result.size()];
                        num[i] = result.get(i);
                        return num;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(searchCsvRows("second","2"));
    }
}