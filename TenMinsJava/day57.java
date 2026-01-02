// Check if string contains 8 or 10 digits
package TenMinsJava;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter 8 or 10 digits");
        String s = scan.nextLine();
        if ((s.length() == 8 || s.length() == 10) && s.matches("\\d+")) {
            System.err.println("nice");
        }
        else {
            System.err.println("nah");
        }
    }
}
