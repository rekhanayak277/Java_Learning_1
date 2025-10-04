package LoopPrograms_DecisionStatements;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {

            int num = 987654321; //init

        // ialization

            int digit = 0;

            while (num>=1) //condition
            {
                digit = digit + num%10;

                num = num/10; //update
            }
            System.out.println(digit);
    }

}
