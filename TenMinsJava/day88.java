// Ask for a name, output all matching csv row (exact match) searchMultiple
package TenMinsJava;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class day88 {

    public static String[] searchMultiple(String name) {

        ArrayList<String> result = new ArrayList<>();
        
        try {
            File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
            Scanner fScan = new Scanner(file);
            
            while (fScan.hasNextLine()) {
                String line = fScan.nextLine().trim();
                String temp [] = line.split(",");
                for (String s : temp) {
                    if (s.equals(name)) {
                        result.add(line);
                    }
                }
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Convert ArrayList<String> → String[]
        String[] output = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}