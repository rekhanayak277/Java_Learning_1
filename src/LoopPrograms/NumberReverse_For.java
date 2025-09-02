package LoopPrograms;

public class NumberReverse_For {

    public static void main(String[] args) {
    /*
         Reverse order 10 to 1
        Logic here:
        Print - 10 9 8 7 6 5 4 3 2 1
        reverse order, so decrement has to be by 1
         */
        {

            for (int i = 10; i > 0; i = i - 1) {
                System.out.println(i);
            }
            System.out.println("Numbers are printed in reverse order");
        }
    }
}