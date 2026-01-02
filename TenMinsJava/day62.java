// Ask for a password input and save to a variable (and print out)
package TenMinsJava;

import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");
        String p = scan.nextLine();
        System.out.println(p);
    }
}
