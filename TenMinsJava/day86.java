// ask for an email & name input, add to csv (2 columns) (Create)

package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class day86 {

    public static void checkEmail(String email, String name) {
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
                        w.write(String.format("%s, %s\n", email, name));
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
        checkEmail("anderr@gmail.com", "anderson");
    }
}
