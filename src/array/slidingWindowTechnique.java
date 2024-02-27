package array;

public class slidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        System.out.println(slideWindow(arr, k));

    }

    static int slideWindow(int[] arr, int k){

        int n = arr.length;

        //inititalize -> take first k elements
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for(int i = 0; i< k; i++){
            windowSum += arr[i];
        }

        for(int j = k; j < n; j++){
            windowSum += arr[j] - arr[j-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
