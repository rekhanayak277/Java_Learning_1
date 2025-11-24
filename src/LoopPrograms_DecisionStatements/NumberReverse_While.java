package LoopPrograms_DecisionStatements;

public class NumberReverse_While {
/*
         Reverse order 10 to 1
        Logic here:
        Print - 10 9 8 7 6 5 4 3 2 1
        reverse order, so decrement has to be by 1
         */

    public static void main(String[] args) {

        int number=10; //Initialization

        while(number>=1){ //Condition

            System.out.println(number); //print the statement

            number-=1; //update
        }
        System.out.println("End of while loop"); //out of the loop statement
    }
}
