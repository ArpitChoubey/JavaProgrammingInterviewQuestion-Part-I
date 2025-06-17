package src;

import java.util.Scanner;

public class Positionofword {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Statement : ");
		String Sentence = Scan.nextLine();
		System.out.println("Enter the word : ");
		String word = Scan.nextLine();
		int position = Sentence.indexOf(word);
		System.out.println("Position: " + position);
		if(position!=-1) {
			System.out.println("The word" + word + "Starts at index" +position);
		}else {
				System.out.println("The word" + word + "is not found in the Sentences");
				
			}
			
			
		}
		
		
		
		

	}


