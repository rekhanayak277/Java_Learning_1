package LoopPrograms_DecisionStatements;
import java.util.Scanner;

// Switch : Create a calculator program that asks the user to enter two numbers and an operator (+, -, *, /).
// Use a switch statement to perform the operation and print the result.
// Handle division by zero with an appropriate message.

public class CalculatorProgramUsingSwitch {

    public static void main(String[] args) {

        int one = 5;
        int two = 10;

        char operator = '+';


        switch (operator) {
            case '+':
                System.out.println("Addition of given numbers is: " + (one + two));
                break;
            case '-':
                System.out.println("Subtraction of given numbers is: " + (one - two));
                break;
            case '*':
                System.out.println("Multiplication of given numbers is: " + (one * two));
                break;
            case '/':
                if (two == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division of given numbers is: " + (one / two));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");


        }
    }
}