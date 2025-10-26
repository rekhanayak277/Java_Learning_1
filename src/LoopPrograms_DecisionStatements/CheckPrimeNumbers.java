// Write a program to find if a number is prime or not. Numbers: 4, 7, 11, 13, 20

package LoopPrograms_DecisionStatements;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        // Check number 4
        int number = 4;
        int count = 0;
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Check number 7
        number = 7;
        count = 0;
        i = 1;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Check number 11
        number = 11;
        count = 0;
        i = 1;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Check number 13
        number = 13;
        count = 0;
        i = 1;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Check number 20
        number = 20;
        count = 0;
        i = 1;
        while (i <= number) {
            if (number % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
