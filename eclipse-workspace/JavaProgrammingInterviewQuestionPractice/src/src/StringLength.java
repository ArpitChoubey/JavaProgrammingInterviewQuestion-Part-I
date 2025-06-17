package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

	public static void main(String[] args) {

                 
		String str = "AutomationTesting";
		System.out.println(str.toCharArray().length);
		
		System.out.println(str.lastIndexOf(""));
		
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);
		
		System.out.println(str.split("").length-1);
		
		
		
	}

}
