package src;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumber {

	
		public static boolean areAnagramNumbers(int num1, int num2) {
	        
	        char[] num1D = String.valueOf(num1).toCharArray();
	        char[] num2D = String.valueOf(num2).toCharArray();
	        
	        Arrays.sort(num1D);
	        Arrays.sort(num2D);
	        
	        return Arrays.equals(num1D, num2D);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	      
	        if (areAnagramNumbers(num1, num2)) {
	            System.out.println(num1 + " and " + num2 + " are Anagram Numbers.");
	        } else {
	            System.out.println(num1 + " and " + num2 + " are NOT Anagram Numbers.");
	        }

	        scanner.close();
	    }
	

	}


