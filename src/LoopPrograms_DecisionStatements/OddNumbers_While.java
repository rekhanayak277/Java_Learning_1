package LoopPrograms_DecisionStatements;

public class OddNumbers_While {
     /*
        odd numbers from 2 to 20?
        Logic here:
        Print - 3 5 7 9 11 13 15 17 19
        only odd numbers, so increment has to be +2
         */

    public static void main(String[] args) {
        int number=2;

        while(number<=20){

            if (number%2==1) {

                System.out.println(number);
            }

            number=number+1;
        }
        System.out.println("While loop ends here");
    }
}
