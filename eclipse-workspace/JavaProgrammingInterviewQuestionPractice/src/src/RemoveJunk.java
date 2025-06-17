package src;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String S = "a^$#&*#@?latinStatement*****$#^^^^ 012346987";
		S = S.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(S);

	}

}
