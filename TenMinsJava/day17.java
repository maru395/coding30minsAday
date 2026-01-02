// print out unique characters from a string using built-in array-unique function or it's equivalent
package TenMinsJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class day17 {
    public static void main(String[] args) {
        String name = "Banana";
        Set<Character> chr = new LinkedHashSet<>();
        for (Character character : name.toCharArray()) { // need toCharArray because foreach only applicable to arrays
            chr.add(character);
        }
        // other way to print
        StringBuilder result = new StringBuilder();
        for (Character character : chr) {
            result.append(character);
        }
        System.out.println(result);
    }
}
