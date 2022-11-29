package lesson13;
import java.util.Scanner;
public class FibonacciNumber {

    /**
     * The Fibonacci numbers uniquely denoted by the F(n) form of the sequence are called the Fibonacci sequence
     * so that all numbers are the sum of two lavi ones, starting from 0 and 1. That is,
     * F(0) = 0, F(1) = 1
     * F(n) = F(n – 1) + F(n – 2), for n > 1.
     */

    public static void main(String[] args) {
        System.out.println("Enter a number from 2 to 50:");
        Scanner scanner  = new Scanner(System.in);
        fib(scanner.nextInt());
    }

    public static void fib(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("Fibonacci numbers: " + fib[0] + ", " + fib[1] + ", ");
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + ", ");
        }

    }

}