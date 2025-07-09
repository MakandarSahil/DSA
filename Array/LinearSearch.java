import java.util.*;

public class LinearSearch {
    public static int linearSearch(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = { 1, 29, 10, 3, 5};
        int num = 29;
        System.out.println("Element index: " + linearSearch(arr, num));
    }
}