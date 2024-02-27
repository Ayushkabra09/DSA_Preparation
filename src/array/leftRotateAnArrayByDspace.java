package array;
import java.util.Arrays;

public class leftRotateAnArrayByDspace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 3;

        arr = rotateLeft(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    static int[] rotateLeft(int arr[], int d){
        int sizeOfArray = arr.length;

        arr = reverseArray(arr, 0,d-1);
        arr = reverseArray(arr, d,sizeOfArray-1);
        arr = reverseArray(arr, 0,sizeOfArray-1);

        return arr;
    }

    static int[] reverseArray(int[] arr, int start, int end){

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
