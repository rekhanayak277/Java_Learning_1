package LoopPrograms_DecisionStatements;

public class FactorialofANumber_ForLoop {

    // Write a program using for loop - Find Factorial of a Number

    public static void main(String[] args) {


        int num = 10 ;  // to find 10!

        int factorial = 1; // initialize teh variable for factorial

        for  ( int i = 1; i <= num ; i++) { // initialization , condition , update

            factorial = factorial * i;

        }
                System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
