// split string using a delimiter
package TenMinsJava;

public class day10 {
    public static String word = "hello world";
    //contains the words with the space as delimiter
    public static String words [] = word.split(" ");
    public static void main(String[] args) {
        // for each
        for (String w : words) {
            System.out.println(w);
        }
    }
}
