package LoopPrograms_DecisionStatements;

public class FactorialOfANumber_DoWhileLoop {

    public static void main(String[] args) {

        int num1 = 6;

        int factorial = 1;

        int num=1;

        do {

            factorial = factorial * num;

            num++;
        }

        while ( num<=num1);

        System.out.println(" Factorial of " + num1 + " is " + factorial);
    }



}
