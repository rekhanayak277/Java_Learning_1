package Operators.IncrementDecrementOperator;

public class Program_04 {

    // int x = 1, y=10, z=100;
    // int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
    //        System.out.println("x="+x);
    //        System.out.println("y="+y);
    //        System.out.println("z="+z);
    //        System.out.println("i="+i);

    public static void main(String[] args) {

        int x = 1 ,  y = 10 , z = 100;

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

         // i = 0   + 10 - 100  -  98 + 12  +1  + 12  +2 -> 37-198 = -161



           System.out.println("x="+x); //-2
           System.out.println("y="+y); //11
           System.out.println("z="+z); //98
           System.out.println("i="+i); //19
    }
}
// x = -2     y=11   z = 98