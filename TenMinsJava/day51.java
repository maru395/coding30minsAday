// Check if string contains at least 1 upper case letter
package TenMinsJava;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter a string with at least 1 upper case");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        for (Character cs : c) {
            if (Character.isUpperCase(cs)) {
                System.err.println("yah man");
                break;
            }
            else {}
        }
    }
}
