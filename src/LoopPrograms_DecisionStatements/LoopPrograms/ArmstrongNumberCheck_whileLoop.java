package LoopPrograms_DecisionStatements.LoopPrograms;

public class ArmstrongNumberCheck_whileLoop {

    public static void main(String[] args) {

        int givenNumber = 154;

        int sum = 0 ;

        int number = givenNumber;

        while (number>=1) {

            int i = number % 10;

            sum = sum + (i *i*i);

            number = number / 10;

        }

        if ( givenNumber == sum){

            System.out.println(givenNumber + " is an armstrong number");
        }

        else {

            System.out.println(givenNumber + " is not an armstrong number");
        }
    }
}
