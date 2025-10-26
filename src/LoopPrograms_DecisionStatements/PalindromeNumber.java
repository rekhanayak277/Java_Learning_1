package LoopPrograms_DecisionStatements;

// Java program to find Palindrome number

public class PalindromeNumber {

    public static void main(String[] args) {

        int num =  12121 ; // check if this is palindrome number

        int  originalNum = num ; // to store the original number

        int revNum = 0 ; // declare the variable to store the reverse number

        while (num > 0 ) {  // condition

            int newNum = num % 10 ; // to get the last digit

            revNum = revNum * 10 + newNum ; // to create reverse number

            num = num / 10 ; // to remove the last digit

    }
        if (originalNum == revNum) {

            System.out.println(originalNum + " is a Palindrome Number");
        }

        else {

            System.out.println(originalNum + " is not a Palindrome Number");
        }
             }
}
