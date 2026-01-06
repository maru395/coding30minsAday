// Ask for passwoord input and require at least 3 (digit, symbol, uppercase, lowercase)
package TenMinsJava;

import java.util.Scanner;

public class day73 {
    public static boolean checkPass(String s) {
        boolean status [] = new boolean[4]; 
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)){ status[0] = true;}
            if (Character.isUpperCase(c)) { status[1] = true;}
            if (Character.isLowerCase(c)) { status[2] = true;}
            if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) { status[3] = true;}
        }
        int min = 0;
        for (Boolean b : status) {
            if (b == true) {
                min++;
            }
        }
        return min >= 3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String s = scan.nextLine();
        System.out.println(checkPass(s));
        scan.close();
    }
}
