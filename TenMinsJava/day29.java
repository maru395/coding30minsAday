// Create a function greatest(x,y,z) that returns which of the 3 given numbers are greater (using > or < signs)
package TenMinsJava;

public class day29 {
    public static void greatest(int x, int y, int z) {
        int greatest = x;
        if (greatest < y) {
            greatest = y;
        }
        if (greatest < z) {
            greatest = z;
        }
        System.out.println(greatest);
    }
    public static void main(String[] args) {
        greatest(1,3, 2);
    }
}
