package src;

public class CountCharacterOccurrence {

	public static void main(String[] args) {
		
		String S = " Java Automation Java Programming";
		int totalcount  = S.length();
		
		int totalcount_afterRemove = S.replace("a","").length();
		
		int count = totalcount - totalcount_afterRemove;
		
		System.out.println("Number Occurrances of a is :" +count);
		
		
		
		
		

	}

}
