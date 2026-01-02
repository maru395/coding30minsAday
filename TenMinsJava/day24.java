// (formerly day18) print out unique characters and their count on a string
package TenMinsJava;

import java.util.*;

public class day24 {
    public static String word = "Banana";
    public static void main(String[] args) {
        // gets the character and number of same characters in a word
        Map<Character, Integer> uniq = new LinkedHashMap<>();
        for (Character c : word.toCharArray()) {
            //updates the map, put is like push, getOrDefault returns frquency for char
            uniq.put(c, uniq.getOrDefault(c, 0)+ 1);
        }
        // creates an object that stores data of c and int for each pair taken from uniq
        for (Map.Entry<Character, Integer> entry : uniq.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
