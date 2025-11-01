package LoopPrograms_DecisionStatements;

public class PractiseProgram {

   // Switch : Create a calculator program that asks the user to enter two numbers and an operator (+, -, *, /).
    // Use a switch statement to perform the operation and print the result.
    // Handle division by zero with an appropriate message.


    public static void main(String[] args) {
        int one = 20;
        int two = 10;

        char operator = '+';

        switch (operator) {

            case '+' :
               if (operator == '+') {
                   System.out.println("addition is : " + (one + two));
                   break;
               }
            case '-' :
                System.out.println("Subtraction is : " + (one - two));
                break;
            case '*' :
                System.out.println("Multiplication is : " + (one * two));
                break;
            case '/' :
                if (two == 0) {

                    System.out.println("Error");
                }
                else {
                    System.out.println("Division is : " + (one / two));
                }
                }

        }




}


