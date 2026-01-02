// Check if string contains 1 digit, 1 symbol, 1 uppercase letter and 1 lowercase and is more than 10 characters long
package TenMinsJava;

import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter a string with 1 digit, 1 symbol, 1 uppercase and 1 lower and more than 10 characters long");
        String s = scan.nextLine();
        char ch[] = s.toCharArray();
        boolean digit = false;
        boolean symbol = false;
        boolean upper = false;
        boolean lower = false;
        boolean len = false;
        for (Character c : ch) {
            if (Character.isDigit(c)) { digit = true; }
            if (!Character.isLetterOrDigit(c)) { symbol = true; }
            if (Character.isUpperCase(c)) { upper = true; }
            if (Character.isLowerCase(c)) { lower = true; }
            if (s.length() > 10) { len = true; }
        }
        if (digit && symbol && upper && lower && len) {
            System.err.println("yeah man");
        }
        else {
            System.err.printf("requirments: \ndigit: %b \nsymbol: %b \nuppercase: %b \nlowercase: %b \ndigit: %b", digit, symbol, upper, lower, len);
        }
    }
}
