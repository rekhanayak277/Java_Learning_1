package LoopPrograms_DecisionStatements;

public class NumberOfDigitsInAGivenNumber_DoWhileLoop {

    public static void main(String[] args) {


        int numGiven = 1234567;

        int num = numGiven;

        int counter = 0;


        do {

            num = num / 10;

            counter+=1;


        }

        while ( num >=1);

        System.out.println(" Number of digits in a " + numGiven + " is " + counter);

    }


}

