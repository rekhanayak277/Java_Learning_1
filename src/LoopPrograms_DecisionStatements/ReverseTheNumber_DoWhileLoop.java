package LoopPrograms_DecisionStatements;

public class ReverseTheNumber_DoWhileLoop {

    public static void main(String[] args) {

        int givenNumber = 100987;

        int num = givenNumber;

        int reverse = 0;

        do {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10 ;
        }

        while (num >=1) ;

        System.out.println("the reverse of " + givenNumber + " is " + reverse);
    }
}
