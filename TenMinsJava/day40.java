// print out the date/time on New York City
package TenMinsJava;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class day40 {
    public static void main(String[] args) {
        ZoneId zNY = ZoneId.of("America/New_York");
        ZonedDateTime dNY = ZonedDateTime.now(zNY);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(dNY.format(fmt));
    }
}
