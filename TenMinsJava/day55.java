// Check if string contains 8 digits (even if there's dash)

package TenMinsJava;

import java.util.Scanner;

public class day55 {
    public static int digit = 0;
    public static int maxL = 8;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter 8 digit number (- is ignored)");
        String s = scan.nextLine();
        for (Character c : s.toCharArray()) {
            if (c == '-') { maxL++; }
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
