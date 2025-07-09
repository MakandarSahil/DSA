import java.util.*;

public class IsSorted {

    //brute force approch
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        int swap = 0;
        for(int i = n-1; i >=0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    swap++;
                    break;
                }
            }
        }
        if (swap > 0) return false;
        return true;
    }

    //optimal approch - single traversal
    public static boolean OptimalIsSorted(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,-4};
        System.out.println("Is Array already sorted : " + isSorted(arr));
        System.out.println("Is Array already sorted : " + OptimalIsSorted(arr));
    }
}