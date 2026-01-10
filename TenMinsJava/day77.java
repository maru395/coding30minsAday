// create function readCsvRow(rowId) that returns a numeric array of the row values
package TenMinsJava;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class day77 {
    public static int[] readCsvRow(int rowId) {
        try {
            int currentRow = 1;
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            while (fScan.hasNextLine()) {
                String line = fScan.nextLine();
                if (currentRow == rowId) {
                    String value[]= line.split(",");
                    int row[] = new int[value.length];
                    for (int i = 0; i < value.length; i++) {
                        row[i] = Integer.parseInt(value[i].strip());
                    }
                    return row;
                }
            currentRow++;
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int val[] = readCsvRow(2);
        System.out.println(Arrays.toString(val));
    }
}
