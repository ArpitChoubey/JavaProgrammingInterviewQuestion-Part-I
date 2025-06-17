package src;

public class FindVowelinaString {

	public static void main(String[] args) {
		
		String Str = "Automation";
		
		for(int i =0; i< Str.length(); i++)
			if(Str.charAt(i)=='a'||Str.charAt(i)=='e'|| Str.charAt(i)=='i'|| Str.charAt(i)=='o'|| Str.charAt(i)=='u' )
				
			{
				System.out.println("Vowel present "+Str.charAt(i)+" at index " +i );
			}
			
		}
			
			
			
			

	}


