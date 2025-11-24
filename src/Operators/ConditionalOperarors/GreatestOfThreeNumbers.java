package Operators.ConditionalOperarors;

// Write a program to find the greatest of 3 numbers using conditional operator

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 25;
        int num3 = 30;

        // Using the conditional operator to find the maximum
        int greatest = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num3 ? num2 : num3);


        System.out.println("The greatest of three numbers is: " + greatest); // should be 20
    }
}


