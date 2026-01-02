// Ask for a password and validate using a stored hash on txt file
package TenMinsJava;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class day67 {
    public static String getSha256(String x) {
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA256");
            byte [] b = sha.digest(x.getBytes());
            BigInteger n = new BigInteger(1, b);
            String newSha = n.toString(16);
            while (newSha.length() < 64) {
                newSha = "0" + newSha;
            }
            return newSha;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter password");
            String newP = getSha256(scan.nextLine());
            scan.close();
            File path = new File("D:/coding30minsAday/textFiles/textDay70J.txt");
            
            Scanner fileS = new Scanner(path);
            while (fileS.hasNextLine()) {
                if (fileS.nextLine().trim().equals(newP)) {
                    System.out.println("match");
                }
                else {
                    System.out.println("mismatch");
                }
            }
            fileS.close();
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
