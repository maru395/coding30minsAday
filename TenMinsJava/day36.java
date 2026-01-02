// get remaining milliseconds of current the day
package TenMinsJava;

import java.time.LocalTime;

public class day36 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        long ms = t.toNanoOfDay();
        System.out.println(86400000L - ms);
    }
}
