// Check if string contains 8 or 10 digits (even if there's dash, space or + parenthesis) (02) 8-555-6677
package TenMinsJava;

public class day58 {
    public static int digit = 0;
    public static int maxL1 = 8;
    public static int maxL2 = 10;
    public static void main(String[] args) {
        String s = "(02) 8-555-6677";
        for (Character c : s.toCharArray()) {
            if (c == '-' || c == ' ' || c == '+' || c == '(' || c == ')') { maxL1++; maxL2++; }
            if (Character.isDigit(c)) { digit++; }
        }
        if ((s.length() == maxL1 || s.length() == maxL2) && (digit == 8 || digit == 10)) {
            System.err.println("nice");
        }
        else {
            System.err.println("nah");
        }
    }
}
