package LoopPrograms_DecisionStatements;

public class PrimeNumbers1_100 {

    public static void main(String[] args) {
        /*
        Print Prime numbers between 1 - 100
        divisible by 1 and by itself only
        and not any other number

        Logic - outer loop for 1 - 100 count
        inner loop to check if the number is divisible by 2 and n-1

         */


        for (int n = 2; n <= 100; n++) { //initialization & condition & update

            int count = 0;

            for (int i = 2; i < n; i++) { // inner for loop // initialize, condition and update

                if (n % i == 0) { // to check if divisible ... a decision statement

                    count++; //update

                    break;
                }
            }

            if (count == 0) { // to check if prime ... a decision statement

                System.out.println(n);
            }
        }
    }
}














