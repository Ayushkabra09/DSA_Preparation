package array;
public class moveZerosAtEndOfArray {
    public static void main(String[] args) {

    }

    static int[] moveZeros(int arr[]) {

        int sizeOfArray = arr.length;

        if (sizeOfArray == 1) {
            return arr;
        }
        int count = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        return arr;
    }
}
