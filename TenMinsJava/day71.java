// Ask for password input and check if it contains a symbol w/o using regex
package TenMinsJava;

import java.util.Scanner;

public class day71 {
    public static boolean checkSymbol(String s) {
        for (Character c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String p = scan.nextLine();
        System.out.println(checkSymbol(p));
        scan.close();
    }
}
