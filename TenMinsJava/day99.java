// deleteColumn(columnName) a function that will delete the specified columnName from the csv
// to review
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day99 {
    public static void deleteColumn(String columnName) {
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
                if (headerParts[i].trim().equalsIgnoreCase(columnName)) {
                    targetIndex = i;
                    break;
                }
            }

            if (targetIndex == -1) {
                System.out.println("Column not found.");
                return;
            }

            // Step 3: Rebuild every line without that index
            ArrayList<String> updatedLines = new ArrayList<>();
            for (String line : lines) {
                String[] parts = line.split(",");
                List<String> rowList = new ArrayList<>(Arrays.asList(parts));
                
                if (targetIndex < rowList.size()) {
                    rowList.remove(targetIndex); // The Java version of .pop(index)
                }
                
                updatedLines.add(String.join(",", rowList));
            }

            // Step 4: Write back to file
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            for (String row : updatedLines) {
                writer.println(row);
            }
            writer.close();

            System.out.println("Column '" + columnName + "' deleted successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        
    }
}