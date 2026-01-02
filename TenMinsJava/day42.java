// get date yesterday and output (date/time manipulation [substraction and rounding off])
package TenMinsJava;

import java.time.LocalTime;

public class day42 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now().minusHours(24);
        System.out.println(t);
    }
}
