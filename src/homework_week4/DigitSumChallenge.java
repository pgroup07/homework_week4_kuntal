package homework_week4;

import java.util.Scanner;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value
 */

public class DigitSumChallenge {
    int digit = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        DigitSumChallenge obj = new DigitSumChallenge();//object creation
        obj.sumDigits(number); //Calling method
        System.out.println(obj.sumDigits(number));//print sum

    }

    /**
     * This method is used to find sum Digits number
     * @param number
     * @return
     */
    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            //executes until the condition becomes f
            while (number > 0) {
                //finds the last digit from the number and add it to the variable sum
                sum = sum + number % 10;
                //removes the last digit
                number = number / 10;
            }
            //returns the sum
            return sum;
        } else
            return -1;
    }

}


