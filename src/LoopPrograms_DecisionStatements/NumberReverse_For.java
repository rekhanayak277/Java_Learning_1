package LoopPrograms_DecisionStatements;

// Print numbers from 10 down to 1 (for loop)

public class NumberReverse_For {

    public static void main(String[] args) {
    /*
        Logic here:
        Print - 10 9 8 7 6 5 4 3 2 1
        reverse order, so decrement has to be by 1
         */
        {

            for (int num = 10; num > 0; num-=1) {  //(initialization; Condition ; Update)

                System.out.println(num); //Statement
            }
            System.out.println("Numbers are printed in reverse order");
        }
    }
}