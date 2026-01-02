// Create a function that will subtract y from x, but only until zero
package TenMinsJava;

public class day27 {
    public static void sub(int x, int y) {
        boolean t = true;
        int sum;
        while (t) {
            if (x - y <= 0) {
                System.out.println(0);
                t = false;
            }
            else {
                sum = x - y;
                x = sum;
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        sub(100, 10);
    }
}