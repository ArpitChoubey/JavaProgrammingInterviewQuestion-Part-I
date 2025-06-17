package src;
import java.util.Scanner;

public class AlphabetORVowel {
    public static  void main(String[] args) {
        System.out.println("Enter a Character : ");
        Scanner Sc = new Scanner(System.in);
        char ch = Sc.next().charAt(0);
        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            System.out.println(ch + "is Vowel ");
        }
        else{
            System.out.println(ch + "is Consonant ");
        }

    }
}
