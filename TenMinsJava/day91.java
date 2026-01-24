// read all csv row and output
package TenMinsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day91 {
    public static void output() {
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            ArrayList<String> lines = new ArrayList<>();

            while (fScan.hasNextLine()) {
                String line = fScan.nextLine();
                lines.add(line);
            }
            String output [] = new String[lines.size()];
            for (int i = 0; i < lines.size(); i++) {
                output[i] = lines.get(i);
            }
            System.out.println(Arrays.toString(output));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void main(String[] args) {
        output();
    }
}
