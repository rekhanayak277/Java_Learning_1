package LoopPrograms_DecisionStatements;

public class ReverseTheNumberUsingMethod {

    // program to reverse the given number input=14578 , output=87541 using logic inside method


    static int input = 14578;
    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        System.out.println("Given number is: " + input);

        int output = reverse(input);

        System.out.println("Reversed number: " + output);
    }
}