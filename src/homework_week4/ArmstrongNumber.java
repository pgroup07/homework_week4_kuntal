package homework_week4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

//Main method
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        ArmstrongMethod(num);//Calling method
    }
    /**
     * This method is use to find armstrong number
     * @param num
     */
    public static void ArmstrongMethod(int num) {
        int temp, totalDigit = 0, res = 0, rem, pow, i;
        /*
         *  function to calculate
         the sum of individual digits
         */
        temp = num;
        while (num > 0) {
            num = num / 10;
            totalDigit++;
        }
        num = temp;
        while (num > 0) {
            rem = num % 10;
            pow = 1;
            i = 0;
            while (i < totalDigit) {
                pow = pow * rem;
                i++;
            }
            res = res + pow;
            num = num / 10;
        }
             /*
             condition to check whether
             the value of P equals
              to user input or not.
            */
        if (res == temp) {
            System.out.println("\nArmstrong Number");
        } else {
            System.out.println("\nNot an Armstrong Number.");
        }
    }
}
