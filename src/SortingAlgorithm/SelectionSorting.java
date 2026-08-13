package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSorting {



    public static void selectionSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                    continue;

                }
            }
        }
        System.out.println(Arrays.toString(arr));


        for(int k : arr){
            System.out.print(k+" ");
        }
    }


    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
