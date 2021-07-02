package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSorting(int[] arr) {
        for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex++) {
            int minIndex = sortedIndex;
            for (int unsortedIndex = sortedIndex; unsortedIndex < arr.length; unsortedIndex++) {
                if (arr[minIndex] > arr[unsortedIndex]) {
                    minIndex = unsortedIndex;
                }
            }
            swap(arr, sortedIndex, minIndex);
        }
    }

    public static void swap(int[] arr, int sortedIndex, int minIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[sortedIndex];
        arr[sortedIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {
                -2, 15, 32, -5, -29, 35
        };
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

}
