package src;
public class MissingNumberinArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int n = a.length +1;
        int totalsum = n * (n+1)/2;
        int arraysum = 0;
        for(int num : a){
            arraysum += num;
        }
        int missingNumber = totalsum - arraysum;
        System.out.println("The Missing Number is :" +missingNumber);
    }
}
