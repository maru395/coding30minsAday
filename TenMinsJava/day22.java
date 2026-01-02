// Ask for a number input, throw an error if it's more than 100 or less than zero
package TenMinsJava;

import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();
        if (input < 0 || input > 100) {
            System.out.println("Error");
        }
        else {}
    }
}
