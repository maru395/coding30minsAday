// Check if string is 8 digits
package TenMinsJava;

import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.err.println("Enter 8 digit number");
        String s = scan.nextLine();
        if (s.length() == 8) {
            if (s.matches("\\d+")) {
                System.err.println("nice");
            }
            else {
                System.err.println("not a letter bro");
            }
        }
        else {
            System.err.println("insufficient length");
        }
    }
}