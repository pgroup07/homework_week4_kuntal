package homework_week4;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 */

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.nextInt();//Calling instance method

    }

    public void nextInt() {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (count <= 10) {
            System.out.println("Enter number #" + count);

            boolean sc = scanner.hasNextInt();
            while ((scanner.hasNextInt() == false)) {
                System.out.println("Enter valid integer");
              //  scanner.next();
//            if (validateNumber) {
//                int number = scanner.nextInt();
//                sum += number;
//                count++;
//            } else {
//                System.out.println("Invalid number");
            }
            int number = scanner.nextInt();
            sum += number;
            count++;
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();

    }

}


