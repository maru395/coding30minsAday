// get remaining microseconds of the current day
package TenMinsJava;

import java.time.LocalTime;

public class day37 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        long micro = t.toNanoOfDay() / 1000;
        System.out.println(86400000000L - micro);
    }
}
