package Sorting;
import java.util.*;
import utils.ArrayUtils;

public class SelectionSort{

    public static void sSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            //consider ith index as minimum value
            //iterate through whole array find whihc has less value than ith index
            //change minindex value to that index
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        System.out.println("Selection Sort");

        int[] arr = ArrayUtils.takeArr();

        System.out.print("Before Sorting ");
        ArrayUtils.printArr(arr);

        sSort(arr);
        System.out.print("After Sorting ");
        ArrayUtils.printArr(arr);

    }
}