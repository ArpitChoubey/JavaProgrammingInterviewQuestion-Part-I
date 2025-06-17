package src;
public class Factorial {

    public static void main(String[] args) {
        int num =9;
        long factorial = multiplyNumber(num);
        System.out.println("Factorial of " + num +" =" +factorial);
    }
    public static long multiplyNumber(int num){
        if(num>=1)
            return num * multiplyNumber(num-1);
        else
            return 1;

    }
}
