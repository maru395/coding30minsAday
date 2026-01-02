//capitalize(uppercase first letter of each word) strings using built in function

package TenMinsJava;

public class day5 {
    public static String word = "capitalize me";
    static void capitalize(String word) {
        word = word.trim();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (i == 0) {
                System.out.print(Character.toUpperCase(c));
            }
            else if (word.charAt(i - 1) == ' ') {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
    }
    public static void main(String[] args) {
        capitalize(word);
    }
}
