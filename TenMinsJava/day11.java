// split string to an array of (single) characters
package TenMinsJava;

public class day11 {
    public static String word = "hello world";
    public static char chars [] = word.toCharArray(); //built in function
    public static void main(String[] args) {
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
