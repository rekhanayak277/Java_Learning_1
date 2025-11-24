package LoopPrograms_DecisionStatements;

import java.sql.SQLOutput;

public class FibonacciNumbers_While {

    //Generate Fibonacci Series up to 6 terms (while loop)

    /* Fibonacci series is a series of numbers where the second number is the sum of the two previous numbers
                Print - 0 1 1 2 3 5

          Logic here:
          Define 1 variable to store the count = 6
          Define 2 variables to store the first two numbers of the series
          Print the first two numbers
         use loop for times for the next 6 numbers in the series
         In each iteration, calculate the next number by adding the previous two numbers
         */

    public static void main(String[] args) {

        int count = 0; // Number of Fibonacci terms to generate

        int num1 = 0; // first number of teh series initialized

        int num2 = 1; // second number of the series initialized


        while (count<6) { //Condition

            System.out.println(num1);

            int sum = num1 + num2;

            num1 = num2;

            num2 = sum;

            count++; // Increment for the loop


        }
    }

}


