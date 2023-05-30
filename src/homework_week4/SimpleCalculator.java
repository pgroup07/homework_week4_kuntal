package homework_week4;

/**
 * 18. Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 */

public class SimpleCalculator {
    // Instance variable
    double firstNumber;
    double secondNumber;
    //Get firstnumber

    public double getFirstNumber() {
        return firstNumber;
    }

    //Get second number
    public double getSecondNumber() {
        return secondNumber;
    }

    // Set firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Set SECOND NUMBER
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // This method is use to get ADDITION result
    public double getAdditionResult() {
        return firstNumber + secondNumber;

    }

    // This method is use to get Subtraction result
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    // This method is use to get Multiplication result

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    // This method is use to get Division result

    public double getDivisionResult() {
        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    //Main method
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
