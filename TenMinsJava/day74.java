// Ask for a password input, if new, require strong password and register, if password exists(hashed password txt file), require existing password
package TenMinsJava;

import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

public class day74 {
    public static String checkPass(String s) {
        String result;
        if (s.length() >= 8) {
            int passScore = 0;
            ArrayList<Character> usedLetters = new ArrayList<>();
            ArrayList<Character> usedSigns = new ArrayList<>();
            for (Character c : s.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    result = "error";
                }
                else {
                    if (Character.isAlphabetic(c)) {
                        c = Character.toUpperCase(c);
                        if (!usedLetters.contains(c)) {
                            usedLetters.add(c);
                        }
                        else {
                            passScore -= 5;
                        }
                    }
                    else {
                        if (!usedLetters.contains(c)) {
                            usedSigns.add(c);
                        }
                        else {
                            passScore -= 5;
                        }
                    }
                }
            }
            // pwede ilagay sa taas
            int upper = 0;
            int lower = 0;
            for (Character c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upper++;
                }
                if (Character.isLowerCase(c)) {
                    lower++;
                }
            }
            for (int i = 0; i < usedLetters.size() + usedSigns.size(); i++) {
                passScore += 3;
            }
            if (passScore <= 10 || usedSigns.size() <= 2 || Math.abs(upper - lower) > 2) {
                result = "weak";
            } 
            else if (passScore >= 11 && passScore <= 19 || usedSigns.size() <= 3 || Math.abs(upper - lower) < 2) {
                result = "moderate";
            } 
            else if (passScore >= 20 || usedSigns.size() <= 4) {
                result = "strong";
            } 
            else {
                result = "error";
            }
        }
        else {
            result = "error";
        }
        return result;
    }
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
            File f = new File("D:/coding30minsAday/textFiles/textDay74J.txt");
            if (f.exists()) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter password");
                String s = scan.nextLine();
                if (checkPass(s).equals("strong") || checkPass(s).equals("moderate")) {
                    Scanner fScan = new Scanner(f);
                    while (fScan.hasNextLine()) {
                            if (fScan.nextLine().trim().equals(getSha1(s))) {
                                System.out.println("nice");
                                break;
                            }
                            else {
                                System.out.println("missing");
                                break;
                            }
                    }
                    fScan.close();
                }
                scan.close();
            }
            else {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter password");
                String s = scan.nextLine();
                FileWriter w = new FileWriter("D:/coding30minsAday/textFiles/textDay74J.txt");
                w.write(getSha1(s));
                w.close();
                scan.close();
            }
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}