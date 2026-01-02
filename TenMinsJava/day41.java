// add 1 hour interval to current time and output (date/time manipulation [oop??])

package TenMinsJava;

import java.time.LocalTime;

public class day41 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now().plusHours(1);
        System.out.println(t);
    }
}