package src;

public class RemoveWhiteSpacesinString {

	public static void main(String[] args) {
		
		String S = "Java Automation     Programming     Selenium";
		System.out.println("Before removing the White Spaces :" +S);
		S = S.replaceAll("\\s", "");
		System.out.println("After removing the White Spaces :" +S);
		
	}

}
