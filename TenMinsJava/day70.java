// Ask for password input and check if it contains lowercase letter w/o using regex
package TenMinsJava;

import java.util.Scanner;

public class day70 {
    public static boolean checkLower(String s) {
        for (Character c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String s = scan.nextLine();
        System.out.println(checkLower(s));
        scan.close();
    }
}
