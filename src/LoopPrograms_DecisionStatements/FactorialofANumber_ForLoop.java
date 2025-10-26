package LoopPrograms_DecisionStatements;

public class FactorialofANumber_ForLoop {

    // Write a program using for loop - Find Factorial of a Number

    public static void main(String[] args) {


        int n = 10 ;  // to find 10!

        int f = 1; // initialize teh variable for factorial

        for  ( int i = 1; i <= n ; i++) { // initialization , condition , update

            f = f * i;

        }
                System.out.println("Factorial of " + n + " is: " + f);
    }
}
