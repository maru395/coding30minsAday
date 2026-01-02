// Ask for a input, print out the unique characters on that input
package TenMinsJava;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class day18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scan.nextLine();
        Set<Character> st = new LinkedHashSet<>();
        for (Character character : input.toCharArray()) {
            st.add(character);
        }
        StringBuilder result = new StringBuilder();
        for (Character character : st) {
            result.append(character);
        }
        System.out.println(result);
    }
}
