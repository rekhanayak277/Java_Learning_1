package LoopPrograms_DecisionStatements;

// for loop : Print a multiplication table from 1 to 10, but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.

public class MultiplicationTable1To10WithLabelledBreak_ForLoop {

    public static void main(String[] args) {

        outerloop:

        for (int i = 1; i < 10; i++) // first for loop

        {
            for (int n = 1; n <= 10; n+=1) // second for loop
            {
                int r = n * i; // fpr multiplication table


                if (r > 30 && r % 7 == 0) // condition

                {
                    break outerloop; // labelled break

                }
                System.out.println( n + "*" + i + "=" + r);
            }
        }

    }

}
