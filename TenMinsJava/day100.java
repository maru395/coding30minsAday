// press "c" to add new column to the csv
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day100 {
    public static void addColumn(String columnName) {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            ArrayList<String> lines = new ArrayList<>();

            lines.add(fScan.nextLine() + "," + columnName);
            while (fScan.hasNextLine()) {
                lines.add(fScan.nextLine());
            }
            fScan.close();

            // rewrite the csv
            FileWriter w = new FileWriter(file);
            for (String string : lines) {
                w.write(string + "\n");
            }
            w.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Press c to add new column");
            String choice = scan.nextLine();
            if (choice.trim().toLowerCase().equals("c")) {
                System.out.println("Enter column name");
                String search = scan.nextLine().trim();
                addColumn(search);
            }
            scan.close();
        }
    }
}
