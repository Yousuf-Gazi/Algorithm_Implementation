package Recursion;

public class Fibonacci {

    static int first = 0, second = 1, next;

    public static void main(String[] args) {
        System.out.println(first + "\n" + second);
        fibonacci(30);
    }
    public static void fibonacci(int count) {
        if (count > 2) {
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
            fibonacci(count - 1);
        }
    }

}
