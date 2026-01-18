// ask for an email input, add to csv (Create)
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;

public class day84 {

    public static void checkEmail(String email) {
        try {
            if (email.matches(".+\\@.+\\..+")) {
                File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");

                // true = append to CSV instead of overwriting
                FileWriter w = new FileWriter(file, true);
                w.write(email + ",");
                w.close();

                System.out.println("Email saved successfully");
            } else {
                System.out.println("Invalid email format");
            }

        } catch (Exception e) {
            System.err.println("File error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkEmail("nige@gmail.com");
    }
}