package mock;

public class Program_001 {

    public static void main(String[] args) {

        int x = 5;

        x = x++ + ++x;

        /*  x = 5/
        post increment - use 5 and then x = 6
        next is pre increment - x becomes 7 and then get used
         */

        System.out.println(x);    // should be 12.

    }
}
