package LoopPrograms_DecisionStatements;

public class ReverseTheNumberUsingMethod {

    // program to reverse the given number input=14578 , output=87541 using logic inside method


    static int input = 14578;
    public static int reverseNumber(int givenNumber) {

        int reversedNumber = 0;

        while (givenNumber != 0) {

            int digit = givenNumber % 10;

            reversedNumber = reversedNumber * 10 + digit;

            givenNumber = givenNumber / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        int output = reverseNumber(input);

        System.out.println("Reversed number: " + output);
    }
}