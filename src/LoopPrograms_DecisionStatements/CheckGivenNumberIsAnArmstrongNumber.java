package LoopPrograms_DecisionStatements;

// Write a program using for loop - Check if Number is Armstrong

public class CheckGivenNumberIsAnArmstrongNumber {

    public static void main(String[] args) {
        int n = 1634; // given number

        int s = 0; // storing sum of quadrates

        int first_n = n; //to store the original number as it is

        while (n>=1) {

            int i =n%10;  // to get teh last digit

            s = s+ (i*i*i*i);  // sum of quadrates for each digit

            n = n/10; // to remove last digit - update

            }

        if (s==first_n) {

            System.out.println(first_n + " is an Armstrong Number");
        }
    }

}
