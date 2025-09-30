package LoopPrograms_DecisionStatements;

public class StopWhenDivisibleBy11 {

    //Print a number from 1 to 20, whenever the number is divisible by 11 then stop printing

    /* Print from 1 to 20
    logic to find the number divisible by 11
    use break*/

    public static void main(String[] args) {

       for (int i=1 ; i<=20 ; i+=1) {

           if (i%11==0){

               break;
           }

           System.out.println(i);
       }



    }









  }



