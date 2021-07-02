package Recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {
                10, 20, 30, 40, 50
        };
        int result = linearSearch(arr, 30, 0);
        System.out.println(result);
    }
    public static int linearSearch(int[] arr, int number, int count) {
        if (count >= arr.length) {
            return -1;
        }
        if (arr[count] == number) {
            return count;
        }
        count++;
        return linearSearch(arr, number, count);
    }

}
