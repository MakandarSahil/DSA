package Sorting;
import java.util.*;
import utils.ArrayUtils;

public class QuickSort {


    public static void main(String[] args){
        System.out.println("Quick Sort !!");

        int[] arr = ArrayUtils.takeArr();
        System.out.println("Before Quick Sort");
        ArrayUtils.printArr(arr);

        System.out.println("After Quick Sort");
        ArrayUtils.printArr(arr);
    }
}