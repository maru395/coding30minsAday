// Check if string contains at least 1 digit
package TenMinsJava;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter string with a digit");
        String inp = scan.nextLine();
        if (inp.matches(".*[0-9].*")) {
            System.err.println("yes");
        }
        else {
            System.err.println("no");
        }
    }
}
