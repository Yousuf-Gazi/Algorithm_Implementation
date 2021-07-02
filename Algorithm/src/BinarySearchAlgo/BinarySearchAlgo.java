package BinarySearchAlgo;

public class BinarySearchAlgo {

    void binarySearch(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == number) {
                System.out.println("The number found in index " + mid);
                break;
            }else if (arr[mid] < number) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("The number doesn't exist!");
        }
    }

}
