package LoopPrograms_DecisionStatements;

public class FizzBuzzNumber_IfElse {

    public static void main(String[] args) {

        /*
        If divisible by 2 - Fizz
        If divisible by 5 - Buzz
        If divisible by both 2 & 5- FizzBuzz (use && operator, where it needs to satisfy 2 conditions)
        If none, put that number in else statement
         */

        for (int n = 1; n <= 50; n+=1) //initialization
        {

             if (n%2==0 && n%5==0) //Condition
        {
            System.out.println(n+"-FizzBuzz"); //statement
        }


          if (n%2==0) //Condition
        {
                System.out.println(n+"-Fizz");//statement

            }

         else if (n%5==0) //Condition
            {
                 System.out.println(n+"-Buzz"); //statement
               }

         else {
            System.out.println(n + "- not divisible by 2 or 5"); //statement
        }
    }}}