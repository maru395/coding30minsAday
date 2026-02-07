// sortColumn(rows, columnName) sorts rows array according to column specified, ascending alphabethical
package TenMinsJava;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day104 {
    public static void sortColumn(String columnName) {
        try {
            String filePath = "D:/coding30minsAday/textFiles/JTrialCsv.csv";
            File f = new File(filePath);
            ArrayList<String> lines = new ArrayList<>();
            Scanner fScan =  new Scanner(f);
            while (fScan.hasNextLine()) {
                lines.add(fScan.nextLine());
            }
            String head = lines.get(0);
            String header[] = lines.get(0).split(",");
            // find the column index
            int tempCouter = -1;
            for (int i = 0; i < header.length; i++) {
                if (header[i].equals(columnName)) {
                    tempCouter = i;
                    break;
                }
            }
            int index = tempCouter;
            lines.remove(0);
            lines.sort((a, b) -> {
                String[] rowA = a.split(",");
                String[] rowB = b.split(",");
                return rowA[index].compareToIgnoreCase(rowB[index]);
            });
            lines.add(0, head);
            
            PrintWriter newF = new PrintWriter(f);
            for (String r : lines) {
                newF.println(r);
            }
            newF.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}