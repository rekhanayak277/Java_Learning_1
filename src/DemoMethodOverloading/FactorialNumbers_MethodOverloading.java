package DemoMethodOverloading;

//Factorial num:
//Create a method factorial(int n) to find factorial using recursion.
//Overload it with factorial(double n) to find factorial but return result as double.

public class FactorialNumbers_MethodOverloading {

    /*

    create one method (int)
    use if else - decision statement for base(0 & 1) condition and for the remaining numbers
    overload the method using variable type double
    store the number for factorial in a variable (int and double)
    store the method calling result in one more variable (int and double)
    use print statements
     */

    public static int factorial(int number) {

        if (number == 1 || number == 0) {

            return 1;

        }

        else {

            return number * factorial(number - 1);
        }

    }

    public static double factorial(double number) {

        if (number == 1.0 || number == 0.0) {

            return 1.0;

        }

        else {

            return number * factorial(number - 1.0);
        }

    }


    public static void main(String[] args) {

        int count = 6;

        double count1= 6.0;  // 6 factorial

        int result = factorial(count);  // first method calling

        double result1 = factorial(count1) ; // overloaded method calling

        System.out.println("Factorial of  " + count + " is "+ result);  // statement for 1st method calling

        System.out.println("Factorial of  " + count1 + " is "+ result1);  // statement for overloaded method calling
    }
    }

