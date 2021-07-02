package Recursion;

public class Factorial {

    public static void main(String[] args) {
        double result = factorial(5);
        System.out.println(result);
    }
    public static double factorial(double number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

}
