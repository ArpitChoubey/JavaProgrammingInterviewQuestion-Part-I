package src;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberString {

	public static void main(String[] args) {
		
		Random Rand = new Random();
		int b = Rand.nextInt(100);
		System.out.println(b);
		
		System.out.println(Math.random());
		
		
		
		
		String randNum = RandomStringUtils.randomNumeric(6);
		
		System.out.println(randNum);
		
		String ranstr = RandomStringUtils.randomAlphabetic(6);
		
		System.out.println(ranstr);
	}

}
