// ask for date input and convert to unix timestamp
package TenMinsJava;

import java.time.LocalDate;
import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate d = LocalDate.now();
        long epoch = d.toEpochDay() * 24 * 60 * 60;
        System.out.println("Enter a date in format YYYY-MM-DD");
        String nd = scan.nextLine();
        LocalDate inputDate = LocalDate.parse(nd);
        long nEpoch = inputDate.toEpochDay() * 24 * 60 * 60;
        System.out.println(nEpoch - epoch);
    }
}
