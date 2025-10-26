package LoopPrograms_DecisionStatements;

public class MultiplicationTable1To10WithLabelledBreak_DoWhileLoop {

    public static void main(String[] args) {
        int i = 1; // initialisation

        outerloop:

        do {
            int n = 1; // initialization - first do while loop

            do {

                int r = n * i; // for table

                if (r > 30 && r % 7 == 0) // condititon

                {
                    break outerloop; // labelled break

                }

                System.out.println(n + "*" + i + "=" + r); // statement

                n++; // update - inner loop
            }
            while (n <= 10); // second do while loop - condition

            i++; // update - outer loop
        }
        while (i < 10);  // first do while loop - condition
    }

}