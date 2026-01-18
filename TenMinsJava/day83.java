// deleteCSVRow(rowId) deletes a row from csv specified by the rowId
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day83 {
    public static void deleteCSVRow(int rowId) {
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
            lines.remove(rowId - 1);

            // rewrite the csv
            FileWriter w = new FileWriter(file);
            for (String string : lines) {
                w.write(string + "\n");
            }
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
