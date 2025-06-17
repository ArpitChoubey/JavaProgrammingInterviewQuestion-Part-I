package src;
public class EvenOddfromArray {
    public static void main(String[] args) {
        int[]x = {10,20,30,64,37,98,88,66,99,67,47,35,55,77,29,31};
        System.out.println("Even Number in the Array : ");
        for(int num : x) {
            if(num%2==0) {
                System.out.println(num + " ");
            }

        }
        System.out.println("/n Odd number in the Array : ");
        for(int num : x) {
            if (num % 2 != 0) {
                System.out.println(num + " ");
            }

        }
    }
}
