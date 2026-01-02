// Check if string contains '@' and '.' using regex
package TenMinsJava;

import java.util.Scanner;

public class day47 {
    public static void check(String s) {
        if (s.matches(".*@.*\\..*")) {
            System.out.println("Contains @ and .");
        }
        else {
            System.out.println("None");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word with @ and .");
        String s = scan.nextLine();
        check(s);
    }
}
