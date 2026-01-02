// supposedly day 46 Check if string contains '@'
package TenMinsJava;

import java.util.Scanner;

public class day45 {
    public static void check(String s) {
        if (s.contains("@")) {
            System.out.println("it contains a @");
        }
        else {
            System.out.println("invalid email");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email");
        String s = scan.nextLine();
        check(s);
    }
}
