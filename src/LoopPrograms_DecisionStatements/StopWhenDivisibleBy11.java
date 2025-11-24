package LoopPrograms_DecisionStatements;

public class StopWhenDivisibleBy11 {

    //Print a number from 1 to 20, whenever the number is divisible by 11 then stop printing

    /* Print from 1 to 20
    logic to find the number divisible by 11
    use break*/

    public static void main(String[] args) {

       for (int number=1 ; number<=20 ; number+=1) {

           if (number%11==0){

               break;
           }

           System.out.println(number);
       }



    }









  }



