package LoopPrograms_DecisionStatements.LoopPrograms;

public class Check_EvenOrOddNumber {

    public static void main(String[] args) {

      /*  take a range of numbers, say 1-70

           use for loop and if-else decision statement
       */


          for (int i=1 ; i<=70; i+=1) //initialization , condition, update

          {
              if (i%2==0) {  //condition
                  System.out.println(i + " is an even number"); //statement
              }

              else {
                  System.out.println(i + " is an odd number"); //else statement
              }
          }


    }
}
