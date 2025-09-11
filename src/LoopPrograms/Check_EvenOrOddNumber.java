package LoopPrograms;

public class Check_EvenOrOddNumber {

    public static void main(String[] args) {

      /*  take a range of numbers, say 1-70

           use for loop and if-else decision statement
       */


          for (int i=1 ; i<=70;i++)

          {
              if (i%2==0) {
                  System.out.println(i + " is an even number");
              }

              else {
                  System.out.println(i + " is an odd number");
              }
          }


    }
}
