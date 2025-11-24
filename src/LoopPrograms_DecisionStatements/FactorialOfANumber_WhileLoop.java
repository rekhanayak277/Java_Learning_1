package LoopPrograms_DecisionStatements;

public class FactorialOfANumber_WhileLoop {

    public static void main(String[] args) {

        int num1 = 10;

        int factorial = 1;

        int count = 1;

        while ( count <= num1) {

            factorial = factorial * count;


            count++;

        }

        System.out.println(" Factorial of " + num1 + " is " + factorial);

    }
}
