package LoopPrograms_DecisionStatements;

public class FibonacciSeries_ForLoop {

    // Write a program using for loop - Print Fibonacci Series using For Loop

    public static void main(String[] args) {

        int n = 12 ; // declaring for count in the series

        int a = 0 ;  // first count in the series

        int b = 1 ; // second count in the series

               for (int i = 1 ; i <= n ; i++) {  // initialisation, condition, update

            System.out.println(a); // to print first number

            int c = a + b; // adding first two numbers to get 3rd number

            a = b ; // updating teh first number to second number

             b = c ;   // updating the 2nd number to 3rd number
        }

    }
}
