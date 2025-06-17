package src;
import java.util.Arrays;

public class ReverseAArray {
    public static void main(String[] args) {
        int arr[] = {22, 33, 44, 66, 99, 101, 55, 888, 999, 1122};
        int rev[] = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--, index++) {
            rev[index] = arr[i];

        }
        for(int x=0;x<rev.length;x++){
            System.out.println(rev[x]);
        }
       // System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(rev));
    }
}


