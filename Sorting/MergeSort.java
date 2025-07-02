package Sorting;
import java.util.*;
import utils.ArrayUtils;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temp array
        int left = low; // start index of left array
        int right = mid+1; // start index of right array

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on left side are still left
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        // if element on right side are still left
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        //transfer elements from temp to arr
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
    public static void mSort(int[] arr, int low, int high){
//        int n = arr.length;
        if(low >= high) return;
        int mid = (low + high) / 2;
        mSort(arr, low, mid); //left array
        mSort(arr, mid+1, high); //right array
        merge(arr, low, mid, high);
    }
    public static void main(String[] args){
        System.out.println("Merge Sort !!");

        int[] arr = ArrayUtils.takeArr();
        System.out.println("Before Merge Sort");
        ArrayUtils.printArr(arr);

        mSort(arr, 0, arr.length-1);
        System.out.println("After Merge Sort");
        ArrayUtils.printArr(arr);
    }
}