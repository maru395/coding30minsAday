// press A to add new row, feature in day76
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class day94 {
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press a to append new row");
        String choice = scan.nextLine();
        if (choice.trim().toLowerCase().equals("a")) {
            addToCvs();
        }
        scan.close();
    }
}
