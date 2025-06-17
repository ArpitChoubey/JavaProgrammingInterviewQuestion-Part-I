package src;
import java.util.Arrays;

public class SortArrayInNames {
    public static void main(String[] args) {
        String[] X = {"Ram", "Laxman", "Rahul", "Ankit", "Vikram", "Priya" };
        System.out.println("Before Sorting : ");
        for (String name:X){
            System.out.println(name);

        }
        Arrays.sort(X);
        System.out.println("/n After Sorting : ");
        for (String name:X){
            System.out.println(name);

        }
    }
}
