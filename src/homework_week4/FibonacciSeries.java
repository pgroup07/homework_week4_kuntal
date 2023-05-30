package homework_week4;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " terms of Fibonacci series: "); //Print the fibonacci series
        Series(n);//Calling method

    }

    /**
     * This is static method.
     * @param n
     */
    public static void Series(int n) {
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
