package src;
public class MaxMinINArray {
    public static void main(String[] args) {
        int a [] = {12,5,6,8,9,12,7};
        int min = a[0];
        int max = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]>max){
                max=a[i];

            }
            System.out.println("Maximum value in a Array :" +max);
            System.out.println("Minimum value in a Array: " +min);
        }
    }
}
