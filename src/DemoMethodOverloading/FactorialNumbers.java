package DemoMethodOverloading;

// Find the factorial of a number

public class FactorialNumbers {


        public static int factorial(int number) {     // Method declared to calculate factorial using recursion

            if (number == 0 || number == 1)    // bcz factorial of 0 & 1 is 1

                return 1;

            else

                return number * factorial(number-1);  // Recursive call
        }

        public static void main(String[] args) {

            int count = 5;  // up to 5 factorial numbers

             int result = factorial(count);

            System.out.println("Factorial of " + count + " = " + result);
        }
    }


