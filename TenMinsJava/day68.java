// Check if password hash file exists, ask for a new password if not, if it exists, ask for the password, then validate using the stored hash txt file
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class day68 {
    public static String getSha1(String s) {
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA1");
            byte[] b = sha.digest(s.getBytes());
            BigInteger n = new BigInteger(1, b);
            String newP = n.toString(16);
            while (newP.length() < 40) {
                newP = "0" + newP;
            }
            return newP;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            File f = new File("D:/coding30minsAday/textFiles/textDay71J.txt");
            if (f.exists()) {
                Scanner scan = new Scanner(System.in);
                System.out.println("enter password");
                String p = scan.nextLine();
                Scanner fScan = new Scanner(f);
                while (fScan.hasNextLine()) {
                    if (fScan.nextLine().trim().equals(getSha1(p))) {
                        System.out.println("nice");
                        break;
                    }
                    else {
                        System.out.println("missing");
                        break;
                    }
                }
                fScan.close();
                scan.close();
            }
            else {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter new password");
                String p = scan.nextLine();
                FileWriter w = new FileWriter(f);
                w.write(getSha1(p));
                w.close();
                scan.close();
            }
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
