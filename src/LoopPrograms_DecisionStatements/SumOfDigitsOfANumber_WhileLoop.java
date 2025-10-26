package LoopPrograms_DecisionStatements;

public class SumOfDigitsOfANumber_WhileLoop {

    public static void main(String[] args) {

            int num = 987654321; //given

        int sum = 0 ; // initialization for the variable to store sum of the sigits

        while (num > 0) { // condition

            sum =  sum + num%10;

            num = num / 10; // update
        }

        System.out.println("Sum of the given digits is; " + sum);

    }

}
