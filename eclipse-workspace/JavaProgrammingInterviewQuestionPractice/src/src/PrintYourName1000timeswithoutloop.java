package src;

public class PrintYourName1000timeswithoutloop {

	public static void main(String[] args) {
		
		String name = " Arpit";
		String s = "i";
		s  = s.replaceAll("i", "iiiiiiiiii");
		s  = s.replaceAll("i", "iiiiiiiiii");
		s  = s.replaceAll("i", "iiiiiiiiii");
		
		s = s.replaceAll("i", name + "\n");
		System.out.println(s);
		
				
		

	}

}
