package homework_week4;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        MaxMin();//Calling method
    }

    /**
     * This static method is used to find min and max number
     */
    public static void MaxMin() {
        int currentMax = Integer.MIN_VALUE;
        int currentMin = Integer.MAX_VALUE;
        int intInput = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers");
        while (input.hasNextInt()) {
            intInput = input.nextInt();

            if (intInput < currentMin) currentMin = intInput;
            if (intInput > currentMax) currentMax = intInput;

        }
        System.out.println("currentmin is " + currentMin);
        System.out.println("currentmax is " + currentMax);
    }

}
