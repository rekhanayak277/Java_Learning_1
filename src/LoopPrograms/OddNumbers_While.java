package LoopPrograms;

public class OddNumbers_While {
     /*
        odd numbers from 2 to 20?
        Logic here:
        Print - 3 5 7 9 11 13 15 17 19
        only odd numbers, so increment has to be +2
         */

    public static void main(String[] args) {
        int a=2;

        while(a<=20){

            if (a%2==1) {

                System.out.println(a);
            }

            a=a+1;
        }
        System.out.println("While loop ends here");
    }
}
