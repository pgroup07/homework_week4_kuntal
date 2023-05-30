package homework_week4;

import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        GetEvenDigitSum(number); //Calling method
        System.out.println(GetEvenDigitSum(number)); //Print sum of even number
    }
    /**
     * This method is used to find sum of even numbers
     * @param n
     * @return
     */
    public static int GetEvenDigitSum(int n) {
        int digit;
        int sum = 0;
        if (n > 0) {
            while (n != 0) {
                digit = n % 10;

                if (digit % 2 == 0)
                    sum = sum + digit;

                n = n / 10;
            }
            return sum;
        } else
            return -1;
    }
}
