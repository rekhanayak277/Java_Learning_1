package LoopPrograms_DecisionStatements;

// Sum of digits of a number (while loop)

public class SumOfDigitsOfANumber_WhileLoop {

    /*
    Logic here -

    initiate sum with 0;
    seperate the last digit using %10 and then add it to the sum;
    for iteration, divide the remaining number by 10
     */

    public static void main(String[] args) {


                int number = 123456; // storing the given number

                int sum = 0;   // for storing the sum of digits of given number

                int originalNumber = number; // Keep a copy for display

                while (number > 0) {

                    int digit = number % 10;  // to Get last digit

                    sum = sum + digit;        // Add it to sum

                    number = number / 10;     // Remove last digit
                }

                System.out.println("Sum of digits of " + originalNumber + " = " + sum);
            }
        }



