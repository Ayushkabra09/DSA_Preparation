package array;
public class checkSortedArray {
    public static void main(String[] args) {

    }

    static boolean checkSorted(int arr[]) {

        int sizeOfArray = arr.length;
        if (sizeOfArray == 1)
            return true;
        if (arr[0] > arr[sizeOfArray - 1])
            return false;
        boolean isSorted = true;
        for (int i = 0; i < sizeOfArray - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}
