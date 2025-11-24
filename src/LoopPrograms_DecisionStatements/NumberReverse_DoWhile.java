package LoopPrograms_DecisionStatements;

// Print numbers from 10 down to 1 (do-while loop)

public class NumberReverse_DoWhile {

    public static void main(String[] args) {

        int number = 10; // initialization

        do {
            System.out.println(number); //statement

            number--; //update
        }
        while (number>=1); // condition
    }
}
