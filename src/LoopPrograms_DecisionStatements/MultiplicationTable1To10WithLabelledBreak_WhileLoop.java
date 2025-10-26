package LoopPrograms_DecisionStatements;

// while loop : Print a multiplication table from 1 to 10, but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.


public class MultiplicationTable1To10WithLabelledBreak_WhileLoop {

    public static void main(String[] args) {

        int i =1 ;  // initialization

        outerloop :

        while (i <10) // first while loop - condition

        {
            int n = 1; //initializtion

            while (n <= 10) // second while loop - condition
            {
                int r = n * i; // creating table

                if (r > 30 && r % 7 == 0) // condition
                {
                    break outerloop;  // labelled break
                }

                System.out.println(n + "*" + i + "=" +r); // statement

                n++; // update - outer loop
            }

            i++; // update - inner loop
        }

    }
}
