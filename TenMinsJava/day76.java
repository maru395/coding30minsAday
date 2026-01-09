// create function addToCsv() that will create a csv file or append a row to an existing csv file, returning the row#
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class day76 {

    public static int addToCvs() {
        int row = 1;
        try {
            System.out.println("hello");
            File f = new File("D:/coding30minsAday/textFiles/csvDay76J.csv");
            if (f.exists()) {
                Scanner fScan = new Scanner(f);
                while(fScan.hasNextLine()) {
                    fScan.nextLine();
                    row++;
                }
                fScan.close();
            }
            FileWriter w = new FileWriter("D:/coding30minsAday/textFiles/csvDay76J.csv");
            w.append("\n");
            w.close();
            row++;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return row;
    }
}
