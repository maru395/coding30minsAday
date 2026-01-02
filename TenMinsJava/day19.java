// output a number, and wait for a keypress, then increment the number and print it out, then repeat
package TenMinsJava;

import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter to increment and q to quit");
        while (true) { 
            if (scn.nextLine().toLowerCase().equals("q")) {
                break;
            }
            else {
                num += 1;
                System.out.print(num);
            }
        }
    }
}
