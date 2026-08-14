package SortingAlgorithm;

import static SortingAlgorithm.BubbleSorting.bubbleSort;
import static SortingAlgorithm.InsertionSorting.insertionSort;
import static SortingAlgorithm.SelectionSorting.selectionSort;


public class Main {

    public static void main(String[] args) {

        int[] arr = {6,4,5,2,4,7,3,7,2,9,2,1,5,8,4,3,5,7};

//        bubbleSort(arr);

//        selectionSort(arr);
        insertionSort(arr);


    }
}
