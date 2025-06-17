package src;
public class SmallestAArray {
    public static void main(String[] args) {
        int a [] = {12,5,6,8,9,12,7};
        int smallest = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
                smallest = a[i];
            }
            System.out.println("The Smallest numbers of a array :"+smallest);
        }
    }
}
