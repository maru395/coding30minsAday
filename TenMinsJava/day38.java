// ask for a year input and output if it's a leap year or not using built in functions if possible
package TenMinsJava;

import java.time.Year;
import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int y = scan.nextInt();
        System.out.println(Year.isLeap(y));
    }
}
