package homework_week4;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        check();//Calling method
    }

    public static void check() {
        String inputLetter = "";
        System.out.println("I can tell you if a letter in the alphabet is a vowel or a consonant.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a alphabet: ");
        inputLetter = sc.next();

        if (inputLetter.length() == 1) {
            //convert inputLetter to lowercase
            inputLetter = inputLetter.toLowerCase();
            //is inputLetter between a and z and not a number or other char
            if (inputLetter.compareTo("a") >= 0) {
                if (inputLetter.equals("a") || inputLetter.equals("e") || inputLetter.equals("i") || inputLetter.equals("o") || inputLetter.equals("u")) {
                    System.out.println(inputLetter + " is a VOWEL.");
                } else {
                    System.out.println(inputLetter + " is a CONSONANT.");
                }

            } else {
                System.out.println(inputLetter + " is not valid. You might have entered something other then a to z. ");
            }
        } else {
            System.out.println(inputLetter + " is not valid. You either entered more then one letter. ");
        }
    }
}
