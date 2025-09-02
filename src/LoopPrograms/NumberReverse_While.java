package LoopPrograms;

public class NumberReverse_While {
/*
         Reverse order 10 to 1
        Logic here:
        Print - 10 9 8 7 6 5 4 3 2 1
        reverse order, so decrement has to be by 1
         */

    public static void main(String[] args) {

        int n=10;

        while(n>=1){

            System.out.println(n);

            n=n-1;
        }
        System.out.println("End of while loop");
    }
}
