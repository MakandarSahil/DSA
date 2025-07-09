//package Array;

import java.util.*;

public class LargetElement {

    //sorting and returning max value
    public static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //using max variable
    public static int FindLarget(int[] arr){
        int max = -1;
        for(int num : arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }


    //finding second larget numebr in the array
    public static int SecondLargets(int[] arr){
        //find min and max element
        int min = -1;
        int max = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //find element whihc is greater than min and smaller than max
        int result = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > min && arr[i] < max){
                result = arr[i];
            }
        }
        return result;
    }

    //second largets number - optimal approch
    public static int OptimalSecondLarget(int[] arr){
        int n = arr.length;
        if(n < 2) return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int i;
        for(i = 0; i < n; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5,10};

        //brute force approch - sort the array and print the last index;
//        System.out.println("The Largest element in the array is: " + sort(arr));

        //using a max variable
//        System.out.println("The larget element using max var is : " + FindLarget(arr));

        System.out.println("The second largets element without sorting : " + SecondLargets(arr));
        System.out.println("The second largets element without sorting (optimal) : " + OptimalSecondLarget(arr));
    }
}