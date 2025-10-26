package LoopPrograms_DecisionStatements;

public class NumberofDigitsInAGivenNumber {

    // program to find the number of digits in a given number 14578

    /* Logic here -
    Given Number - 14578
    Count of Digits - 5
    When number is divided by 10. last digit is removed
    continue till number becomes 0
    initialize number=0
    use while loop
    every iteration increases it by 1
     */
    public static void main(String[] args) {

        int n = 14578; //given number

        int i=0; //count for digits - initialization

        while (n>=1){ // condition

            n = n/10; // to remove the last digit

            i++; //update


        }
        System.out.println("Number of digits in the given number 14578 is " + i); // statement
            }

}
