package LoopPrograms_DecisionStatements;

public class ReverseTheNumber_WhileLoop {

    public static void main(String[] args) {


        int givenNumber = 76589904;

        int number = givenNumber ;

        int reverse = 0 ;

        while ( number >=1) {

             int digit = number % 10;

             reverse = reverse * 10 + digit;

             number = number/10;

        }

        System.out.println("Reverse of " + givenNumber + " is " + reverse);
    }
}
