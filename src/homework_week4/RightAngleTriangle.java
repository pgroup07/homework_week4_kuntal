package homework_week4;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        triangle(n);//method calling

    }

    /**
     * This method is use to print right angle triangle
     *
     * @param n
     */

    public static void triangle(int n) {
        int a, b;

        // outer loop to handle number of rows
        for (a = 0; a < n; a++) {
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (b = 0; b <= a; b++) {
                System.out.print("@");
            }
            // end-line
            System.out.println();
        }
    }
}
