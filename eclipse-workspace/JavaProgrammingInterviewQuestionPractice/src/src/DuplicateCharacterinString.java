package src;

public class DuplicateCharacterinString {

	public static void main(String[] args) {
		
		String Str = new String("AutomationTesting");
		
		int count = 0;
		char[] ch = Str.toCharArray();
		for(int i =0; i <ch.length; i++) {
			for(int j =i+1; j <ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate Character in String are : " +ch[j]);
					count++;
				}
				
				
			}
		}
		System.out.println("Duplicate Character Count : " +count);
		
		

	}

}
