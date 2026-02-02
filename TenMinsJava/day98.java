// addColumn(columnName) a function that will add a new column to the csv
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day98 {
    public void addColumn(String columnName) {
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
}

class Main {
    public static void main(String[] args) {
        
    }
}