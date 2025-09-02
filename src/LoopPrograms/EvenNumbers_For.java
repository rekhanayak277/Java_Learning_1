package LoopPrograms;

public class EvenNumbers_For {

    public static void main(String[] args) {
        /*
        even numbers from 2 to 20?
        Logic here:
        Print - 2 4 6 8 10 11 12 14 16 18 20
        only even numbers, so increment has to be +2
         */

    for (int i = 2; i<=20; i=i+2)
        {
        System.out.println(i);
        }
        System.out.println("This is the statement after for loop");
    }
}