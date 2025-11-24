package LoopPrograms_DecisionStatements;

public class ReverseTheNumber_ForLoop {

    public static void main(String[] args) {

        int givenNumber = 1020308;

        int number = givenNumber;

        int reverse = 0 ;

        for (  ; number >=1 ; number = number / 10) {

            int digit = number % 10 ;

            reverse = reverse * 10 + digit ;

        }

        System.out.println(" reversed number of " + givenNumber + " is " + reverse);
    }
}
