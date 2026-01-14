package TenMinsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class day81 {

    public static int[] searchCsvRows(String columnName, String value) {

        ArrayList<Integer> result = new ArrayList<>();

        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);

            // Read header
            if (!fScan.hasNextLine()) {
                System.err.println("CSV not initialized");
                return new int[0];
            }

            String header = fScan.nextLine();
            String[] columns = header.split(",");

            // Find column index
            int colIndex = -1;
            for (int i = 0; i < columns.length; i++) {
                if (columns[i].trim().equalsIgnoreCase(columnName)) {
                    colIndex = i;
                    break;
                }
            }

            if (colIndex == -1) {
                System.err.println("Column not found");
                return new int[0];
            }

            int rowId = 1;

            // Read data rows
            while (fScan.hasNextLine()) {
                String line = fScan.nextLine();
                String[] row = line.split(",");

                if (row[colIndex].trim().equalsIgnoreCase(value)) {
                    result.add(rowId);
                }
                rowId++;
            }

            fScan.close();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Convert ArrayList<Integer> → int[]
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] res = searchCsvRows("second", "2");
        for (int r : res) {
            System.out.println(r);
        }
    }
}
