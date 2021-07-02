package Sorting;

import java.util.Arrays;

public class QuickSortRecursion {

    public static void quickSort(int[] arr) {
        sorting(arr, 0, arr.length - 1);
    }

    //sorting left and right partition
    public static void sorting(int[] arr, int start, int end) {
        //if there's a single element or no element, recursion will break
        if (start >= end) {
            return;
        }

        //storing the partition function which return boundary
        int boundary = partition(arr, start, end);

        //sorting left partition
        sorting(arr, start, boundary - 1);
        //sorting right partition
        sorting(arr, boundary + 1, end);
    }

    //finding the boundary by partitioning
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start - 1;

        //iterating till the end of the partition & checking the array with pivot
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                boundary++;
                swap(arr, i, boundary);
            }
        }

        return boundary;
    }

    //for swap
    public static void swap(int[] arr, int i, int boundary) {
        int temp = arr[i];
        arr[i] = arr[boundary];
        arr[boundary] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {
                32, 15, -2, -5, -29, 35, -55, 27, 2 ,-8, 7, 85, 7
        };
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
