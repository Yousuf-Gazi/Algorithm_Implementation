package Sorting;

import java.util.Arrays;

public class InsertionSortRecursion {

//    public static void shifting(int[] arr, int sortedIndex, int current) {
//        if (arr.length < 2) {
//            return;
//        }
//        if (arr[sortedIndex] > current) {
//            arr[sortedIndex + 1] = arr[sortedIndex];
//        }
//        sortedIndex--;
//        shifting(arr, sortedIndex, current);
//    }

    public static void insertionSorting(int[] arr, int unsortedIndex) {
        if (unsortedIndex == arr.length) {
            return;
        }
        int current = arr[unsortedIndex];
        int sortedIndex = unsortedIndex - 1;

//        shifting(arr, sortedIndex, current);
        while (sortedIndex >= 0 && arr[sortedIndex] > current) {
            arr[sortedIndex + 1] = arr[sortedIndex];
            sortedIndex--;
        }
        //placing current in the sorted position
        arr[sortedIndex + 1] = current;
        insertionSorting(arr, unsortedIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {
                5, -22, 30, -15, 6, 2, 10
        };
        insertionSorting(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

}
