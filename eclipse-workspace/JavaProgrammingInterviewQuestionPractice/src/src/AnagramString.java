package src;

import java.util.Arrays;

public class AnagramString {
	
	public static boolean isAnagram(String S1,  String S2) {
		
		String Str1 = S1.replaceAll("\\s", "");
		String Str2 = S2.replaceAll("\\s", "");
		
		if(Str1.length()!=Str2.length()) {
			return false;
			
		} else {
			char c1[]= Str1.toLowerCase().toCharArray();
			char c2[]= Str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
			
		}	
	}

	public static void main(String[] args) {
		
		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("Lives", "Elivs"));
		System.out.println(isAnagram("CAT", "ACT"));
		System.out.println(isAnagram("JOY", "Enjoy"));

	}

}
