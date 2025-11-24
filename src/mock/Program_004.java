package mock;

// Number of digits in a given number - 278567

public class Program_004 {

    public static void main(String[] args) {

     /*   int givenNumber = 278567;  // intialising the number

        int num = givenNumber;

        int count = 0;   // defined for iteration


        while (num > 1) {

            num = num / 10;

            count++;


        }

        System.out.println(" Number of digits in the given number " + givenNumber + " is - " + count);

  */

    int numGiven = 278567;

    int num2 = numGiven;

    int count_1= 0;

    for ( ; num2 >1 ; count_1++ ) {

        num2 = num2 / 10;
    }
        System.out.println(" Number of digits in the given number " + numGiven + " is - " + count_1);


    int number = 278567;

    int num3 = number;

    int count_2 = 0;

    do {

        System.out.println(" Number of digits in the given number " + number + " is " + count_2);

        count_2++;

    }

    while (num3 >1);

    }

    }


