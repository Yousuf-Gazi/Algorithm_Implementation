package Sorting;

import java.util.Arrays;

public class BubbleSortIterative {

    public static void bubbleSortingIterative(int[] arr) {
        for (int lastUnsortedPosition = arr.length; lastUnsortedPosition > 1; lastUnsortedPosition--) {
            for (int i = 0; i < lastUnsortedPosition - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    return;
                }
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {
                -22, 30, -15, 6, 2, 10, 5
        };
        bubbleSortingIterative(arr);
        System.out.println(Arrays.toString(arr));
    }

}
