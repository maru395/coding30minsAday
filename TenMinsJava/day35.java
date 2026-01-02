// output remaining seconds on the current day

package TenMinsJava;

import java.time.LocalTime;

public class day35 {
    public static void main(String[] args) {
        LocalTime s = LocalTime.now();
        int Csec = s.toSecondOfDay();
        System.out.println(86400 - Csec);
    }
}
