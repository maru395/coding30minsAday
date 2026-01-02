// attempt to list 24 timezones list (numeric array of objects/assoc array)

package TenMinsJava;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class day43 {
    public static void timeZone(String t) {
        ZoneId zId = ZoneId.of(t);
        ZonedDateTime n = ZonedDateTime.now(zId);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println(n.format(fmt));
    }
    public static void main(String[] args) {
        String timezones[] = {
            "America/New_York",
            "Europe/London",
            "Asia/Tokyo",
            "Australia/Sydney",
            "Europe/Paris",
            "America/Los_Angeles",
            "Asia/Kolkata",
            "America/Chicago",
            "Europe/Berlin",
            "Asia/Shanghai",
            "America/Toronto",
            "Europe/Moscow",
            "Asia/Dubai",
            "America/Sao_Paulo",
            "Europe/Rome",
            "Asia/Singapore",
            "America/Mexico_City",
            "Europe/Madrid",
            "Asia/Seoul",
            "America/Vancouver",
            "Europe/Amsterdam",
            "Asia/Jakarta",
            "America/Argentina/Buenos_Aires",
            "Europe/Istanbul"
        };
        for (String t : timezones) {
            System.out.print(t + " : ");
            timeZone(t);
        }
    }
}
