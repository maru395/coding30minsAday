//  Ask for a password input and save to a txt file as md5 hash
package TenMinsJava;

import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class day64 {
    // convertion
    public static String getMD5(String x) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte [] md2 = md.digest(x.getBytes());
            BigInteger n = new BigInteger(1, md2);
            String s = n.toString(16);
            while (s.length() < 32) {
                s = "0" + s;
            }
            return s;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }   
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter password");
            String s = scan.nextLine();
            String path = "D:/coding30minsAday/textFiles/textDay68J.txt";

            FileWriter w = new FileWriter(path);
            w.write(getMD5(s));
            w.close();
            scan.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
