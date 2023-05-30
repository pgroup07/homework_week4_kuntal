package homework_week4;

/**
 * Display left angle triangle of * using nested for loops
 */

public class LeftAngleTriangle {
    public static void main(String[] args) {
        LeftPattern(5);//Calling static method
    }

    /**
     * This is static method use to print left angle triange
     * @param a
     */
    public static void LeftPattern(int a) {

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
