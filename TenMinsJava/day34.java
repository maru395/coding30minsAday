// print out the current date time but with the specific format: Mon Jan 13 2025 14:54:30
package TenMinsJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
;

public class day34 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("E MMM dd yyyy HH:mm:ss ");
        System.out.println(now.format(f));
    }
}
