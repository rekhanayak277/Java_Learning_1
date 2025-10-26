package LoopPrograms_DecisionStatements;

//Write a program using for loop - Sum of Digits in a Number

public class SumOfDigitsOfANumber_Forloop {

    public static void main(String[] args) {

        int number = 123456;  // Given number

        int sum = 0; //  Variable to store the sum


        for (int eachdigit = number ; eachdigit > 0 ; eachdigit = eachdigit/10 ) {   //initialization , condition. update

            sum = sum + eachdigit % 10;
        }

        System.out.println("Sum of digits: " + sum); // statement

    }
}
