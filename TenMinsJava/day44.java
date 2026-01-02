// Censor the word fuck and dead with constant length asterisk
package TenMinsJava;

import java.util.Scanner;

public class day44 {
    public static void checkWord(String w) {
        String badword [] = {"fuck", "dead"};
        for (int i = 0; i < badword.length; i++) {
            if (w.toLowerCase().contains(badword[i])) {
            String word = "*".repeat(badword[i].length());
            w = w.replace(badword[i], word);
            }
        }
        System.out.println(w);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String inp = scan.nextLine();
        checkWord(inp);
    }
}
