package src;
public class LinearArray {
    public static void main(String[] args) {
        int arr[] = {22, 33, 66, 555, 99999, 55555555, 666666666, 9999999, 44, 66, 99, 101, 55, 888, 999, 1122};
        int num = 999;
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("number is found in the Array ");
                status = true;
                break;
            }
            if (status == false) {
                System.out.println("number is not found in the Array");
            }
        }
    }
}
