package src;
public class ReverseNumber {

    public static void main(String[] args) {
        int num = 1234567,reverse =0;
        
        for(;num!=0; num/=10){
            int digit = num%10;
            reverse = reverse *10+digit;
            
        }
        System.out.println("reversed Number : " + reverse );
    }
}
