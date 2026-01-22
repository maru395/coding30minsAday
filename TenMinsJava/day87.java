// ask for an email & name input, if email is duplicate, update name(Update)
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class day87 {

    public static void email(String email, String name) {
        File file = new File("D:/coding30minsAday/textFiles/JTrialCsv.csv");
        ArrayList<String> lines = new ArrayList<>();
        boolean emailFound = false;

        try (Scanner scan = new Scanner(file)) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");

                if (parts[0].trim().equals(email)) {
                    // update name if email exists
                    lines.add(email + "," + name);
                    emailFound = true;
                } else {
                    lines.add(line);
                }
            }

            if (!emailFound) {
                if (!email.matches(".+@.+\\..+")) {
                    System.out.println("Invalid email format");
                    return;
                }
                lines.add(email + "," + name);
                System.out.println("Email saved successfully");
            } else {
                System.out.println("Duplicate email found. Name updated.");
            }

            // rewrite file
            FileWriter writer = new FileWriter(file);
            for (String l : lines) {
                writer.write(l + "\n");
            }
            writer.close();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}