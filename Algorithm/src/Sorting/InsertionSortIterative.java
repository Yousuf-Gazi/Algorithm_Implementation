package Sorting;

import java.util.Arrays;

public class InsertionSortIterative {

    public static void insertionSorting(int[] arr) {
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            int current = arr[unsortedIndex];
            int sortedIndex = unsortedIndex - 1;
            while (sortedIndex >= 0 && arr[sortedIndex] > current) {
                arr[sortedIndex + 1] = arr[sortedIndex];
                sortedIndex--;
            }
            arr[sortedIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {
                5, -22, 30, -15, 6, 2, 10
        };
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

}
