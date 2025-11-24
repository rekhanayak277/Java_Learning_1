package LoopPrograms_DecisionStatements;

public class NumberOfDigitsInAGivenNumber_ForLoop {

    public static void main(String[] args) {

        int givenNumber = 145785;

        int number = givenNumber;

        int count = 1;

        for (; count <= number ; count++) {

            number = number / 10 ;
        }

        System.out.println("Number of digits in the" + givenNumber + " is - " + count);
    }
}
