// output fibonacci sequence (base 1) on each keypress
package TenMinsJava;

import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to print fibonacci or q to quit");
        int a = 1;
        int b = 1;
        while (true) { 
            if (scan.nextLine().toLowerCase().equals("q")) {
                break;
            }
            else {
                System.out.print(a);
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
