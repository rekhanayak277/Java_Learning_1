package LoopPrograms_DecisionStatements;

import com.sun.tools.javac.Main;

public class SkipEvenNumbers_Program {

    /*
    Print a number from 1 to 20, whenever the number is even skip it.
     */
    // Print the numbers from 1 to 10
    // to skip the even numbers apply if condition
    // output should be 1,3,5,7,9,11,13,15,17,18,19


    public static void main(String[] args) {


        for (int num=1 ; num<=20 ; num++) {

            if (num%2!=1){

                continue;
            }

            System.out.println(num);
        }


    }


}
