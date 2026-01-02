// Check if string has 8 digits, or 11 digits starting with zero, or string begins with +, and contains 12 digits; valid: 8812-5566; (0922)3334455; +63922-3334455
package TenMinsJava;

public class day61 {
    public static void main(String[] args) {
        String s1 = "8812-5566";
        String s2 = "(0922)3334455";
        String s3 = "+63922-3334455";
        checkNum(s1);
        checkNum(s2);
        checkNum(s3);
    }

    public static void checkNum(String s) {
        s = s.replaceAll("[-()+]", "");
        if (s.matches("\\d+")) {
            if (s.length() == 8 || (s.length() == 11 && s.charAt(0) == '0') || (s.length() == 12)) {
                System.err.println("nice");
            }
            else {
                System.err.println("nah");
            }
        }
        else {
            System.err.println("nah");
        }
    }
}