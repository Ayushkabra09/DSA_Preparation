package array;
public class secondLargetsElementInArray {
    public static void main(String[] args) {
        
    }

    static int scondLargest(int arr[]){

        int largest = 0;
        int res = -1;

        for (int i = 1; i < arr.length; i++){
           if (arr[i] > arr[largest]) {
            res = largest;
            largest = i;
           }else if (arr[i] != arr[largest]) {
            if (res == -1 || arr[i] > arr[res]) {
                res = i;
            }
           } 
        }
        return res;

    }
}
