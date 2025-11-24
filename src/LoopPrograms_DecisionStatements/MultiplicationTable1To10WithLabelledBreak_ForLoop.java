package LoopPrograms_DecisionStatements;

// for loop : Print a multiplication table from 1 to 10, but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.

public class MultiplicationTable1To10WithLabelledBreak_ForLoop {

    public static void main(String[] args) {

        outerloop:

        for (int num1 = 1; num1 < 10; num1++) // first for - loop

        {
            for (int num2= 1; num2 <= 10; num2+=1) // second for - loop
            {
                int r = num1 * num2; // fpr multiplication table


                if (r > 30 && r % 7 == 0) // condition

                {
                    break outerloop; // labelled break

                }
                System.out.println( num1 + "*" + num2 + "=" + r);
            }
        }

    }

}
