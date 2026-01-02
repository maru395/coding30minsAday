// Ask for a password input and save to a txt file as sha1 hash
package TenMinsJava;

import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class day65 {
    public static String getShai(String s) {
        try {
            MessageDigest shai = MessageDigest.getInstance("SHA1");
            byte [] b = shai.digest(s.getBytes());
            BigInteger n = new BigInteger(1, b);
            String sShai = n.toString(16);
            while (sShai.length() < 40) {
                sShai = "0" + sShai;
            }
            return sShai;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter password");
            String s = scan.nextLine();
            String path = "D:/coding30minsAday/textFiles/textDay69J.txt";

            FileWriter w = new FileWriter(path);
            w.write(getShai(s));
            w.close();
            scan.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
