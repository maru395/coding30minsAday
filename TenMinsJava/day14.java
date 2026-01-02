// split a name string into a char-array, then capitalize the first letter by overwriting char-array item zero, then reconstruct into a string
package TenMinsJava;

public class day14 {
    public static String name = "marvin";
    public static char letters[] = name.toCharArray();
    public static void main(String[] args) {
        letters[0] = Character.toUpperCase(letters[0]);
        String newS = new String(letters); //makes the char into strings
        System.out.println(newS);
    }
}
