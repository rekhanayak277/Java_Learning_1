package LoopPrograms_DecisionStatements;

public class ContinueProgram_01 {

    public static void main(String[] args) {


        //Write a program to print even numbers from 1 to 20.
        //Whenever the value is greater than 6 and less than 11, then do not print the value.
    /*
    Print even numbers
    if number> 6 && number <11, don't print (8 and 10 should not get printed)
     */

         for (int num=2 ; num<=20 ; num+=2) //initialization , condition , update
         {
             if (num>6 && num<11) //condition to skip 8 & 10
             {
                 continue; // to continue the remaining iterations
             }

             System.out.println(num); //statement to print
         }
    }
}
