package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSorting {

    public static void insertionSort(int[] arr){
        for(var i =0 ;i<arr.length;i++){
            var current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }


        System.out.println(Arrays.toString(arr));
    }
}
