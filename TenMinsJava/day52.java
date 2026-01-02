// Check if string contains at least 1 lowercase letter
package TenMinsJava;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter a string with at least 1 lower case");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        for (Character cs : c) {
            if (Character.isLowerCase(cs)) {
                System.err.println("yah man");
                break;
            }
            else {}
        }
    }
}
