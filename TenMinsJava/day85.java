// ask for an email input, do not allow duplicates (findFirst)
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class day85 {

    public static void checkEmail(String email) {
        try {
            if (email.matches(".+\\@.+\\..+")) {
                File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.contains(email)) {
                        System.out.println("duplicate email");
                    }
                    else {
                        FileWriter w = new FileWriter(file, true);
                        w.write(email + ",");
                        w.close();
                        System.out.println("Email saved successfully");
                    }
                }
            } 
            else {
                System.out.println("Invalid email format");
            }
            
        } catch (Exception e) {
            System.err.println("File error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkEmail("nayger@gmail.com");
    }
}
