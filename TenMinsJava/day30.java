// Create a function roll() that generates 2 numbers between 1 to 6
package TenMinsJava;

public class day30 {
    public static void roll() {
        double one = Math.floor(Math.random() * 6) + 1;
        double two = Math.floor(Math.random() * 6) + 1;
        System.out.println(one);
        System.out.println(two);
    }
    public static void main(String[] args) {
        roll();
    }
}
