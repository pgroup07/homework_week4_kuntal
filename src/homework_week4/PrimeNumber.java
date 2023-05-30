package homework_week4;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */

public class PrimeNumber {
    //MAin method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
            //Checking prime number or not
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    /**
     * This method use for Prime or not base on number
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
