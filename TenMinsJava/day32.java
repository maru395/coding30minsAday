// print out current date; then print out current time; using 2 separate function call, but outputting on the same line

package TenMinsJava;

import java.time.LocalDate;
import java.time.LocalTime;

public class day32 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        System.out.printf(" date: %tF %ntime: %tT", d, t);
    }
}
