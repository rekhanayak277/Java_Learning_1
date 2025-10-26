package LoopPrograms_DecisionStatements;

public class ReverseTheNumber {

    // program to reverse the given number input=14578 , output=87541 using logic inside method

    /* Logic here
    Given number = 14578

    Reverse Number should be = 87541

    Initialize reverse number to 0

   when number is > 0,
   get the last digit using modulus
   store the last digit in a variable
   now multiply the reverse number by 10 and add the last digit
   now remove the last digit from the number by dividing it by 10
     */

    public static void main(String[] args) {

        int n = 14578; //given number

        int r = 0; // to store each reversed number

        while (n >= 1) { //condition

                int i = n % 10;//to get the last digit

                r = r * 10 + i; //to store the last digit in reverse

                n = n / 10;
                ;// update - to remove last digit from the given number, so that modulus can be performed again


            }

            System.out.println("Reversed Number is " + r);

        }
    }

