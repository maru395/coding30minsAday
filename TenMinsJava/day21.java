// Ask for a number input, print an error when it's not a number using if else
package TenMinsJava;

import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) { 
            System.out.println("Enter a number and q to exit");
            String input = scan.nextLine();
            int ascii = input.charAt(0);
            if (input.toLowerCase().equals("q")) {
                break;
            }
            else if (ascii < 58 && ascii > 47) {
            }
            else {
                System.out.println("Error");
            }
        }
    }
}
