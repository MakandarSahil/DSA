package Sorting;
import java.util.*;
import utils.ArrayUtils;

public class BubbleSort{

    public static void bSort(int[] arr){
        int n = arr.length;

        for (int i = n-1; i >= 0; i--){

            //iterate from 0 to last swapped (correctly positioned ) element
            //swap if adject is smaller
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void RecursiveBsort(int[] arr , int n){

        if(n == 1) return;
        for(int i = 0; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        RecursiveBsort(arr, n-1);
    }
    public static void main(String[] args){
        System.out.println("Bubble Sort");
        int[] arr = ArrayUtils.takeArr();

        System.out.println("Before Sorting");
        ArrayUtils.printArr(arr);

        bSort(arr);
        System.out.println("After Bubble Sorting");
        ArrayUtils.printArr(arr);

        RecursiveBsort(arr, arr.length);
        System.out.println("After Recursive Bubble Sorting");
        ArrayUtils.printArr(arr);
    }
}