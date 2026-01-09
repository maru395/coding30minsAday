package TenMinsJava;

import java.util.Scanner;

public class day77 {
    public static int[] readCsvRow(int rowId) {
        try {
            int currentRow = 1;
            Scanner fScan = new Scanner("D:/coding30minsAday/textFiles/JTrialCsv.csv");
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
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int val[] = readCsvRow(2);
        for (int n : val) {
            System.out.print(n);
        }
    }
}
