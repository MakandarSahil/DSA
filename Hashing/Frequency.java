package Hashing;
import java.util.*;

public class Frequency {

    public static void CountFrq(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < n; i++){

            //if value already exit only increase count
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            //if value does not exit then add 1 to its position stating that it appeared one's
            else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxElem = -1, minElem = -1;


        //traverse through map and fing the value
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq){
                maxElem = element;
                maxFreq = count;
            }
            if(count < minFreq) {
                minElem = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxElem);
        System.out.println("The lowest frequency element is: " + minElem);
    }
    public static void main(String[] args){
        System.out.println("Program to find highest and lowest frequency in array using hashMap");
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        CountFrq(arr, n);
    }
}