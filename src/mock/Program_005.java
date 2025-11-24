package mock;

// Fibonacci series

public class Program_005 {

    // fibonacci series - 0 1 1 2 3 5 8 13 21 ....


    public static void main(String[] args) {

        int num1 = 0 ; // first number of the series

        int num2 = 1; // second number of the series

        int count = 9;  // up to 10 fibonacci numbers


        for ( int i = 0 ; i<count ; i++) { //initialisation , condition. update

            System.out.println(num1); // to print the first number of the series

            int sum = num1+num2 ; //  //  to find the third number

            num1 = num2; // to make the second number as first number

            num2 = sum; // to make the third number as second number


        }


    }
}
