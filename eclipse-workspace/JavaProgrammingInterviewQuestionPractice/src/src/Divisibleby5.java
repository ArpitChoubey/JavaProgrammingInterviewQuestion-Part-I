package src;
import java.util.Scanner;

public class Divisibleby5 {

    public static void main(String[] args) {
        Scanner Sc;
        Sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = Sc.nextInt();
        if(n%5==0)
            System.out.println("Number is divisible by 5.");
        else
            System.out.println("Number is not divisible by 5.");
            Sc.close();


    }
}
