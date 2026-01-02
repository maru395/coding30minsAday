// Check if string contains 8 digits (even if there's dash, space or +)
package TenMinsJava;

import java.util.Scanner;

public class day56 {
    public static int digit = 0;
    public static int maxL = 8;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter 8 digit number (- space and + is ignored)");
        String s = scan.nextLine();
        for (Character c : s.toCharArray()) {
            if (c == '-' || c == ' ' || c == '+') { maxL++; }
            if (Character.isDigit(c)) { digit++; }
        }
        if (s.length() == maxL && digit == 8) {
            System.err.println("nice");
        }
        else {
            System.err.println("nah");
        }
    }
}
