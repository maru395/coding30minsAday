// Check if the string matches email pattern .+\@.+\..+
package TenMinsJava;

import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scan.nextLine();
        if (s.matches(".+\\@.+\\..+")) {
            System.out.println("good man");
        }
        else {
            System.out.println("nah man");
        }
    }
}
