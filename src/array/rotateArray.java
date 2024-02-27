package array;
public class rotateArray {
    public static void main(String[] args) {

    }

    static int[] rotateArray(int arr[]) {

        int sizeOfArray = arr.length;
        if (sizeOfArray == 1) {
            return arr;
        }

        
        int start = 0;
        int end = sizeOfArray - 1;

        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }


        return arr;
    }

}
