package Sorting;

import java.util.*;
import utils.ArrayUtils;

public class InsertionSort {

    public static void iSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i ++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Insertion Sort !!");

        int[] arr = ArrayUtils.takeArr();
        System.out.println("Before Insertion Sort : ");
        ArrayUtils.printArr(arr);

        iSort(arr);
        System.out.println("After Insertion Sort : ");
        ArrayUtils.printArr(arr);
    }
}