package homework_week4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */

public class DiamondPattern {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diamond Pattern Rows = ");
        int rows = sc.nextInt();
        MyPattern(rows);//Calling method

    }

    /**
     * This method is use to print pattern "Diamond"
     *
     * @param rows
     */
    public static void MyPattern(int rows) {
        int i, j, k;
        i = 1;
        while (i <= rows) {
            j = 1;
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= i * 2 - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while (i > 0) {
            j = 1;
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= i * 2 - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }

    }
}
