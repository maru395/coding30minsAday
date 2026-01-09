// Ask for a credit/debit card input then validate using regex
package TenMinsJava;

import java.util.Scanner;

public class day75 {
    public static boolean checkCard(String s) {
        return (s.matches("^(\\d{4}[- ]?){3}\\d{4}|\\d{15}$"));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter card number");
        String s = scan.nextLine();
        System.out.println(checkCard(s));
        scan.close();
    }
}
