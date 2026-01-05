// Ask for passsword input and require all (digit, symbol, uppercase, lowercase)
package TenMinsJava;

import java.util.Scanner;

public class day72 {
    public static boolean checkPass(String s) {
        boolean digit = false;
        boolean symbol = false;
        boolean uppercase = false;
        boolean lowercase = false;
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)){ digit = true;}
            if (Character.isUpperCase(c)) { uppercase = true;}
            if (Character.isLowerCase(c)) { lowercase = true;}
            if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) { symbol = true;}
        }
        return digit && symbol && uppercase && lowercase;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password");
        String s = scan.nextLine();
        System.out.println(checkPass(s));
        scan.close();
    }
}
