package LoopPrograms_DecisionStatements;

public class FizzBuzzNumber_IfElse {

    public static void main(String[] args) {

        /*
        If divisible by 2 - Fizz
        If divisible by 5 - Buzz
        If divisible by both 2 & 5- FizzBuzz (use && operator, where it needs to satisfy 2 conditions)
        If none, put that number in else statement
         */

        for (int number = 1; number <= 50; number+=1) //initialization
        {

             if (number%2==0 && number%5==0) //Condition
        {
            System.out.println(number+"-FizzBuzz"); //statement
        }


          if (number%2==0) //Condition
        {
                System.out.println(number+"-Fizz");//statement

            }

         else if (number%5==0) //Condition
            {
                 System.out.println(number+"-Buzz"); //statement
               }

         else {
            System.out.println(number); //statement
        }
    }}}