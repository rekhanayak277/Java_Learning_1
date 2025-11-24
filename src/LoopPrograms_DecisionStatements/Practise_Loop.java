package LoopPrograms_DecisionStatements;

public class Practise_Loop {

    // print odd number from 2 to 20 (for loop)

    // to check if number is an armstrong number

    // find factorial of a number

    // to find the number of digits in a number

    // Program: Fizz-Buzz range from 1-50

    // To find the reverse of given number

    // To find the reverse of given number - using method


     static int input = 123654789;

    static int reversed(int number) {

        int reverse = 0;

       while (number >= 1) {

          //  for ( ; number >=1; number = number/ 10) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

           number = number / 10;

        }

        return (reverse);

    }

    public static void main(String[] args) {

        System.out.println("The given number is " + input);

        int output = reversed(input);

        System.out.println("Reverse of input is " + reversed(input));

    }

}














