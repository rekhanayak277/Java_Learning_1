package LoopPrograms_DecisionStatements;

// Multiplication Table of a number 3 (for loop) - Single variable

public class TableOf3_For {

    /*
    Table of 3
        Logic here:
    Print - 3 6 9 12 15 18 21 24 27 30
    Use a variable, increment one int by 3
            */

    public static void main(String[] args) {
        for (int number=3; number<=30; number+=3){

            System.out.println( number);
        }

        System.out.println("Coming out of the loop");
    }

}
