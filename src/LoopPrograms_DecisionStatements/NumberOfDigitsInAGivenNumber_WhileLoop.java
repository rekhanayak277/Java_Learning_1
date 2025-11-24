package LoopPrograms_DecisionStatements;

public class NumberOfDigitsInAGivenNumber_WhileLoop {

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

        int number = 14578; //given number

        int counter =0; //count for digits - initialization

        while (number>=1){ // condition

            number = number/10; // to remove the last digit

            counter++; //update


        }
        System.out.println("Number of digits in the given number 14578 is " + counter); // statement
            }

}
