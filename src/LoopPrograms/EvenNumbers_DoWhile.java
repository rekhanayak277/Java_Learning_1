package LoopPrograms;

public class EvenNumbers_DoWhile {
 /*
        even numbers from 2 to 20?
        Logic here:
        Print - 2 and then 4 6 8 10 11 12 14 16 18 20
        only even numbers, so increment has to be +2
         */


    public static void main(String[] args) {

        int n=2; // Initialization

        do {
            System.out.println(n); //Statement

            n=n+2; // Update
        }
        while (n<=20); //condition
    }
}
