// Check if string is 8 digits or 11 or starting with +, plus 12 digits (+63)
package TenMinsJava;

import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Enter phone number");
        String s = scan.nextLine();
        checkNum(s);
    }

    public static void checkNum(String s) {
        if (s.length() == 8) {
            if (s.matches("\\d+")) { 
                System.err.println("nice"); 
            }
            else { 
                System.err.println("nah"); 
            }
        }
        if (s.length() == 11){
            if (s.matches("\\d+")) { 
                System.err.println("nice"); 
            }
            else {
                System.err.println("nah"); 
            }
        }
        if (s.charAt(0) == '+' && s.length() == 13){
            s = s.substring(1);
            if (s.matches("\\d+")) {
                System.err.println("nice"); 
            }
            else {
                System.err.println("nah"); 
            }
        }
        else {
            System.err.println("nah bro");
        }
    }
}