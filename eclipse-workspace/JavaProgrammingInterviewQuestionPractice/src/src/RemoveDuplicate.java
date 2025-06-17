package src;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 6, 6, 7, 8, 8, 9};

        int len = arr.length;

        Arrays.sort(arr);

        int[] temp = new int[len];
        int j = 0;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }


        temp[j++] = arr[len - 1];


        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}









