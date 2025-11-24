package LoopPrograms_DecisionStatements;

// Print even numbers from 2 to 20 (while loop)

public class EvenNumbers_While {

    public static void main(String[] args) {

        /*
        Logic here:
        Print - 2 4 6 8 10 11 12 14 16 18 20
        only even numbers, so increment has to be +2
       */

     // 1st way -

    int number=2; // initialization

    while (number<=20){  //Condition

        System.out.println(number); //Statement

        number+=2; // Update
    }

        System.out.println("Printed the even numbers from 2 to 20");

    }

    }








