// Ask for a password input and save to a txt file as sha256 hash
package TenMinsJava;

import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class day66 {
    public static String shai256(String x) {
        try {
            MessageDigest s = MessageDigest.getInstance("SHA256");
            byte [] n = s.digest(x.getBytes());
            BigInteger N = new BigInteger(1, n);
            String shai256 = N.toString(16);
            while (shai256.length() < 64) {
                shai256 = "0" + shai256;
            }
            return shai256;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter password");
            String s = scan.nextLine();
            String path = "D:/coding30minsAday/textFiles/textDay70J.txt";

            FileWriter w = new FileWriter(path);
            w.write(shai256(s));
            w.close();
            scan.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
