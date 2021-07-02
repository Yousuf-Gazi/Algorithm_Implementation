package Sorting;

import java.util.Arrays;

public class MergeSortRecursion {

    public static void mergeSorting(int[] arr) {
        //breakpoint for recursion (we don't have to sort for 1 element that's why length < 2)
        if (arr.length < 2) {
            return;
        }

        //dividing half
        int mid = arr.length / 2;

        //allocating left partition
        int[] left = new int[mid];
        //assigning left partition
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        //allocating right partition
        int[] right = new int[arr.length - mid];
        //assigning right partition
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        //sorting each half
        mergeSorting(left);
        mergeSorting(right);

        //merging
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                resultIndex++;
                leftIndex++;
            }else {
                result[resultIndex] = right[rightIndex];
                resultIndex++;
                rightIndex++;
            }
        }

        //when the left array length and right array length is not equal
        while (leftIndex < left.length) {
            result[resultIndex] = left[leftIndex];
            resultIndex++;
            leftIndex++;
        }
        while (rightIndex < right.length) {
            result[resultIndex] = right[rightIndex];
            resultIndex++;
            rightIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {
                32, 15, -2, -5, -29, 35, -55, 27
        };
        mergeSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

}
