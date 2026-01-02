// print out current unix timestamp in seconds and milliseconds using built in functions if available

package TenMinsJava;

public class day33 {
    public static void main(String[] args) {
        long sec = System.currentTimeMillis()/1000;
        long millisec = System.currentTimeMillis();
        System.out.printf("Seconds: %d %nMiliseconds: %d", sec, millisec);
    }
}
