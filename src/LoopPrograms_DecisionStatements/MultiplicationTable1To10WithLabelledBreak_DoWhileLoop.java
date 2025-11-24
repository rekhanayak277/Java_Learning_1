package LoopPrograms_DecisionStatements;

public class MultiplicationTable1To10WithLabelledBreak_DoWhileLoop {

    public static void main(String[] args) {
        int num2 = 1; // initialisation

        outerloop:

        do {
            int num1 = 1; // initialization - first do while loop

            do {

                int r = num2 * num1; // for table

                if (r > 30 && r % 7 == 0) // condititon

                {
                    break outerloop; // labelled break

                }

                System.out.println(num1 + "*" + num2 + "=" + r); // statement

                num1++; // update - inner loop
            }
            while (num1 <= 10); // second do while loop - condition

            num2++; // update - outer loop
        }
        while (num2< 10);  // first do while loop - condition
    }

}