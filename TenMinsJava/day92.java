// output csv as pretty table (text format)
package TenMinsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class day92 {
    public static void output() {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            ArrayList<String[]> lines = new ArrayList<>();

            while (fScan.hasNextLine()) {
                String line = fScan.nextLine().trim();
                String parts[] = line.split(",");
                if(parts.length >= 2) {
                    lines.add(parts);
                }
            }
            fScan.close();
            
            System.out.printf("%-30s | %-20s%n", "Email", "Name");
            System.out.println("-".repeat(54));

            // Print rows
            for (String[] row : lines) {
                System.out.printf("%-30s | %-20s%n", row[0], row[1]);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        output();
    }
}
