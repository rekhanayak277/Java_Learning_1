package LoopPrograms_DecisionStatements;

import java.sql.SQLOutput;

public class FibonacciNumbers_While {

    //Generate Fibonacci Series up to 6 terms (while loop)

    /* Fibonacci series is a series of numbers where the second number is the sum of the two previous numbers
                Print - 0 1 1 2 3 5

          Logic here:
          Define 1 variable to store the terms to be printed
          Define 2 variables to store the first two numbers of the series
          Print the first two numbers
         use loop for times for the next 6 numbers in the series
         In each iteration, calculate the next number by adding the previous two numbers
         */

    public static void main(String[] args) {

        int n = 0; // Number of Fibonacci terms to generate

        int first = 0; // first number of teh series initialized

        int second = 1; // second number of the series initialized


        while (n<6) { //Condition

            System.out.println(first);

            int sum = first + second;

            first = second;

            second = sum;

            n++; // Increment for the loop


        }
    }

}


