package LoopPrograms_DecisionStatements;

// while loop : Print a multiplication table from 1 to 10,
 //but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.


public class MultiplicationTable1To10WithLabelledBreak_WhileLoop {

    public static void main(String[] args) {

        int num1 =1 ;  // initialization

        outerloop :

        while (num1<10) // first while loop - condition

        {
            int num2 = 1; //initializtion

            while (num2 <= 10) // second while loop - condition
            {
                int r = num1 * num2; // creating table

                if (r > 30 && r % 7 == 0) // condition
                {
                    break outerloop;  // labelled break
                }

                System.out.println(num1 + "*" + num2 + "=" +r); // statement

                num1++; // update - outer loop
            }

            num2++; // update - inner loop
        }

    }
}
