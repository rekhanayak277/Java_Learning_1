package mock;

// Number of digits in a given number - 278567

public class Program_004 {

    public static void main(String[] args) {

        int givenNumber = 278567;    // intialising the number

        int count = 0;   // defined for iteration

        int originalNumber= 278567;  // to compare with the original


        while  ( givenNumber >1 ) {

            givenNumber = givenNumber / 10;

         count++;


        }

        System.out.println( " Number of digits in the given number "+ originalNumber + " is - "  + count) ;
    }

}
