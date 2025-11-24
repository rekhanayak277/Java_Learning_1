package LoopPrograms_DecisionStatements;

// Switch : Create a calculator program that asks the user to enter two numbers and an operator (+, -, *, /).
// Use a switch statement to perform the operation and print the result.
// Handle division by zero with an appropriate message.

public class CalculatorProgramUsingSwitch_Syntax1 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        char operator = '/';


        switch (operator) {
            case '+':
                System.out.println("Addition of given numbers is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of given numbers is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of given numbers is: " + (num1 * num2));
                break;
            case '/':
                if (num1 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division of given numbers is: " + (num2 / num1));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");


        }
    }
}

//