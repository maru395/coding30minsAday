// using readCSVRow(), create function readAllCsvRows()
package TenMinsJava;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class day78 {
    public static int[] readAllCsvRow() {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            String line = fScan.nextLine();
            while (fScan.hasNext()) {
                line += "," + fScan.nextLine();
            }
            String value[]= line.split(",");
            int row[] = new int[value.length];
            for (int i = 0; i < value.length; i++) {
                row[i] = Integer.parseInt(value[i].strip());
                fScan.close();
            }
            return row;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int val[] = readAllCsvRow();
        System.out.println(Arrays.toString(val));
    }
}