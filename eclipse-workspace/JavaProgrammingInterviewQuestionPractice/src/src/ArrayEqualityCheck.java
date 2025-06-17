package src;

import java.util.Arrays;

public class ArrayEqualityCheck {
    public static void main(String[] args) {
        int[] array1 = {2,3,4,8,9};
        int[] array2 = {2,3,4,8,9};

        boolean IsEqual= Arrays.equals(array1,array2);
        if(IsEqual){
            System.out.println("Both Array are Equal");

        }
        else{
            System.out.println("Both Array are Not Equal");
        }


    }
}
