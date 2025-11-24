package LoopPrograms_DecisionStatements;

public class CalculatorProgramUsingSwitch_Syntax2 {

           public static void main(String[] args) {

            int num1 = 12;
            int num2 = 3;
            char operator = '+'; // Try +, -, *, /

            System.out.println("Number 1: " + num1);

            System.out.println("Operator: " + operator);

            System.out.println("Number 2: " + num2);

            switch (operator) {

                case '+' -> System.out.println("Result: " + (num1 + num2));

                case '-' -> System.out.println("Result: " + (num1 - num2));

                case '*' -> System.out.println("Result: " + (num1 * num2));

                case '/' -> {

                    if (num2 != 0)

                        System.out.println("Result: " + (num1 / num2));

                    else
                        System.out.println("Error: Division by zero is not allowed!");

                }
                default -> System.out.println("Error: Invalid operator!");
            }
        }
    }
