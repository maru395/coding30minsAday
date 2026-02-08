// ask for an email input require gmail, yahoo or outlook only
package TenMinsJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class day105 {
    public static boolean checkEmail(String email) {
        String[] emailDomain = email.split("@");
        // slow approach
        
        // String[] allowed = {
        //     "gmail.com", "googlemail.com",
        //     "yahoo.com", "ymail.com", "rocketmail.com", "yahoo.co.uk", "yahoo.ca",
        //     "outlook.com", "hotmail.com", "live.com", "msn.com"
        // };

        // for (String s : allowed) {
        //     if (emailDomain[1].equals(s)) {
        //         return true;
        //     }
        // }

        // return false;

        //faster approach
        Set<String> ALLOWED_DOMAINS = new HashSet<>(Arrays.asList(
            "gmail.com", "googlemail.com",
            "yahoo.com", "ymail.com", "rocketmail.com", "yahoo.co.uk", "yahoo.ca",
            "outlook.com", "hotmail.com", "live.com", "msn.com"
        ));

        return ALLOWED_DOMAINS.contains(emailDomain[1]);
    }
    public static void main(String[] args) {
        System.out.println(checkEmail("clausmarvinhipolito@gmail.com"));
    }
}
