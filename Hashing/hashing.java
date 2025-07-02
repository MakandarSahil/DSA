package Hashing;
import java.util.*;

public class hashing{
    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.println("Array Element : "+ i + " ");
        }
    }

    //brute force approch;
    public static int FindNumberCount(int number, int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                count+=1;
            }
        }
        return count;
    }



    public static void main(String[] args){
//        System.out.println("hii i am java !!");
        int[] arr = {1, 3, 2, 1, 3};
//        printArr(arr);
        int total = FindNumberCount(3, arr);
        System.out.println("Number Appeared " + total + " times");


        //using hashing
        //precomputations
        //consider max size 12
        int[] hash = new int[13];
        for(int i = 0; i < arr.length; i++){
            hash[arr[i]] += 1;
        }

//        printArr(hash);
        System.out.println("Total number of time 1 appered : " + hash[1]);

    }
}