package src;
import java.util.Scanner;

public class Digital_Sum {

    public static void main(String[] args) {
        int m,n,sum=0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Number :");
        m= S.nextInt();
        while(m>0)
        {
          n=m%10;
            int Sum = sum + n;
          m=m/10;

        }
        System.out.println("Sum of digits : "+sum);

    }

}
