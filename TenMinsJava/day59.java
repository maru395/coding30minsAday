// Check if string is 8 digits or 11 (09123456789)
package TenMinsJava;

public class day59 {
    public static void main(String[] args) {
        String s = "09123456789";
        if (s.matches("\\d{8}") || s.matches("\\d{11}")) {
            System.err.println("nice");
        }
        else {
            System.err.println("nah");
        }
    }
}
