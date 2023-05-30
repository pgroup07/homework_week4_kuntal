package homework_week4;

import java.util.Scanner;

/**
 * Palindrome Number
 */

public class PalindromeNumber {
    int sum = 0, r;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = in.nextInt();
        // PalindromeNumber obj = new PalindromeNumber();
        //  reverse(number);
        isPalindrome(number);//Calling method
        System.out.println(isPalindrome(number));//Print Palindrome or not Number

    }

    /**
     * This method is used to reverse the number
     *
     * @param num
     * @return
     */

    public static int reverse(int num) {
        int res = 0;
        while (num != 0) {
            res = (res * 10) + (num % 10);
            num = num / 10;
        }
        return res;
    }

    /**
     * This mrthod is used to find num is palindrome or not
     *
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        if (num == 0) return false;
        return num == reverse(num);

    }
}
