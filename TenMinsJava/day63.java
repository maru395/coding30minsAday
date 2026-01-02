//  Formerly day 67 Ask for a password input and save to a variable (and print out)
package TenMinsJava;

import java.io.FileWriter;
import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter text: ");
            String s = scan.nextLine();
            String path = "D:/coding30minsAday/textFiles/textDay67J.txt";

            FileWriter  w = new FileWriter(path);
            w.write(s);
            w.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
