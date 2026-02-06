// sortColumn(rows, columnName) sorts rows array according to column specified, ascending alphabethical
package TenMinsJava;

import java.util.ArrayList;
import java.util.Scanner;

public class day104 {
    public static void sortColumn(String columnName) {
        String filePath = "D:/coding30minsAday/textFiles/JTrialCsv.csv";
        ArrayList<String> lines = new ArrayList<>();
        Scanner fScan =  new Scanner(filePath);
        while (fScan.hasNextLine()) {
            lines.add(fScan.nextLine());
        }
        for (String s : lines.get(0)) {
            
        }
    }
}