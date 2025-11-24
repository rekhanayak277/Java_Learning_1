package LoopPrograms_DecisionStatements;

// Print even numbers from 2 to 20 (for loop)

public class EvenNumbers_For {

    public static void main(String[] args) {
        /*
        Logic here:
        Print - 2 4 6 8 10 11 12 14 16 18 20
        only even numbers, so increment has to be +2
         */





     // 1st way -

    for (int num = 2; num<=20; num+=2) //(initialization ; Condition ; Update)
        {
        System.out.println( num); //Statement
        }
        System.out.println("This is the statement after for loop");




    // 2nd way -

        for (int number = 0; number<= 20; number++) //(initialization ; Condition ; Update)
        {
            if (number % 2 == 0) {


                System.out.println( number); //Statement
            }
        }
        System.out.println("This is the statement after for loop");


    }

    }