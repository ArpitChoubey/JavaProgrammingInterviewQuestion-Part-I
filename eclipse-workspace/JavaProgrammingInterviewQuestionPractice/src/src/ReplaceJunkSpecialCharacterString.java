package src;

public class ReplaceJunkSpecialCharacterString {

	public static void main(String[] args) {
		
		String S = "@@@@@@@$$$$$$$$$$$$$*****ABCDEFGH***********@@^^^^^^*****####@@@latina123987643333";
		S = S.replaceAll( "[^a-z]" , " ");
		System.out.println(S);
		

	}

}
