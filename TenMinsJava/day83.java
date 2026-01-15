// deleteCSVRow(rowId) deletes a row from csv specified by the rowId
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day83 {
    public static void updateCsvCell(int rowId, int columnNumber, int value) {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            ArrayList<String> lines = new ArrayList<>();

            // Step 1: Read all lines
            while (fScan.hasNextLine()) {
                lines.add(fScan.nextLine());
            }
            fScan.close();

            // modifies the value
            if (lines.size() >= rowId) {
                String[] cells = lines.get(rowId - 1).split(",");
                System.out.println(Arrays.toString(cells));
                if (columnNumber <= cells.length) {
                    cells[columnNumber] = String.valueOf(value);
                    StringBuilder b = new StringBuilder();
                    for (int i = 0; i < cells.length; i++) {
                        b.append(cells[i].trim());
                        if (i < cells.length - 1) b.append(",");
                    }
                    lines.set(rowId - 1, b.toString());
                }
            }

            // rewrite the csv
            FileWriter w = new FileWriter(file);
            for (String string : lines) {
                w.write(string + "\n");
            }
            w.close();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
