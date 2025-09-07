package LoopPrograms;

public class EvenNumbers_While {

    public static void main(String[] args) {
                /*
        even numbers from 2 to 20?
        Logic here:
        Print - 2 4 6 8 10 11 12 14 16 18 20
        only even numbers, so increment has to be +2
         */
    int i=2; // initialization

    while (i<=20){  //Condition

        System.out.println(i); //Statement

        i=i+2; // Update
    }

        System.out.println("Printed the even numbers from 2 to 20");

    }
}
