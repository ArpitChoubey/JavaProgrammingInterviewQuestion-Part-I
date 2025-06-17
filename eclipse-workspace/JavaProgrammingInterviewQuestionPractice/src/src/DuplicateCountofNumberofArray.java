package src;
public class DuplicateCountofNumberofArray {
    public static void main(String[] args) {
    	
        int a[] = {22, 33, 44, 66, 99, 101, 55, 33,99,66,33,22,33, 888, 999, 1122};
        int num = 1;
        int count = 0;
        for(int x : a){
            if(num == x){
                count++;

            }
            System.out.println(x);
        }
    }
}
