// Write a program to find if a number is prime or not. Numbers: 4, 7, 11, 13, 20

package LoopPrograms_DecisionStatements;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        // Check number 4
        int num = 4;
        int counter = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        // Check number 7
        num = 7;
        counter = 0;
        i = 1;
        while (i <= num) {
            if (num % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        // Check number 11
        num = 11;
        counter = 0;
        i = 1;
        while (i <= num) {
            if (num % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        // Check number 13
        num = 13;
        counter = 0;
        i = 1;
        while (i <= num) {
            if (num % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        // Check number 20
        num = 20;
        counter = 0;
        i = 1;
        while (i <= num) {
            if (num % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
