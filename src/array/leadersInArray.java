package array;
import java.util.ArrayList;

public class leadersInArray {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int current_lead = arr[n-1];
        ArrayList<Integer> leadArr = new ArrayList<Integer>();
        for(int i = n-2; i >=0; i--){
            if(current_lead < arr[i]){
                leadArr.add(arr[i]);
                current_lead = arr[i];
            }
        }
        leadArr.reversed();

        return leadArr;
    }

    
}
