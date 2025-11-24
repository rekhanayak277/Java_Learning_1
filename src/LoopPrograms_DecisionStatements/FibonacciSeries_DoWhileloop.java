package LoopPrograms_DecisionStatements;

// Generate Fibonacci Series up to 6 terms (DoWhile loop)


public class FibonacciSeries_DoWhileloop {

    public static void main(String[] args) {

       // int count = 6;

        int firstNum = 0;

        int secondNum = 1;

        int i=0;

        do {

            System.out.println(firstNum);   //  0 1 1 2 3 5

            int sum = firstNum + secondNum;  //  0+1 , 1+1 , 1+2 , 2+3 , 3+5 , 5+8

            firstNum = secondNum;   //  1 1 2 3 5 8

            secondNum = sum; // 1 2 3 5 8 13

            i++; // 1 2 3 4 5 6

        }

        while (i<=5); // or i < count   //


    }

}

