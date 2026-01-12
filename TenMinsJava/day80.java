// create function getCsvCellValue(rowId, columnNumber)
package TenMinsJava;

import java.io.File;
import java.util.Scanner;

public class day80 {
    public static int getCsvCellValue(int rowId, int columnNumber) {
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
                    for (int i = 0; i < row.length; i++) {
                        if (i + 1 == columnNumber) {
                            return row[i];
                        }
                    }
                }
            currentRow++;
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getCsvCellValue(2,2));
    }
}
