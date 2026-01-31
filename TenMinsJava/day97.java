// press 'u' to update a row, ask for a rowId, then ask for the field values (day 82)
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day97 {
    public static void updateCsvCell(int rowId, int columnNumber, String value) {
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
            // try lines.set()
            if (lines.size() >= rowId) {
                String[] cells = lines.get(rowId - 1).split(",");
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press u to update row");
        String choice = scan.nextLine();
        if (choice.trim().toLowerCase().equals("u")) {
            System.out.println("Enter row id");
            String rowId = scan.nextLine().trim();
            System.out.println("Enter column id");
            String columnId = scan.nextLine().trim();
            System.out.println("Enter new value");
            String value = scan.nextLine().trim();
            int newRowId = Integer.parseInt(rowId);
            int newColumnId = Integer.parseInt(columnId);
            updateCsvCell(newRowId, newColumnId, value);
        }
        scan.close();
    }
}
