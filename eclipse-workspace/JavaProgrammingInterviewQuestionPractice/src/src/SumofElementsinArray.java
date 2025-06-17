package src;
public class SumofElementsinArray {
    public static void main(String[] args) {
        int a [] = {12,5,6,8,9,12,7};
        int sum=0;
        for(int num :a){
            sum+=num;
        }
        System.out.println("The Sum of Elements in an Array :" +sum);
    }
}
