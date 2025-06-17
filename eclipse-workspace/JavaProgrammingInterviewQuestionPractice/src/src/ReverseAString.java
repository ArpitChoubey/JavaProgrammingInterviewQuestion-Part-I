package src;

public class ReverseAString {

	public static void main(String[] args) {
	
		String S = "Selenium";
		
	   //StringBuffer Str= new StringBuffer(S);
	   // System.out.println(Str.reverse());
		
		int len = S.length();
		String rev = " ";
		for(int i = len -1;i>=0; i--) {
			rev = rev + S.charAt(i);
		}
	   
		System.out.println(rev);
}
}
