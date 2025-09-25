package LoopPrograms_DecisionStatements;

public class OddNumbers_For {

            public static void main(String[] args) {
        /*
        odd numbers from 2 to 20?
        Logic here:
        Print - 3 5 7 9 11 13 15 17 19
        only odd numbers, so increment has to be +2
         */

            for (int i=2; i<=20; i++) //(initialization ; condition;update)
            {
                if (i%2!=0) { //condition

                System.out.println(i); //statement
                }
            }
            System.out.println("This is the statement after for loop"); //statement
        }
    }

