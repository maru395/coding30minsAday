// Ask for a string input for numbers 1 to 10 in words (e.g. one, two...) then output it's translation in tagalog
package TenMinsJava;

import java.util.Scanner;
public class day23 {
    public static String english [] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    public static String tagalog [] = {"isa", "dalwa", "tatlo", "apat", "lima", "anim", "pito", "walo", "siyam", "sampu"};
    public static void translate(String input) {
        for (int i = 0; i < english.length; i++) {
            if (input.toLowerCase().equals(english[i])) {
                System.out.println(tagalog[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from one - ten");
        String input = scan.nextLine();
        translate(input);
        scan.close();
    }
}
