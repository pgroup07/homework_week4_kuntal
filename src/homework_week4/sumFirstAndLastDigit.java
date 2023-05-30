package homework_week4;

import java.util.Scanner;

public class sumFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        sumFirstAndLastDigit(number);
        System.out.println(sumFirstAndLastDigit(number));// Printing Value

    }

    /**
     * This method is use to find sum of First number and last number
     * @param number
     * @return
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;

        }

        return (number + lastDigit);

    } // end of sumFirstAndLastDigit method
}

