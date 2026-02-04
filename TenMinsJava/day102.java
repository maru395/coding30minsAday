// new function: renameColumn(oldName, newName) renames a column of the csv
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day102 {
    public static void renameColumn(String oldName, String newName) {
        String filePath = "D:/coding30minsAday/textFiles/JTrialCsv.csv";
        ArrayList<String> lines = new ArrayList<>();

        try {
            // Step 1: Read all lines
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();

            if (lines.isEmpty()) return;

            // Step 2: Find the index of the column to delete
            String[] headerParts = lines.get(0).split(",");
            int targetIndex = -1;

            for (int i = 0; i < headerParts.length; i++) {
                if (headerParts[i].trim().equalsIgnoreCase(oldName)) {
                    targetIndex = i;
                    break;
                }
            }

            if (targetIndex == -1) {
                System.out.println("Column not found.");
                return;
            }

            // Step 3: Rebuild every line without that index
            if (!lines.isEmpty()) {
                String[] parts = lines.get(0).split(",");
                List<String> rowList = new ArrayList<>(Arrays.asList(parts));
                
                if (targetIndex < rowList.size()) {
                    rowList.set(targetIndex, newName); // Replace old name with new name
                    // Use .set() to update the specific line in the original ArrayList
                    lines.set(0, String.join(",", rowList)); 
                }
            }

            // Step 4: Write back to file
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            for (String row : lines) {
                writer.println(row);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    class Main {
        public static void main(String[] args) {
            System.out.println("h");
        }
    }
}
