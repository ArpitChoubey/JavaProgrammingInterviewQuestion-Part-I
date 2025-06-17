package src;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your String:");

        String Str = Sc.next();

        String org_Str = Str;
        String rev = "";

        int len = Str.length();
        for (int i = len - 1; i >= 0; i--) {  
            rev = rev + Str.charAt(i);
        }
        if (org_Str.equalsIgnoreCase(rev)) {
            System.out.println(org_Str + " is a Palindrome String");
        } else {
            System.out.println(org_Str + " is not a Palindrome String");
        }

        Sc.close(); 
    }
}