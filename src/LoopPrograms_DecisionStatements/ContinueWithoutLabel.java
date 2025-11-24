package LoopPrograms_DecisionStatements;

public class ContinueWithoutLabel {

    // Write a program to print from 1 to 50.
    // whenever the value is divisible by 13 then do not print the value.

    public static void main(String[] args) {
        /* Print from 1 to 50
        when the value is divisible by 13, skip to print.
        Print the remaining
         */

        for ( int num=1 ; num<=50 ; num+=1){ //initialisation ; condition ; update

            if (num%13==0) { // condition to skip multipliers of 13

                continue;
            }

            System.out.println(num); // statement to print
        }

    }


}
