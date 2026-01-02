// Check if string contains at least 1 symbol
package TenMinsJava;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter a unique symbol");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        for (Character cs : c) {
            if (!Character.isLetterOrDigit(cs)) {
                System.err.println("yah man");
                break;
            }
            else {}
        }
    }
}
