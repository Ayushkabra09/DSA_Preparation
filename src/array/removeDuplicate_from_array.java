package array;
public class removeDuplicate_from_array {
    public static void main(String[] args) {
        
    }
    static int removeDuplicates(int arr[]){

        int sizeOfArray = arr.length;
        if (sizeOfArray == 1) {
            return 1;
        }
        int res = 1;

        for(int i = 1; i < sizeOfArray; i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }
}
