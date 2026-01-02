// Ask for password input and check if it contains a digit w/o using regex
package TenMinsJava;

import java.util.Scanner;

public class day69 {
    public static boolean checkNum(String s) {
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String p = scan.nextLine();
        System.out.println(checkNum(p));
        scan.close();
    }
}
