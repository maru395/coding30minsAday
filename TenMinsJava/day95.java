// press D to delete a row, do feature from day90
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day95 {
    public static void deleteCSVRow(int rowId) {
        try {
            Scanner choice = new Scanner(System.in);
            System.out.println("Are you sure? (y/n");
            String ans = choice.nextLine().trim().toLowerCase();
            if (ans.equals("y")) {
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
            }
            else {
                return;
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press d to append delete row");
        String choice = scan.nextLine();
        if (choice.trim().toLowerCase().equals("d")) {
            System.out.println("Enter row id");
            String search = scan.nextLine().trim();
            deleteCSVRow(Integer.parseInt(search));
        }
        scan.close();
    }
}
