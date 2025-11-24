package LoopPrograms_DecisionStatements;

//     Generate Fibonacci Series up to 6 terms (for loop)

public class FibonacciSeries_ForLoop {


    public static void main(String[] args) {

       // int count = 6 ; // declaring for count in the series

        int firstDigit = 0 ;  // first count in the series

        int secondDigit = 1 ; // second count in the series

               for (int i = 1 ; i <=6 ; i++) {  // initialisation, condition, update

            System.out.println(firstDigit); // to print first number

            int sum = firstDigit + secondDigit; // adding first two numbers to get 3rd number

            firstDigit = secondDigit ; // updating teh first number to second number

             secondDigit = sum ;   // updating the 2nd number to 3rd number
        }

    }
}
