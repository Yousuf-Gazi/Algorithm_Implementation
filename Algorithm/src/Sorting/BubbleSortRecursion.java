package Sorting;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static void swap(int[] arr, int i, int lastUnsortedPosition) {
        if (i == lastUnsortedPosition) {
            return;
        }
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        swap(arr, i + 1, lastUnsortedPosition);
    }

    public static void bubbleSorting(int[] arr, int lastUnsortedPosition) {
        if (lastUnsortedPosition == 1) {
            return;
        }
        swap(arr, 0, lastUnsortedPosition);
        bubbleSorting(arr, lastUnsortedPosition - 1);
    }

    public static void main(String[] args) {
        int[] arr = {
                -22, 30, -15, 6, 2, 10, 5
        };
        bubbleSorting(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
